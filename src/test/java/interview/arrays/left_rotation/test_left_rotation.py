import pytest
from typing import List
from src.main.java.interview.arrays.left_rotation.left_rotation import rotLeft


test_data = [
    ([1, 2, 3, 4, 5], 4, [5, 1, 2, 3, 4])
]


@pytest.mark.parametrize("input_array,number_of_rotations,expected_result", test_data)
def test_left_rotation(input_array: List[int], number_of_rotations: int, expected_result: List[int]):
    assert expected_result == rotLeft(input_array, number_of_rotations)
