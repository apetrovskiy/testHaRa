from unittest.case import TestCase
from src.main.java.training01.data_structures.arrays.a01_arrays_ds.solution import reverseArray
import unittest


class ArraysDsTest(TestCase):
    def test_reverse_array(self):
        assert [3,2,1], reverseArray([1,2,3])


if __name__ == '__main__':
    unittest.main()
