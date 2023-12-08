
package handtalk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FuncionReg {
    
    ArrayList<Registroo> arrayreg = new ArrayList();
    String nombre, apellidos, correo, contraseña, contraseñaCON;
    
    
    public FuncionReg(){    
    }
    
    void guardararchivoRegistro(String nombre, String apellidos, String correo, String contraseña, String contraseñaCON){
          
        File registro;
        FileWriter escribir;
        PrintWriter linea;
        registro = new File("registros.txt");
        if(!registro.exists()){
            try {
                registro.createNewFile();
                Registroo Reg = new Registroo (nombre, apellidos, correo, contraseña, contraseñaCON);
                arrayreg.add(Reg);
                escribir = new FileWriter(registro,true);
                linea = new PrintWriter(escribir);
                //Escribir en el archivo
                linea.println(nombre);
                linea.println(apellidos);
                linea.println(correo);
                linea.println(contraseña);
                linea.println( );
                linea.println( );
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(FuncionReg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                Registroo Reg = new Registroo (nombre , apellidos, correo, contraseña, contraseñaCON);
                arrayreg.add(Reg);
                escribir = new FileWriter(registro,true);
                linea = new PrintWriter(escribir);
                //Escribir en el archivo
                linea.println(nombre);
                linea.println(apellidos);
                linea.println(correo);
                linea.println(contraseña);
                linea.println( );
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(FuncionReg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         
    }
}
