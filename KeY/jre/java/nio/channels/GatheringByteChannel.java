/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.nio.channels;

public interface GatheringByteChannel extends java.nio.channels.WritableByteChannel
{


   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public long write(java.nio.ByteBuffer[] arg0, int arg1, int arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public long write(java.nio.ByteBuffer[] arg0) throws java.io.IOException;
}