/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handtalk;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class FuncionSes {
    
    
    
    
    ArrayList<Registroo> arrayreg = new ArrayList();
    String nombre, correo, contraseña;
    
    public void validarUsuario(String usuarios[], String nombre, String correo, String contraseña, int intentos){
        boolean encontrado=false;
        
        for (int i = 0; i < usuarios.length; i++) {
            
            if((usuarios[i].equalsIgnoreCase(correo)&& usuarios[i+1].equals(contraseña))){
                
                encontrado=true;
                JOptionPane.showMessageDialog(null, "Bienvenido ");
                intentos=0;
                
                break;
                
            }     
        }
        
        if(intentos>0){
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            System.exit(0);
            
        }
    }
}
