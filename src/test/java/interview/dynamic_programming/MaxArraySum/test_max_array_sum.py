import pytest
from typing import List
from src.main.java.interview.dynamic_programming.MaxArraySum.max_array_sum import (
    maxSubsetSum,
)


test_data = [([3, 7, 4, 6, 5], 13), ([2, 1, 5, 8, 4], 11), ([3, 5, -7, 8, 10], 15)]


@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_max_array_sum(input_array: List[int], expected_result: int):
    assert expected_result == maxSubsetSum(input_array)
