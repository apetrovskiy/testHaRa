import pytest
from typing import List
from src.main.java.interview.greedy. \
    MinimumAbsoluteDifferenceInAnArray. \
    minimum_absolute_difference_in_an_array \
    import minimumAbsoluteDifference


test_data = [
    ([3, -7, 0], 3),
    ([-59, -36, -13, 1, -53, -92, -2, -96, -54, 75], 1),
    ([1, -3, 71, 68, 17], 3),
]


@pytest.mark.parametrize("input_array,expected_result", test_data)
def test_minimum_absolute_difference_in_an_array(
    input_array: List[int], expected_result: int
):
    assert expected_result == minimumAbsoluteDifference(input_array)
