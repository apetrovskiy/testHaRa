#!/bin/ruby

require 'json'
require 'stringio'



#
# Complete the 'getUsernames' function below.
#
# The function is expected to return a STRING_ARRAY.
# The function accepts INTEGER threshold as parameter.
#
# URL for cut and paste
# https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
#

def getUsernames(threshold)
    # Write your code here

end

fptr = File.open(ENV['OUTPUT_PATH'], 'w')

threshold = gets.strip.to_i

result = getUsernames threshold

fptr.write result.join "\n"
fptr.write "\n"

fptr.close()
