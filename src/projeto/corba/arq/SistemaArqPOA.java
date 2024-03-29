package arq;


/**
* arq/SistemaArqPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sisArq.idl
* Quinta-feira, 17 de Outubro de 2019 00h15min24s GFT
*/

public abstract class SistemaArqPOA extends org.omg.PortableServer.Servant
 implements arq.SistemaArqOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("list_Arq", new java.lang.Integer (0));
    _methods.put ("att_clientes", new java.lang.Integer (1));
    _methods.put ("get_Arq", new java.lang.Integer (2));
    _methods.put ("set_Arq", new java.lang.Integer (3));
    _methods.put ("get_path", new java.lang.Integer (4));
    _methods.put ("qtd_clientes", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // arq/SistemaArq/list_Arq
       {
         String nome = in.read_string ();
         String aq[] = arq.arquivosHelper.read (in);
         String p = in.read_string ();
         int $result = (int)0;
         $result = this.list_Arq (nome, aq, p);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // arq/SistemaArq/att_clientes
       {
         String $result[] = null;
         $result = this.att_clientes ();
         out = $rh.createReply();
         arq.arquivosHelper.write (out, $result);
         break;
       }

       case 2:  // arq/SistemaArq/get_Arq
       {
         int a = in.read_long ();
         String $result[] = null;
         $result = this.get_Arq (a);
         out = $rh.createReply();
         arq.arquivosHelper.write (out, $result);
         break;
       }

       case 3:  // arq/SistemaArq/set_Arq
       {
         String aq[] = arq.arquivosHelper.read (in);
         int idd = in.read_long ();
         this.set_Arq (aq, idd);
         out = $rh.createReply();
         break;
       }

       case 4:  // arq/SistemaArq/get_path
       {
         int a = in.read_long ();
         String $result = null;
         $result = this.get_path (a);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 5:  // arq/SistemaArq/qtd_clientes
       {
         int $result = (int)0;
         $result = this.qtd_clientes ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:arq/SistemaArq:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SistemaArq _this() 
  {
    return SistemaArqHelper.narrow(
    super._this_object());
  }

  public SistemaArq _this(org.omg.CORBA.ORB orb) 
  {
    return SistemaArqHelper.narrow(
    super._this_object(orb));
  }


} // class SistemaArqPOA
