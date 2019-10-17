package projeto.corba;

import arq.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.in;
import java.util.concurrent.Executors;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class ClienteSA {
    
    
     static String nome;
     static String parth ;
     int Id;
     public  ClienteSA(String n, String d){
         
     nome=n;
     parth=d;
     usuario();
     
     }
     
    public void usuario()  {
       
      
        try {
            
           File arquivos[] = null;
            //comunicaçao com servidor
           String ag[]={"-ORBInitialHost 900"};
            ORB orb = ORB.init(ag, null);
            org.omg.CORBA.Object obj = orb.resolve_initial_references("NameService");

            NamingContext naming = NamingContextHelper.narrow(obj);

            NameComponent[] name = {new NameComponent("Sist_arq", "conexao")};

            org.omg.CORBA.Object objRef = naming.resolve(name);

            SistemaArq SA = SistemaArqHelper.narrow(objRef);

            //server cliente
            ORB orb2 = ORB.init(ag, null);

            org.omg.CORBA.Object objPoa = orb2.resolve_initial_references("RootPOA");

            POA rootPOA = POAHelper.narrow(objPoa);

            org.omg.CORBA.Object obj2 = orb2.resolve_initial_references("NameService");

            NamingContext naming2 = NamingContextHelper.narrow(obj2);
            
            Trans_ArqImp SA2 = new Trans_ArqImp();

            org.omg.CORBA.Object objRef2 = rootPOA.servant_to_reference(SA2);

            NameComponent[] name2 = {new NameComponent("cliente", nome)};

            naming2.rebind(name2, objRef2);

            
            File diretorio = new File(parth);
            arquivos = diretorio.listFiles();
            int leng = arquivos.length;
            String N_arq[] = new String[leng];
            for (int j = 0; j < leng; j++) {
                N_arq[j] = arquivos[j].getName();
            }
            
            
             Id = SA.list_Arq(nome, N_arq,parth);
            
           
            
            rootPOA.the_POAManager().activate();

            System.out.println("Servidor cliente Pronto ...");

            Executors.newSingleThreadExecutor().execute(()->orb.run());
            
            //set_clienteSA(parth,id)
        } catch (Exception e) {
            System.out.println("Outro Erro : " + e);
            e.printStackTrace(System.out);
        }
        
        

    }
    public void inter(){
        Iter_Server_user a = new Iter_Server_user();
    
    }




}
