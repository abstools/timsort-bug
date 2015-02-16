/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.io;

public abstract class Reader extends java.lang.Object implements java.lang.Readable, java.io.Closeable
{
   protected java.lang.Object lock;


   /*@ requires true; ensures true; assignable \everything; */
   protected Reader();

   /*@ requires true; ensures true; assignable \everything; */
   protected Reader(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public int read(java.nio.CharBuffer arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public int read() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public int read(char[] arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract int read(char[] arg0, int arg1, int arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public long skip(long arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public boolean ready() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; */
   public boolean markSupported();

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void mark(int arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void reset() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void close() throws java.io.IOException;
}