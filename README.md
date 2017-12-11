#Knapsack Problem Solutions Demo

by Alice Lafox ( alice@lafox.net )

##Introduction
You want to send your friend a package with different things.
Each thing you put inside the package has such parameters as index number, weight and cost. The
package has a weight limit. Your goal is to determine which things to put into the package so that the
total weight is less than or equal to the package limit and the total cost is as large as possible.
You would prefer to send a package which weights less in case there is more than one package with the
same price.

##Solutions
This code presents two of many possible solutions of this known as Knapsack problem (https://en.wikipedia.org/wiki/Knapsack_problem)

###1. Greedy Approximation Implementation
It is a simple but fairly effective solution I implemented first. (see ProblemResolverGreedyApproxImpl.java )
Is is based on comparing price/weight ratios of the items. 

Complexity of this implementation is O(n*log(n)), what equals of ArrayList's sort complexity
 because then we have just O(n) for one items loop, and it doesn't count.
 
But this implementation fails on testCase3
 
###2. Naive Brute Force Implementation
(see ProblemResolverNaiveBruteForceImpl.java)

This algorithm has complexity = O(2^n), because we have to check all combinations of items 
and compare them by price. But on the given constraints (up to 15 items) it is acceptable. 
And this algorithm works on all test cases.
 
 
####Test cases

       1. 81 : (1,53.38,€45) (2,88.62,€98) (3,78.48,€3) (4,72.30,€76) (5,30.18,€9) (6,46.34,€48)
       2.  8 : (1,15.3,€34)
       3. 75 : (1,85.31,€29) (2,14.55,€74) (3,3.98,€16) (4,26.24,€55) (5,63.69,€52) (6,76.25,€75) (7,60.02,€74) (8,93.18,€35) (9,89.95,€78)
       4. 56 : (1,90.72,€13) (2,33.80,€40) (3,43.15,€10) (4,37.97,€16) (5,46.81,€36) (6,48.77,€79) (7,81.80,€45) (8,19.36,€79) (9,6.76,€64)

Expected Results:
   
    4
    -
    2,7
    8,9
