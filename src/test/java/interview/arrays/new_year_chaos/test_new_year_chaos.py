import pytest
from typing import List
from src.main.java.interview.arrays.new_year_chaos.new_year_chaos import minimumBribes

test_data = [
    ([2, 1, 5, 3, 4], 3),
    ([2, 5, 1, 3, 4], 'Too chaotic')
]


@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_new_year_chaos(input_array: List[int], expected_result: int):
    assert expected_result == minimumBribes(input_array)
