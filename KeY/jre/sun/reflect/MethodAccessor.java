/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package sun.reflect;

public interface MethodAccessor
{


   /*@ requires true; ensures true; assignable \everything; signals (java.lang.IllegalArgumentException e) true; signals (java.lang.reflect.InvocationTargetException e) true; */
   public java.lang.Object invoke(java.lang.Object arg0, java.lang.Object[] arg1) throws java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException;
}
