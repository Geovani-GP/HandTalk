
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


public void crearCuestionarioUno(String nombreUsuario, String correoUsuario,
                                  String respuesta1, String respuesta2, String respuesta3,
                                  String respuesta4, String respuesta5) {

  int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;

    if (respuesta1.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }

    if (respuesta2.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }

    if (respuesta3.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }

    if (respuesta4.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }
if (respuesta5.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }


        // Separar el nombre del correo antes del @
        String[] partesCorreo = correoUsuario.split("@");
        String nombreCarpeta = partesCorreo[0];

        // Crear la carpeta si no existe
        File carpetaUsuario = new File(nombreCarpeta);
        carpetaUsuario.mkdir();

        // Crear el archivo Cuestionario1.txt dentro de la carpeta del usuario
        File archivoCuestionario = new File(carpetaUsuario, "Cuestionario1.txt");

        try {
            FileWriter escritor = new FileWriter(archivoCuestionario);

            // Escribir en el archivo los datos proporcionados
            escritor.write("Resultado del Cuestionario 1: "+"\n");
            escritor.write("Nombre del usuario: " + nombreUsuario + "\n");
            escritor.write("Correo del usuario: " + correoUsuario + "\n");
            escritor.write("Respuesta 1: " + respuesta1 + "\n");
            escritor.write("Respuesta 2: " + respuesta2 + "\n");
            escritor.write("Respuesta 3: " + respuesta3 + "\n");
            escritor.write("Respuesta 4: " + respuesta4 + "\n");
            escritor.write("Respuesta 5: " + respuesta5 + "\n");
            escritor.write("Respuestas correctas: " + respuestasCorrectas + "\n");
            escritor.write("Respuestas incorrectas: " + respuestasIncorrectas + "\n");
            // Cerrar el escritor
            escritor.close();

           // System.out.println("Archivo Cuestionario1.txt creado correctamente en la carpeta " + nombreCarpeta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public void crearCuestionarioDos(String nombreUsuario, String correoUsuario,
                                  String respuesta1, String respuesta2, String respuesta3,
                                  String respuesta4) {

  int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;

    if (respuesta1.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }

    if (respuesta2.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }

    if (respuesta3.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }

    if (respuesta4.equals("Correcto")) {
        respuestasCorrectas++;
    } else {
        respuestasIncorrectas++;
    }



        // Separar el nombre del correo antes del @
        String[] partesCorreo = correoUsuario.split("@");
        String nombreCarpeta = partesCorreo[0];

        // Crear la carpeta si no existe
        File carpetaUsuario = new File(nombreCarpeta);
        carpetaUsuario.mkdir();

        // Crear el archivo Cuestionario1.txt dentro de la carpeta del usuario
        File archivoCuestionario = new File(carpetaUsuario, "Cuestionario2.txt");

        try {
            FileWriter escritor = new FileWriter(archivoCuestionario);

            // Escribir en el archivo los datos proporcionados
            escritor.write("Resultado del Cuestionario 2: "+"\n");
            escritor.write("Nombre del usuario: " + nombreUsuario + "\n");
            escritor.write("Correo del usuario: " + correoUsuario + "\n");
            escritor.write("Respuesta 1: " + respuesta1 + "\n");
            escritor.write("Respuesta 2: " + respuesta2 + "\n");
            escritor.write("Respuesta 3: " + respuesta3 + "\n");
            escritor.write("Respuesta 4: " + respuesta4 + "\n");
            escritor.write("Respuestas correctas: " + respuestasCorrectas + "\n");
            escritor.write("Respuestas incorrectas: " + respuestasIncorrectas + "\n");
            // Cerrar el escritor
            escritor.close();

           // System.out.println("Archivo Cuestionario1.txt creado correctamente en la carpeta " + nombreCarpeta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
