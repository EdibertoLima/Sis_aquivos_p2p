/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.corba;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import arq.*;

/**
 *
 * @author ediberto
 */
public class Trans_ArqImp extends trans_ArqPOA {

    int Idd;
    String dir;
    private byte[] array;

    public byte[] envia_Arq(String fName) {

        //String sharedFolder = TransferClient.staticPath;
        //Write the file contents to the new file created
        File newFile = new File(dir+"/"+fName);
        try {
            array = Files.readAllBytes(Paths.get(newFile.getAbsolutePath()));
        } catch (Exception e) {
            System.out.println(e);
        }
        return array;
    }

  

    public void set_clienteSA(String parth, int id) {
        dir = parth;
        Idd = id;
    }

}
