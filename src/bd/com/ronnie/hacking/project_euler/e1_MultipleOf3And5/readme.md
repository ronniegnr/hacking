# Project Euler #1: Multiples of 3 and 5

[From HackerRank](https://www.hackerrank.com/contests/projecteuler/challenges/euler001)

This problem is a programming version of [Problem 1](https://projecteuler.net/problem=1) from [projecteuler.net](https://projecteuler.net/)

## Problem Statement
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.

**Input Format**

First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

**Constraints**

    1 <= T <= 10^5
    1 <= N <= 10^9

**Output Format**

For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.

**Sample Input 0**

    2
    10
    100

**Sample Output 0**

    23
    2318

**Explanation 0**

For N = 10, if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5 and 9. The sum of these multiples is 23.

Similarly for N = 100, we get 2318.


## Solution

We will find out the sum of 3 and 5 separately and combine them. There is a catch here. Numbers which are divisible by 3 and 5 both will be counted twice. So we need to subtract that portion. Here is the formula -

    sum of numbers divisible by 3 or 5 =
    sum of numbers divisible by 3
    + sum of numbers divisible by 5
    - sum of numbers divisible by 15

For a given number n, the quantity of number divisible by 3, below n is

    (n-1)/3

Let,

    (n-1)/3 = p

So the numbers divisible by 3 below n are -

    1, 3, 6, 9, 12 ...... 3p

And the sum is -

    1 + 3 + 6 + 9 + 12 + ... + 3p
    = 3 * (1+2+3+...+p)
    = 3*p*(p+1)/2

This is the idea used in the solution.




