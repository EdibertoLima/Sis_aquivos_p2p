package arq;


/**
* arq/_trans_ArqStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sisArq.idl
* Quinta-feira, 17 de Outubro de 2019 00h15min24s GFT
*/

public class _trans_ArqStub extends org.omg.CORBA.portable.ObjectImpl implements arq.trans_Arq
{

  public byte[] envia_Arq (String fName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("envia_Arq", true);
                $out.write_string (fName);
                $in = _invoke ($out);
                byte $result[] = arq.BytesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return envia_Arq (fName        );
            } finally {
                _releaseReply ($in);
            }
  } // envia_Arq

  public void set_clienteSA (String parth, int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_clienteSA", true);
                $out.write_string (parth);
                $out.write_long (id);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_clienteSA (parth, id        );
            } finally {
                _releaseReply ($in);
            }
  } // set_clienteSA

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:arq/trans_Arq:1.0"};

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
} // class _trans_ArqStub