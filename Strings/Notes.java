// STRINGS
///////////////////////

// StiringBuilder Class in Java
/*
 * StringBuilder in Java represents a mutuable sequence of characters.
 * 
 * Since, the String class in Java creates an immutable sequence of characters,
 * the StringBuilder class provides an alternative to String Class.
 * 
 * The function of StringBuilder is very much similar to the StringBuffer class,
 * as both of them provide an alternative to String class by making a mutuable
 * sequence of charcters.
 * 
 * However, the StringBuilder class differs from the StringBuffer class on the
 * Synchronization.
 * 
 * The StringBuilder class provides no gaurantee of synchornization whereas the
 * StringBuffer class does.
 * 
 */

// Constructors in Java StringBuilder class
/*
 * StringBuilder(): Constructs a string builder with no characteres in it and an
 * initial capacity of 16 characters.
 * 
 * StringBuilder(int capacity): Constructs a string builder with no characters
 * in it and an inital capacity specified by the capacity argument/
 * 
 * StringBuilder(CharSequence seq): Constructs a string builder that contains
 * the same characteres as the specified CharSequence.
 * 
 * StringBuilder(String str): Constructs a string builder initialized to the
 * contents of the specified string.
 */

// Methods in Java StringBuilder
/*
 * StringBuilder append(X x): This method appends the string representation of
 * the X type argument to the sequence.
 * 
 * StringBilder appendCodePoint(int codePoint): This method appends the string
 * representation of the codePoint argument to this sequence.
 * 
 * int capacity(): This method returns the current capacity.
 * 
 * char charAt(int index): This method returns the char value in this sequence
 * at the specified index.
 * 
 * IntStream chars(): This method returns a stream of int zero-extending the
 * char values from this sequence.
 * 
 * int codePointAt(int index): This method returns the character (Unicode code
 * point) at the specified index.
 * 
 * int codePointBefore(int index): This method returns the character (Unicode
 * code point) before the specified index.
 * 
 * int codePointCount(int beginIndex, int endIndex): This method returns the
 * number of Unicode code points in the specified text range of this sequence.
 * 
 * IntStream codePoints(): This method returns a stream of code point values
 * from this sequence.
 * 
 * StringBuilder delete(int start, int end): This method removes the characters
 * in a substring of this sequence.
 * 
 * StringBuilder deleteCharAt(int index): This method removes the char at the
 * specified position in this sequence.
 * 
 * void ensureCapacity(int minimumCapacity): This method ensures that the
 * capacity is at least equal to the specified minimum.
 * 
 * void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): This
 * method characters are copied from this sequence into the destination
 * character array dst.
 * 
 * int indexOf(): This method returns the index within this string of the first
 * occuerence of the specified substring.
 * 
 * StringBuilder insert(int offset, boolean b): This method inserts the string
 * representation of the boolean alternate argument into this sequence.
 * 
 * StringBuilder insert(): This method inserts the string representation of the
 * char argument into this sequence.
 * 
 * int lastIndexOf(): This method returns the index within this string of the
 * last occurence of the specified substring.
 * 
 * int length(): This method returns the length (character count).
 * 
 * int offsetByCodePonts(int index, int codePointOffset): This method returns
 * the index within this sequence that is offset from the given index by
 * codePointOffset code points.
 * 
 * StringBuilder replace(int start, int end, String str): This method replaces
 * the characters in a substring of this sequence with charcters in the
 * specified String.
 * 
 * StringBuilder reverse(): This method causes this charater sequence to be
 * replaced by the reverse of the sequence.
 * 
 * void setCharAt(int index, char ch): In this method, the character at the
 * specified index is to ch.
 * 
 * void setLength(int newLength): This method sets the length of the character
 * sequence.
 * 
 * CharSequence subSequence(int start, int end): This method returns a new
 * character sequence theat is a subsequence of this sequence.
 * 
 * Striing substring(): This method returns a new String that contains a
 * subsequence of characters currently contained in this character sequence.
 * 
 * Stirng toString(): This method returns a string representing the data in this
 * sequence.
 * 
 * void trimToSize(): This method attempts to reduce storage used of the
 * character sequence.
 */

////////////////////////////////////////////////////////
// STRINGBUFFER class In Java
/*
 * StringBuffer is a class in Java that represents a mutuable sequence of
 * characteres.
 * It provides an alternative to the immutable String class.
 * Allowing you to modify the contents of a string without creating a new object
 * every time.
 */

// Features and methods of the StringBuffer class:
/*
 * StringBuffer objects are mutabler, meaning that you can change the contents
 * of the buffer without creating a new object.
 * 
 * The initial capacity of a StringBuffer can be specified when it is created,
 * or it can be set later wiht the ensureCapacity() method.
 * 
 * The append() method is used to add characters, strings, or other objects to
 * the end of the buffer.
 * 
 * The insert() method is used to insert characters, strings, or other objects
 * at a specified position in the buffer.
 * 
 * The delete() method is used to remove characters from the buffer.
 * 
 * The reverse() method is used to reverese the order of the characters in the
 * buffer.
 * 
 */

/*
 * Thread-safe: StringBuffer objects are thread-safe, which means multiple
 * threads can access it simultanously (they can be safely accessed and modified
 * by mutiple threads simultaneously.)
 * 
 * In contrast, String objects are not thread-safe, which means that you need to
 * use synchronization if you want to access a String object from multiple
 * threads.
 */

//////////////////////////
// Differnce btw StringBuffer and StringBuilder
// StringBuffer Class
/*
 * StringBuffer is present in Java.
 * 
 * StringBuffer is synchronized.
 * This means that multiple threads cannot call the methods of StringBuffer
 * simultaneously.
 * 
 * Due to synchroniztion, StringBuffer is called a thread safe class.
 * 
 * Due to synchronization, StringBuffer is lot slower than StringBuilder.
 */

// StringBuilder Class
/*
 * StringBuilder was introduced in Java 5.
 * 
 * StringBuilder is asynchronized.
 * This means that multiple threads can call the methods of StringBuilder
 * simultanously.
 * 
 * Due to this asynchronous nature, StringBuilder is not a thread safe class.
 * 
 * Since there is no preliminary check for multiple threads, StringBuilder is a
 * lot faster than StriingBuffer.
 */
