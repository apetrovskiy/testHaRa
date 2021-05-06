import pytest
from typing import List
from src.main.java.interview.greedy.MaxMin.max_min import maxMin


test_data = [
    (3, [10, 100, 300, 200, 1000, 20, 30], 20),
    (4, [1, 2, 3, 4, 10, 20, 30, 40, 100, 200], 3),
    (2, [1, 2, 1, 2, 1], 0)
]


@pytest.mark.parametrize("k,input_array,expected_result", test_data)
def test_max_min(k: int, input_array: List[int], expected_result: int):
    assert expected_result == maxMin(k, input_array)
