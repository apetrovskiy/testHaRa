import pytest
from typing import List
from src.main.java.interview.greedy.LuckBalance.luck_balance \
    import luckBalance


test_data = [
    (3, [[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]], 29),
    (4, [[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]], 31),
    (2, [[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]], 25),
    (1, [[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]], 15),
    (0, [[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]], -1),
    (3, [[105, 0],
         [103, 0],
         [106, 1],
         [106, 1],
         [103, 0],
         [103, 1],
         [105, 1],
         [106, 1],
         [105, 0],
         [104, 0],
         [103, 0]], 733),
    (58, [[105, 0],
          [103, 0],
          [106, 1],
          [106, 1],
          [103, 0],
          [103, 1],
          [105, 1],
          [106, 1],
          [105, 0],
          [104, 0],
          [103, 0],
          [102, 0],
          [104, 0],
          [105, 0],
          [104, 0],
          [102, 1],
          [104, 0],
          [106, 1],
          [104, 1],
          [101, 1],
          [105, 0],
          [103, 0],
          [104, 0],
          [106, 0],
          [102, 1],
          [103, 0],
          [102, 0],
          [103, 1],
          [106, 0],
          [104, 1],
          [101, 1],
          [101, 1],
          [106, 0],
          [103, 1],
          [103, 0],
          [104, 1],
          [101, 0],
          [105, 1],
          [105, 0],
          [104, 1],
          [105, 0],
          [106, 0],
          [104, 0],
          [105, 0],
          [101, 1],
          [106, 1],
          [105, 0],
          [103, 0],
          [104, 1],
          [101, 1],
          [106, 1],
          [104, 0],
          [106, 1],
          [105, 0],
          [103, 1],
          [101, 0],
          [103, 0],
          [101, 0],
          [105, 1],
          [104, 1],
          [104, 1],
          [105, 1],
          [105, 1],
          [103, 0],
          [101, 0],
          [104, 1],
          [106, 1],
          [105, 1],
          [105, 0],
          [106, 1],
          [104, 1],
          [105, 1],
          [103, 1],
          [102, 1],
          [106, 0],
          [101, 0],
          [105, 1],
          [104, 1],
          [103, 1],
          [106, 1],
          [101, 0],
          [106, 1],
          [103, 0],
          [106, 1],
          [102, 1],
          [103, 0],
          [101, 1],
          [102, 1],
          [101, 1],
          [104, 0],
          [106, 0],
          [102, 0],
          [104, 0],
          [105, 0],
          [105, 0],
          [102, 1],
          [103, 1],
          ], 10069)
]


@pytest.mark.parametrize(
    "contests_number,contests,expected_result", test_data)
def test_luck_balance(
        contests_number: int,
        contests: List[List[int]],
        expected_result: int):
    assert expected_result == luckBalance(contests_number, contests)
