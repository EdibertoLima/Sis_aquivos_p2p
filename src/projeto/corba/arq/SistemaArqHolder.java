package arq;

/**
* arq/SistemaArqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sisArq.idl
* Quinta-feira, 17 de Outubro de 2019 00h15min24s GFT
*/

public final class SistemaArqHolder implements org.omg.CORBA.portable.Streamable
{
  public arq.SistemaArq value = null;

  public SistemaArqHolder ()
  {
  }

  public SistemaArqHolder (arq.SistemaArq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = arq.SistemaArqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    arq.SistemaArqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return arq.SistemaArqHelper.type ();
  }

}
