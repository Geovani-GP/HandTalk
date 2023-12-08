/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handtalk;

import java.io.Serializable;

/**
 *
 * @author oscar
 */
public class Iniciar implements Serializable{
    
    String nombre, correo, contraseña;
    
    public Iniciar(String nombre, String correo, String contraseña){
        
        this.nombre=nombre;
        this.correo=correo;
        this.contraseña=contraseña;
    }
}
