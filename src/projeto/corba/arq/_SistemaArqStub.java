package arq;


/**
* arq/_SistemaArqStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sisArq.idl
* Quinta-feira, 17 de Outubro de 2019 00h15min24s GFT
*/

public class _SistemaArqStub extends org.omg.CORBA.portable.ObjectImpl implements arq.SistemaArq
{

  public int list_Arq (String nome, String[] aq, String p)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("list_Arq", true);
                $out.write_string (nome);
                arq.arquivosHelper.write ($out, aq);
                $out.write_string (p);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return list_Arq (nome, aq, p        );
            } finally {
                _releaseReply ($in);
            }
  } // list_Arq

  public String[] att_clientes ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("att_clientes", true);
                $in = _invoke ($out);
                String $result[] = arq.arquivosHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return att_clientes (        );
            } finally {
                _releaseReply ($in);
            }
  } // att_clientes

  public String[] get_Arq (int a)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_Arq", true);
                $out.write_long (a);
                $in = _invoke ($out);
                String $result[] = arq.arquivosHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_Arq (a        );
            } finally {
                _releaseReply ($in);
            }
  } // get_Arq

  public void set_Arq (String[] aq, int idd)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_Arq", true);
                arq.arquivosHelper.write ($out, aq);
                $out.write_long (idd);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_Arq (aq, idd        );
            } finally {
                _releaseReply ($in);
            }
  } // set_Arq

  public String get_path (int a)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_path", true);
                $out.write_long (a);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_path (a        );
            } finally {
                _releaseReply ($in);
            }
  } // get_path

  public int qtd_clientes ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("qtd_clientes", true);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return qtd_clientes (        );
            } finally {
                _releaseReply ($in);
            }
  } // qtd_clientes

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:arq/SistemaArq:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _SistemaArqStub
