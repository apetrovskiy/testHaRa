#
# Complete the 'fizzBuzz' function below.
#
# The function accepts INTEGER n as parameter.
#

fizzBuzz <- function(n) {
    # Write your code here

}

stdin <- file('stdin')
open(stdin)

n <- as.integer(trimws(readLines(stdin, n = 1, warn = FALSE), which = "both"))

fizzBuzz(n)

close(stdin)
