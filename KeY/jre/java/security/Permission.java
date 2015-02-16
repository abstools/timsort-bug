/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.security;

public abstract class Permission extends java.lang.Object implements java.security.Guard, java.io.Serializable
{


   /*@ requires true; ensures true; assignable \everything; */
   public Permission(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.SecurityException e) true; */
   public void checkGuard(java.lang.Object arg0) throws java.lang.SecurityException;

   /*@ requires true; ensures true; assignable \everything; */
   public abstract boolean implies(java.security.Permission arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract boolean equals(java.lang.Object arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract int hashCode();

   /*@ requires true; ensures true; assignable \everything; */
   public final java.lang.String getName();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.lang.String getActions();

   /*@ requires true; ensures true; assignable \everything; */
   public java.security.PermissionCollection newPermissionCollection();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toString();
}
