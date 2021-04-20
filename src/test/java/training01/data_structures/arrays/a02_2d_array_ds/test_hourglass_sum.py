import unittest
from unittest.case import TestCase
from src.main.java.training01.data_structures.arrays.\
    a02_2d_array_ds.hourglass_sum \
    import hourglassSum


class Array2dTest(TestCase):
    def test_calculate_hourglass_sum(self):
        self.assertEqual(28, hourglassSum([[-9, -9, -9, 0, 0, 0],
                                           [0, -9, 0, 4, 3, 2],
                                           [-9, -9, -9, 1, 2, 3],
                                           [0, 0, 8, 6, 6, 0],
                                           [0, 0, 0, -2, 0, 0],
                                           [0, 0, 1, 2, 4, 0]]))


if __name__ == '__main__':
    unittest.main()
