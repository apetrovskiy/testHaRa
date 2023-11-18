// <copyright file="code.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

using System;
using System.CodeDom.Compiler;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;

internal class Result
{
    /*
     * Complete the 'getUsernames' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER threshold as parameter.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
     */

    public static List<string> GetUsernames(int threshold)
    {
        return new List<string>();
    }
}

internal class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int threshold = Convert.ToInt32(Console.ReadLine().Trim());

        List<string> result = Result.GetUsernames(threshold);

        textWriter.WriteLine(string.Join("\n", result));

        textWriter.Flush();
        textWriter.Close();
    }
}
