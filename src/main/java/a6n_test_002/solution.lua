--
-- Complete the 'getUsernames' function below.
--
-- The function is expected to return a STRING_ARRAY.
-- The function accepts INTEGER threshold as parameter.

-- URL for cut and paste
-- https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
--

function getUsernames(threshold)

end

local fptr = io.open(os.getenv("OUTPUT_PATH"), "w")

local threshold = io.stdin:read("*n", "*l")

local result = getUsernames(threshold)

fptr:write(table.concat(result, "\n"))

fptr:write("\n")

fptr:close()
