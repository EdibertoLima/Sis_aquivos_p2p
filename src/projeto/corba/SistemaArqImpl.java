package projeto.corba;

import arq.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.File;
import java.util.ArrayList;

public class SistemaArqImpl extends SistemaArqPOA {

    int id = 0;
    ArrayList<String[]> n_arq = new ArrayList<String[]>();
    ArrayList<String> nomes = new ArrayList<String>();
    ArrayList<String> path = new ArrayList<String>();

    /**
     *
     * @param nome
     * @param arquivos
     * @return
     */
    public int list_Arq(String nome, String arquivos[],String p) {
        System.out.println("cliente " + nome+" conectado com sucesso");
        n_arq.add(id, arquivos);
        nomes.add(id, nome);
        path.add(id,p);
        
        
        id++;
        return id-1;
    }

    public String[] att_clientes() {
        //lista todos os usario no dado momento
        String names[] = new String[nomes.size()];
        for (int a = 0; a < nomes.size(); a++) {
            names[a] = nomes.get(a);
        }
        return names;

    }

    public String[] get_Arq(int a) {
        //arquivo de user especifico
        String arq[] = new String[n_arq.size()];
        arq = n_arq.get(a);

        return arq;
    }
 
    
    public void set_Arq(String arquivos[],int idd){
        //att arquivos de um user
        n_arq.set(idd, arquivos);
    }
    public String get_path(int a){
        String p= path.get(a);
        return p;
    }
    public int qtd_clientes(){
        
        return id;
    
    }
   

    public void list_Arq(String nome, String arquivos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void set_Arq(java.lang.String arquivos, int idd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int list_Arq(java.lang.String nome, java.lang.String[] aq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
