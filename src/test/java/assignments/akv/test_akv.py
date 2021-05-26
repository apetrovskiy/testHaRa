import pytest


test_data = [
    (1, 1)
]


@pytest.mark.parametrize("input,expected_result")
def test_akv(input, expected_result):
    assert expected_result == input
