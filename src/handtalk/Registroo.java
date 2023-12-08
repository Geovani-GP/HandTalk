
package handtalk;

import java.io.Serializable;


public class Registroo implements Serializable{
    
    String nombre, apellidos, correo, contraseña, contraseñaCON;
    
    public Registroo(String nombre, String apellidos, String correo, String contraseña, String contraseñaCON){
        
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.correo=correo;
        this.contraseña=contraseña;
        this.contraseñaCON=contraseñaCON;
    }
}
