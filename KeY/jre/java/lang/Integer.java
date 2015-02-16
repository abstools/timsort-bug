/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.lang;

public final class Integer extends java.lang.Number implements java.lang.Comparable
{
   public final static int MIN_VALUE = -2147483648;
   public final static int MAX_VALUE = 2147483647;
   public final static java.lang.Class TYPE;
   final static char[] digits;
   final static char[] DigitTens;
   final static char[] DigitOnes;
   final static int[] sizeTable;
   public final static int SIZE = 32;
   final static boolean $assertionsDisabled;


   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String toString(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String toHexString(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String toOctalString(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String toBinaryString(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String toString(int arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.NumberFormatException e) true; */
   public static int parseInt(java.lang.String arg0, int arg1) throws java.lang.NumberFormatException;

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.NumberFormatException e) true; */
   public static int parseInt(java.lang.String arg0) throws java.lang.NumberFormatException;

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.NumberFormatException e) true; */
   public static java.lang.Integer valueOf(java.lang.String arg0, int arg1) throws java.lang.NumberFormatException;

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.NumberFormatException e) true; */
   public static java.lang.Integer valueOf(java.lang.String arg0) throws java.lang.NumberFormatException;

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.Integer valueOf(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public Integer(int arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.NumberFormatException e) true; */
   public Integer(java.lang.String arg0) throws java.lang.NumberFormatException;

   /*@ requires true; ensures true; assignable \everything; */
   public byte byteValue();

   /*@ requires true; ensures true; assignable \everything; */
   public short shortValue();

   /*@ requires true; ensures true; assignable \everything; */
   public int intValue();

   /*@ requires true; ensures true; assignable \everything; */
   public long longValue();

   /*@ requires true; ensures true; assignable \everything; */
   public float floatValue();

   /*@ requires true; ensures true; assignable \everything; */
   public double doubleValue();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toString();

   /*@ requires true; ensures true; assignable \everything; */
   public int hashCode();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean equals(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.Integer getInteger(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.Integer getInteger(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.Integer getInteger(java.lang.String arg0, java.lang.Integer arg1);

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.NumberFormatException e) true; */
   public static java.lang.Integer decode(java.lang.String arg0) throws java.lang.NumberFormatException;

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.lang.Integer arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int compare(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public static int highestOneBit(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int lowestOneBit(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int numberOfLeadingZeros(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int numberOfTrailingZeros(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int bitCount(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int rotateLeft(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public static int rotateRight(int arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public static int reverse(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int signum(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static int reverseBytes(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.lang.Object arg0);
}
