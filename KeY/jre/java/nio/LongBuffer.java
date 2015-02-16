/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.nio;

public abstract class LongBuffer extends java.nio.Buffer implements java.lang.Comparable
{
   final long[] hb;
   final int offset;
   boolean isReadOnly;


   /*@ requires true; ensures true; assignable \everything; */
   public static java.nio.LongBuffer allocate(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.nio.LongBuffer wrap(long[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.nio.LongBuffer wrap(long[] arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.LongBuffer slice();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.LongBuffer duplicate();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.LongBuffer asReadOnlyBuffer();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract long get();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.LongBuffer put(long arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract long get(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.LongBuffer put(int arg0, long arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.nio.LongBuffer get(long[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public java.nio.LongBuffer get(long[] arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.nio.LongBuffer put(java.nio.LongBuffer arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.nio.LongBuffer put(long[] arg0, int arg1, int arg2);

   /*@ requires true; ensures true; assignable \everything; */
   public final java.nio.LongBuffer put(long[] arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public final boolean hasArray();

   /*@ requires true; ensures true; assignable \everything; */
   public final long[] array();

   /*@ requires true; ensures true; assignable \everything; */
   public final int arrayOffset();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.LongBuffer compact();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract boolean isDirect();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toString();

   /*@ requires true; ensures true; assignable \everything; */
   public int hashCode();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean equals(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.nio.LongBuffer arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.ByteOrder order();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.Object array();

   /*@ requires true; ensures true; assignable \everything; */
   public int compareTo(java.lang.Object arg0);
}
