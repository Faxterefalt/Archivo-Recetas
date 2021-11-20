package clasesparatexto;
import java.io.*;
import javax.swing.JOptionPane;
public class CreadorArchivo
{
    public static void main(String args[]){
    /*txt (texto plano y sin formato)
     * Algoritmo para escribir en un archivo desde Java:
     * 1. Crear una variable de tipo File
     * 2. Crear una variable de tipo PrintWriter
     * 3. Preparar el archivo
     * 4. Verificar si el archivo no existe
     *      4.1. Crear el Archivo.txt
     *      4.2. De lo contrario (else):
     *          4.2.1. Preparar el archivo para escribir
     *          4.2.2. Escribir en el archivo
     *          4.2.3. Cerrar el Archivo.txt
     */
    String nombre;
    //Paso 1
    //para manipular el archivo
    //Paso 2
    PrintWriter escribir; //para rellenar el archivo
    //Paso 3
    File miArchivo= new File("nuevocoso.txt");
    //Paso 4
    if(!miArchivo.exists()){
        System.out.println("Archivo creado, ta bien");
        try{
            //Paso 4.1 -código donde pueden ocurrir errores
            miArchivo.createNewFile();
        }catch(IOException ex){
            
        }
    }
    //Paso 4.2
    else{
        //Paso 4.2.1
        //utf-8 indica que escribes en formato de texto plano
        System.out.println("El archivo creado ahora tiene contenido.");
        try{
            escribir= new PrintWriter(miArchivo,"utf-8");
            //Escribir algo que ingrese el usuario
            nombre=JOptionPane.showInputDialog(null,"Ingresa tu nombre.");
            //Paso 4.2.2
            escribir.println(nombre);
            
            //Paso 4.2.3
            escribir.close();
        }catch(IOException e){
            e.printStackTrace(); //te manda el error específico que puede llegar a ocurrir
        }
    }
}
}
