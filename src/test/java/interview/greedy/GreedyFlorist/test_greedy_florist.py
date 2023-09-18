import pytest
from typing import List
from src.main.java.interview.greedy.GreedyFlorist.greedy_florist import getMinimumCost


test_data = [(3, [2, 5, 6], 13), (2, [2, 5, 6], 15), (3, [1, 3, 5, 7, 9], 29)]


@pytest.mark.parametrize("k,input_array,expected_result", test_data)
def test_greedy_florist(k: int, input_array: List[int], expected_result: int):
    assert expected_result == getMinimumCost(k, input_array)
