// C/C++ Pointers vs Java References
/*
 * Java doesn't have pointers; Java has references
 * 
 * Reference: A reference is a variable that referes to something else and can
 * be used as an alias for that something else.
 * 
 * Pointer: A pointer is a variable that stores a memory address, for the
 * purpose of acting as an alias to what is stored at theat addresss.
 * 
 * So, a pointer is a reference, but a refernce is not necessarily a pointer.
 * 
 * Pointers are a particular implementation of the concept of a reference, and
 * the term tends to be used only for languages that give you direct access to
 * the memory address.
 * 
 */

/*
 * C/C++ allows pointer arithmetic but Java Pointers (References) not:
 * The term "pointer" is strongly associated with the C/C++ concept of pointers,
 * which are variables which store memory addresses and can be modified
 * arithmetically to point to arbitrary addresss.
 * 
 * In Java, pointers only exist as an implementation detail for References.
 * A copy of the references is copied to the stack of a calling function and
 * allowing you to manipulate that object.
 * However, you cannot change the object the calling function refers to.
 * 
 */

/*
 * Java doesn't support pointer explicitly, But Java uses pointer implicitly:
 * Java use pointers for manipulations of references but these pointers are not
 * available for outside use.
 * Any Operation implicitly done by the language are actually NOT visible.
 * 
 */

/*
 * Pointers can do arithmetic, References can't:
 * Memory access via pointer arithmeitc is fundamentally unsafe and for safe
 * gaurding, Java has a robust security model and disallows pointer arithmetic
 * for this reason.
 * Users cannot manipulate pointers no matter what may ever is the case.
 * 
 */

/*
 * Pointing objects:
 * In C, we can add or subtract address of a pointer to point to things.
 * In Java, a reference points to one thing only.
 * You can make a variable hold a different reference, but such c manipulations
 * to pointers are not possible.
 */

/*
 * References are strongly typed:
 * Type of a referce is much more strictly controlled in Java than the type of a
 * pointer is in C.
 * In C you can have an int* and cast it to a char* and just re-intrepret the
 * memeory at that location.
 * That re-interpretation doesn't work in Java: you can only interpret the
 * object at the other end of reference as something that it already is (i.e.
 * you ocan cast a Object refernce to String refernce only if the object pointed
 * to is actually a String.)
 * 
 */

////////////////////////////////////////
// Big Integer Class in Java
/*
 * BigInteger class is used for the mathematical operation which involves very
 * big integer calculations that are outsidie the limit of all available
 * primitive data types.
 * 
 * In this way, BigInteger class is very handy to use because ot its large
 * method library.
 */
// int a,b;
// BigInteger A,B;

////
// a= 54;
// b=23;
// A= BigInteger.valueOf(54);
// B= BigInteger.valueOf(37);

// And for Integers available as strings you can initialize them as follows:
// A= new BigInteger("54");
// B = new BigInteger(“123456789123456789”);

// constants are
// A= BigInteger.ONE;

// Mathematcial operations are as follows:
// int c= a+b;
// BigInteger C= A.add(B);

/*
 * Other similar functions are subtract(), multiply(), divide(), remainder(),
 * but all these functions take BigInteger as their argument so if we want this
 * operation with intgers or string convert them to BigInteger before passing
 * them to functions.
 */

// String str= "123235";
// BigInteger C = A.add(new BigInteger(str));
// int val = 12321445;
// BigInteger C= A.add(BigInteger.valueOf(val));

// Extraction of value from BigInteger is as follows:
// int x = A.intValue(); // value should be in limit of int x
// long y = A.longValue(); // value should be in limit of long x
// String z = A.toString();

// Comparison:
// if(a<b){ } // for primitive int
// if(A.compareTo(B)<0 ) {} // for BigInteger
// Actually compareTo returns -1(lessthan), 0(Equal), 1(greater than) according
// to values.

// For equality we can also use:
// if(A.equals(B)) {} // A is equal to B