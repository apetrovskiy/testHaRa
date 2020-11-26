#!/bin/python3

import math
import os
import random
import re
import sys
import requests
import json
from typing import List


#
# Complete the 'getUsernames' function below.
#
# The function is expected to return a STRING_ARRAY.
# The function accepts INTEGER threshold as parameter.
#
# URL for cut and paste
# https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
#

class Record:
    def __init__(self, id: int, username: str, about: str, submitted: int, updated_at: str, submission_count: int, comment_count: int, created_at: str):
        self.id = id
        self.username = username
        self.about = about
        self.submitted = submitted
        self.updated_at = updated_at
        self.submission_count = submission_count
        self.comment_count = comment_count
        self.created_at = created_at


class Data(object):
    def __init__(self, page: int, per_page: int, total: int, total_pages: int, data: List[Record]):
        self.page = page
        self.per_page = per_page
        self.total = total
        self.total_pages = total_pages
        self.data = data


def getUsernames(threshold):
    page_number = 1
    result_list = []
    while True:
        response = requests.get(get_url(page_number))
        json_data = response.json()
        str_json_data = str(json_data).replace("'", '"')
        current_response = Data(**json.loads(str_json_data))
        data = current_response.data
        result_list.extend([Record(**json.loads(str(x).replace("'", '"'))).username for x in data if Record(**json.loads(str(x).replace("'", '"'))).submission_count > threshold])
        page_number = page_number + 1
        if page_number > current_response.total_pages:
            break
    return result_list
    
    
def get_url(page_number):
    return "https://jsonmock.hackerrank.com/api/article_users?page=" + str(page_number)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    threshold = int(input().strip())

    result = getUsernames(threshold)

    fptr.write('\n'.join(result))
    fptr.write('\n')

    fptr.close()
