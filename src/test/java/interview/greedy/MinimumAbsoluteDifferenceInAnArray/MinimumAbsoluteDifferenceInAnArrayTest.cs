namespace interview.greedy.MinimumAbsoluteDifferenceInAnArray
{
    using NUnit.Allure.Core;
    using NUnit.Framework;

    [AllureNUnit]
    public class MinimumAbsoluteDifferenceInAnArrayTest
    {
        [TestCase(new int[] { 3, -7, 0 }, 3)]
        [TestCase(new int[] { -59, -36, -13, 1, -53, -92, -2, -96, -54, 75 }, 1)]
        [TestCase(new int[] { 1, -3, 71, 68, 17 }, 3)]
        public void ShouldFindMinimumDifference(int[] inputArray, int expectedResult)
        {
            Assert.AreEqual(expectedResult, Solution.minimumAbsoluteDifference(inputArray));
        }
    }
}