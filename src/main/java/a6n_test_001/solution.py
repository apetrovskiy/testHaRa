##!/bin/python3

import math
import os
import random
import re
import sys

from urllib.request import urlopen
import json



#
# Complete the 'getUsernames' function below.
#
# The function is expected to return a STRING_ARRAY.
# The function accepts INTEGER threshold as parameter.
#
# URL for cut and paste
# https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
#

def getUsernames(threshold: int):
    # Write your code here
    def get_url(page_number: int):
        return "https://jsonmock.hackerrank.com/api/article_users?page={0}".format(page_number)
    
    class Author(object):
        def __init__(self, input_json):
            self.__dict__ = json.loads(input_json)
        
        id: int
        username: str
        about: str
        submitted: int
        updated_at: str
        submission_count: int
        comment_count: int
        created_at: str

    class Authors(object):
        def __init__(self, input_json):
            self.__dict__ = json.loads(input_json)
        
        page: int
        per_page: int
        total: int
        total_pages: int
        data: [Author]

    
    print(get_url(2))
    print(urlopen(get_url(1)))
    res = urlopen(get_url(1))
    bbb = res.read()
    print(bbb.decode("utf8"))
    
    print(json.loads(bbb))
    result = json.loads(bbb)
    # result2 = json.loads(res.read())
    result2 = Authors(bbb)
    res.close()

    print("11111")
    print(result)
    print(result2.page)
    print(result2.per_page)
    print(result2.total_pages)
    print(result2.data)
    print(result2.data[0])
    # print("2222")
    # print(result2)


if __name__ == '__main__':
    getUsernames(10)
