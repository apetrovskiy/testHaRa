import pytest
from typing import List
from src.main.java.interview.arrays.new_year_chaos.new_year_chaos import get_minimum_bribes


TOO_CHAOTIC = 'Too chaotic'

test_data = [
    ([2, 1, 5, 3, 4], 3),
    ([2, 5, 1, 3, 4], TOO_CHAOTIC),
    ([5, 1, 2, 3, 7, 8, 6, 4], TOO_CHAOTIC),
    ([1, 2, 5, 3, 7, 8, 6, 4], 7),
    ([1, 2, 5, 3, 4, 7, 8, 6], 4)
]


@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_new_year_chaos(input_array: List[int], expected_result: int):
    assert expected_result == get_minimum_bribes(input_array)
