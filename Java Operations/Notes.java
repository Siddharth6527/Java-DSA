// Sorting a 2D Array accoding to values in any given column in Java
/*
 * We are given a 2D array of order N x M and a column number K (1<=K<=m).
 * Our task is to sort the 2D array accoding to values in Column K.
 */

///////////////////////////////////////////////////////////
// Bits Manipulation (Important tactics)
/*
 * In Java, the follwing 6 operators are bitwise operatord (also known as bit
 * operators as they work at the bit-level).
 */

/*
 * 1) The & (bitwise AND), takes two numbers as operands and does AND on every
 * every bit of two numbers.
 * The result of AND is 1 only if both bits are 1.
 * 
 * 2) The | (bitwise OR), takes two numbers as operands and does OR on every bit
 * of two numbers.
 * The result of OR is 1 if any of the two bits is 1.
 * 
 * 3) The ^ (bitwise XOR), takes two numbers as operands and does XOR on every
 * bit of two numbers.
 * The result of XOR is 1 if the two bits are different.
 * 
 * 4) The << (left shift), takes two numbers, the left shifts teh bits of the
 * first operand, and the second operand decides the number of places to shift.
 * 
 * 5) The >> (right shift), takes two numbers, right shifts the bits of the
 * first operand, and the second operand decides the number of places to shift.
 * 
 * 6) The ~ (bitwise NOT), takes one number and inverts all bits of it.
 * 
 */

// Interesting Facts About Bitwise Operators
/*
 * 1. The left-shift and right-shift operators should not be used for negative
 * numbers.
 * If the second operand( which decides the number of shifts) is a negative
 * number, it results in undefined behaviour.
 * For Example, results of both 1 >> -1 and 1 >> -1 is undefined.
 * 
 * Also, if the number is shifted more than the size of the integer, the
 * behaviour is undefined.
 * For example, 1<< 33 is undefined if the integers are stored using 32 bits.
 * 
 * Another thing is NO shift operation is performed if the additive expression
 * (operand that decides no of shifts) is 0.
 */

/*
 * 2. Interestingly!! The bitwise OR of two numbers is just the sum of those
 * numbers if there is no carry involved, otherwise, you just add their bitwise
 * AND.
 * 
 * Let's say, we have a=5 (101) and b=2 (010), since there is no carry involed,
 * their sum is just a|b.
 * Now, if we change 'a' to 6 which is 110 in binary, their sum would change to
 * a|b a&b since their is carray involved.
 */

/*
 * 3. The bitwise XOR oprator is the most useful operator from a technical
 * interview perspective.
 * It used in many problems.
 * A simple example could be
 * "Given a set of numbers, where all elements occur an even number of times except one number, find the odd occurring number"
 * .
 * This problem can be efficiently solved just doing XOR to all numbers.
 */

/*
 * 4. The Bitwise operators should not be used in place of logical operators.
 * The result of logical operators (&&, || and !) is either 0 or 1.
 * But bitwise operartos return an integer value.
 * Also, the logical operators consider any non-zero operand as 1.
 * For example, consider the following program, the results of & and && are
 * different for the same operands.
 */

/*
 * 5. The left-shift and right shift operators are equivalent to muliplication
 * and division by 2 respectively.
 * As mentioned in point 1, it works only if numbers are positive.
 */

/*
 * 6. The & operator can be used to quickly check if a number is odd or even.
 * The value of the expression (x & 1) would be non-zero only if x is odd,
 * otherwise, the value would be zero.
 */

/*
 * 7. The ~ operator should be used carefully.
 * The result of ~operator on a small number can be a big number if the result
 * is stored in an unsigned variable.
 * 
 * And the result may be a negative number if the result is stored in a signed
 * variable (assuming that the negative numbers are stored in 2's complement
 * form where the leftmost bit is the sign bit.)
 */

/////////////////////////////////////////////////////
// find the missing number using binary operations:
/*
 * This method used the technique of XOR to solve the problem.
 * 
 * XOR has certain properties:
 * Assume a1 ⊕ a2 ⊕ a3 ⊕ . . . ⊕ an = a and a1 ⊕ a2 ⊕ a3 ⊕ . . . ⊕ an-1 = b
 */

/*
 * Algo:
 * Create two variables a = 0 and b = 0.
 * Run a loop from i = 1 to N:
 * for every index, update a as a= a^i
 * Now traverse the array from i = start to end
 * for every index, update b as b = b^ arr[i]
 * The missing number is a ^ b.
 */

/////////////////////////////////////////////
// Swap two numbers without using temporary variable
/*
 * The bitwise XOR operator can be used to swap two variables.
 * The XOR of two numbers x and y returns a number that has all the bits as 1
 * whenever bit of x and y differ.
 * 
 * For example, XOR of 10 (in binary 1010) and 5 (int binary 0101)is 1111, and
 * XOR of 7 (0111) and 5 (0101) is (0010).
 */

// Problems with above methods:
/*
 * 1. The multiplication and division-based approach doesn't work if one of the
 * number is 0 as the product becomes 0 irrespective of the other number.
 * 
 * 2. Both Arithmetic solutions may cause an arithmetic overflow.
 * If x and y are too large, addition and multiplication may go out of the
 * integer range.
 * 
 * 4. When we use pointers to variable and make a function swap, all the above
 * methods fail when both pointers point to the same variable.
 */

///////////////////////////////////////////////////////
// find two non repeating elements in an array of repeating elements
// Using XOR
/*
 * Let x and y be the non-repeating elements we are looking ofr and arr[] be the
 * input array.
 * 
 * First, calculate the XOR of all the array elements:
 * 
 * xor = arr[0]^arr[1]^arr[2]......arr[n-1]
 * 
 * All the bits that are set in xor will be set in one non-repeating element (x
 * or y) and not in others.
 * 
 * So, if we take any set bit of xor and divide the elements of the array in two
 * sets - one set of elements with the same bit set and another set with same
 * bit not set.
 * 
 * By doing so, we will get x in one set and y in another set.
 * 
 * Now if we do XOR of all the elements in teh first set. we will get the first
 * set, we will get the first non-repeating element, and by doing same in other
 * sets we will get the second non-repeating element.
 */

// STEPS
/*
 * arr[] = {2, 4, 7, 9, 2, 4}
 * 
 * 1) Get the XOR of all the elements.
 * xor = 2^4^7^9^2^4 = 14 (1110)
 * 
 * 2) Get a number which has only one set bit of the xor.
 * 
 */
