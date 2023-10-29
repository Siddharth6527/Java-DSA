// Java Program to Compute GCD (HCF)
/*
 * GCD (Greatest Common Divisor) of two given numbers A and B is the highest
 * number that can divide both A and B completely, i.e. leving 0 remainder in
 * each case.
 * 
 * Approaches:
 * General Method
 * Euclidean algorithm (by repeated subtraction)
 * Euclidean algorithm (by repeated divison)
 * 
 * if(gcd(A, B))==1, then A,B are co-primes.
 * 
 */

/*
 * General Approach:
 * In the general approach of computing GCD, we acutally implement the definiton
 * of GCD.
 * 
 * First, find out all the factors of A and B individually.
 * Then, list out those factors which are common for both A and B.
 * The hightest of those common factors is the GCD of A and B.
 */

////////////////////////////////////////////////
// Euclidean algorithm (repeated subtraction)
/*
 * This approach is based on the principle that the GCD of two numbers A and B
 * will be same even if we replace the larger with difference between A and B.
 * 
 * In this approach, we perform GCD operation on A and B repeatedly by replacing
 * A with B and B with the difference(A,B) as long as the difference is greater
 * than 0.
 */

////////////////////////////////////////////////
// Euclidean algorithm (repeated division)
/*
 * This approach is similar to the repeated subtraction appraoch.
 * But, in this approach, we replace B with the modules of A and B instead of
 * the difference.
 */

////////////////////////////////////////////////
// Given an array of pairs, find all symmetrix pairs in it.
/*
 * Two pairs (a,b) and (c,d) are said to be symmetric if c is equal to b and a
 * is equal to d.
 * For example, (10,20) and (20,10) are symmetric.
 * Given an array of pairs find all symmetric paris in it.
 */

// Find N distinct integrs with zero sum
/*
 * Given an integer N, our task is to print N distinct numbers such that their
 * sum is 0.
 */

/*
 * Approach:
 * To solve the problem mentioned above the main idea is to print Symmetric
 * Pairs like (+x, -x), so that the sum will always be 0.
 * 
 * The edge case to the problem is to observe that if integer N is odd, then
 * integer N is odd, then print one along with then numbers so that sum is not
 * affected.
 * 
 */