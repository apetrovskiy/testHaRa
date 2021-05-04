#!/bin/ruby

require 'json'
require 'stringio'

# Complete the minimumAbsoluteDifference function below.
def minimumAbsoluteDifference(arr)


end

fptr = File.open(ENV['OUTPUT_PATH'], 'w')

n = gets.to_i

arr = gets.rstrip.split(' ').map(&:to_i)

result = minimumAbsoluteDifference arr

fptr.write result
fptr.write "\n"

fptr.close()
