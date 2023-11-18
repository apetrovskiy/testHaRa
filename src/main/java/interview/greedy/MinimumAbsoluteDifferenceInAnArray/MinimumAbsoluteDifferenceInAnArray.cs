// <copyright file="MinimumAbsoluteDifferenceInAnArray.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Interview.Greedy.MinimumAbsoluteDifferenceInAnArray
{
    using System;
    using System.CodeDom.Compiler;
    using System.Collections;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.Diagnostics.CodeAnalysis;
    using System.Globalization;
    using System.IO;
    using System.Linq;
    using System.Reflection;
    using System.Runtime.Serialization;
    using System.Text;
    using System.Text.RegularExpressions;

    public class MinimumAbsoluteDifferenceInAnArray
    {
        // Complete the minimumAbsoluteDifference function below.
        public static int MinimumAbsoluteDifference(int[] arr)
        {
            Array.Sort(arr);
            var differences = Enumerable.Range(0, arr.Length - 1)
            .ToList()
            .Select(index => Math.Abs(arr[index + 1] - arr[index]));
            return differences.Min();
        }

        private static void Main(string[] args)
        {
            var textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH") ?? string.Empty, true);

            var n = Convert.ToInt32(Console.ReadLine());

            int[] arr = Array.ConvertAll((Console.ReadLine() ?? string.Empty).Split(' '), arrTemp => Convert.ToInt32(arrTemp))
            ;
            var result = MinimumAbsoluteDifference(arr);

            textWriter.WriteLine(result);

            textWriter.Flush();
            textWriter.Close();
        }
    }
}