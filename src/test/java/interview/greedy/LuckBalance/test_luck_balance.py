import pytest
from typing import List
from src.main.java.interview.greedy.LuckBalance.luck_balance \
    import luckBalance


test_data = [
    (3,[[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]],29)
]

@pytest.mark.parametrize(
    "contests_number,contests,expected_result",test_data)
def test_luck_balance(
    contests_number:int,
    contests:List[List[int]],
    expected_result:int):
    assert expected_result==luckBalance(contests_number,contests)