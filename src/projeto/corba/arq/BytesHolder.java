package arq;


/**
* arq/BytesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sisArq.idl
* Quinta-feira, 17 de Outubro de 2019 00h15min24s GFT
*/

public final class BytesHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public BytesHolder ()
  {
  }

  public BytesHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = arq.BytesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    arq.BytesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return arq.BytesHelper.type ();
  }

}
