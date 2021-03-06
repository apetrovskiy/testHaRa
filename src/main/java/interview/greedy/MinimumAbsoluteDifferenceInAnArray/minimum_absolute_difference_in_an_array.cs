namespace interview.greedy.MinimumAbsoluteDifferenceInAnArray
{
    using System.CodeDom.Compiler;
    using System.Collections.Generic;
    using System.Collections;
    using System.ComponentModel;
    using System.Diagnostics.CodeAnalysis;
    using System.Globalization;
    using System.IO;
    using System.Linq;
    using System.Reflection;
    using System.Runtime.Serialization;
    using System.Text.RegularExpressions;
    using System.Text;
    using System;

    public class Solution
    {

        // Complete the minimumAbsoluteDifference function below.
        public static int minimumAbsoluteDifference(int[] arr)
        {
              Array.Sort(arr);
            var differences = Enumerable.Range(0, arr.Length - 1)
            .ToList()
            .Select(index => Math.Abs(arr[index + 1] - arr[index]));
            return differences.Min();

        }

        static void Main(string[] args)
        {
            TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

            int n = Convert.ToInt32(Console.ReadLine());

            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp))
            ;
            int result = minimumAbsoluteDifference(arr);

            textWriter.WriteLine(result);

            textWriter.Flush();
            textWriter.Close();
        }
    }
}