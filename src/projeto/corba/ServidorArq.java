package projeto.corba;


import arq.*;
import org.omg.CosNaming.*; 
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class ServidorArq{

 public static void main(String args[]){
     
   
 try{   
        String ag[]={"-ORBInitialHost 900"};
	ORB orb = ORB.init(ag,null); 	

		
	org.omg.CORBA.Object objPoa = orb.resolve_initial_references("RootPOA");
	
	POA rootPOA = POAHelper.narrow(objPoa);		


	org.omg.CORBA.Object obj = orb.resolve_initial_references("NameService");

	NamingContext naming = NamingContextHelper.narrow(obj);

	SistemaArqImpl SA = new SistemaArqImpl();

	org.omg.CORBA.Object   objRef =	 rootPOA.servant_to_reference(SA);

        
	NameComponent[] name = {new NameComponent("Sist_arq","conexao")};

	naming.rebind(name,objRef);
        
        

	rootPOA.the_POAManager().activate();

	System.out.println("Servidor Pronto ...");

	orb.run();

        
   }catch (Exception ex){
		System.out.println("Erro");
		ex.printStackTrace();}
  }

}
