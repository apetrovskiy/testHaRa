

# Complete the minimumAbsoluteDifference function below.
function minimumAbsoluteDifference(arr)


end

fptr = open(ENV["OUTPUT_PATH"], "w")

n = parse(Int32, readline(STDIN))

arr = [parse(Int32, k) for k in split(readline(STDIN))]

result = minimumAbsoluteDifference(arr)

write(fptr, string(result)*"\n")

close(fptr)
