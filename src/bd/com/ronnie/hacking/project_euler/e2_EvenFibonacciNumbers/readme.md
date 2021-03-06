# Project Euler #2: Even Fibonacci numbers

[From HackerRank](https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem)

This problem is a programming version of [Problem 2](https://projecteuler.net/problem=2) from [projecteuler.net](https://projecteuler.net/)

## Problem Statement
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with  and , the first  terms will be:

    1,2,5,8,13,21,34,...

By considering the terms in the Fibonacci sequence whose values do not exceed , find the sum of the even-valued terms.

**Input Format**

First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

**Constraints**

    1 <= T <= 10^5
    1 <= N <= 10^16

**Output Format**

Print the required answer for each test case.

**Sample Input 0**

    2
    10
    100

**Sample Output 0**

    10
    44

**Explanation 0**

For N = 10, we have {2, 8}, sum is 10.
For N = 100, we have {2, 8, 34}, sum is 44.


## Solution
This is the Fibonacci series where even numbers are marked as bold -

1, 1, **2**, 3, 5, **8**, 13, 21, **34**, ...

Even-Odd sequence of the numbers are -

odd, odd, even, odd, odd, even, odd, odd, even, ...

So we have two odd Fibonacci numbers between two even numbers. We need to find sum of all even Fibonacci numbers which are less than n. Let's say F(n) is the highest even Fibonacci number in the range of 1 to n. The immediate even Fibonacci numbers of F(n) are F(n-3) and F(n-6). We will form an equation with these -

    F(n) = F(n-1) + F(n-2)
    F(n) = F(n-2) + F(n-3)   +   F(n-3) + F(n-4)
    F(n) = F(n-2) + 2F(n-3) + F(n-4)
    F(n) = 2F(n-3) + F(n-2) + F(n-4)
    F(n) = 2F(n-3) + F(n-3) + F(n-4) + F(n-4)
    F(n) = 3F(n-3) + F(n-4) + F(n-4)
    F(n) = 3F(n-3) + F(n-4) + F(n-5) + F(n-6)
    F(n) = 3F(n-3) + F(n-3) + F(n-6)
    F(n) = 4F(n-3) + F(n-6)

We used this equation in our solution.