/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.util;

public interface ListIterator extends java.util.Iterator
{


   /*@ requires true; ensures true; assignable \everything; */
   public boolean hasNext();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.Object next();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean hasPrevious();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.Object previous();

   /*@ requires true; ensures true; assignable \everything; */
   public int nextIndex();

   /*@ requires true; ensures true; assignable \everything; */
   public int previousIndex();

   /*@ requires true; ensures true; assignable \everything; */
   public void remove();

   /*@ requires true; ensures true; assignable \everything; */
   public void set(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void add(java.lang.Object arg0);
}
