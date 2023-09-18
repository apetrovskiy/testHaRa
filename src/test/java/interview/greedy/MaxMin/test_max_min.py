import pytest
from typing import List
from src.main.java.interview.greedy.MaxMin.max_min import maxMin


test_data = [
    (3, [10, 100, 300, 200, 1000, 20, 30], 20),
    (4, [1, 2, 3, 4, 10, 20, 30, 40, 100, 200], 3),
    (2, [1, 2, 1, 2, 1], 0),
    (5, [1, 2, 1, 2, 1], 1),
    (7, [10, 100, 300, 200, 1000, 20, 30], 990),
    (0, [], 0),
    (2, [10, 100, 300, 200, 1000, 20, 30], 10),
    (2, [1, 2, 3, 4, 10, 20, 30, 40, 100, 200], 1),
    (3, [100, 200, 300, 350, 400, 401, 402], 2),
]


@pytest.mark.parametrize("k,input_array,expected_result", test_data)
def test_max_min(k: int, input_array: List[int], expected_result: int):
    assert expected_result == maxMin(k, input_array)
