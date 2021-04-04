import pytest
from typing import List
from src.main.java.interview.arrays.minimum_swaps_2.minimum_swaps_2 import minimumSwaps


test_data = [([4, 3, 1, 2], 3), ([2, 3, 4, 1, 5], 3),
             ([1, 3, 5, 2, 4, 6, 7], 3)]


@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_minimum_swaps_2(input_array: List[int], expected_result: int):
    assert expected_result == minimumSwaps(input_array)
