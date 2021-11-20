package clasesparatexto;
import java.io.*;
import javax.swing.JOptionPane;
/*
 * Algoritmo para leer un archivo:
 *1.Declarar una variable de tipo File;
 *2.Declarar una variable de tipo FileReader;
 *3.Declarar una variable de tipo String;
 *4.Preparar el archivo
 *5.Crear una instancia de tipo FileReader(lector)
 *6.Crear una instancia de tipo BufferReader
 *7.Inicializar la variable de tipo cadena en nada
 *8.Crear un ciclo que se repita muchas veces mientras la variable de tipo
 *cadena sea diferente de nada.
 *  8.1. Asignar a la variable de tipo cadena buffer.readLine();
 *  8.2. Si la variable de tipo cadena es diferente de null muestras el contenido.
 *9.Cerrar el buffer.
 *10.Cerrar el lector.
 */
public class LectorArchivo
{
   public static void main(String[]args){
    //Paso 1 
    File miArchivo;//variable para manipular el archivo
    //Paso 2
    FileReader leer; //variable lectora
    //Paso 3
    String cadena; //para recuperar las cadenas de texto
    //Paso 4
    miArchivo=new File("nuevocoso.txt");
    String KDNAKCH="";
    //Paso 5
    try{
    leer = new FileReader(miArchivo);
    //Paso 6}
    //el buffer se encarga de almacenar cosas
    BufferedReader almacenamiento = new BufferedReader(leer);//almacena lo que lee
    //Paso 7
    cadena=""; //inicializada
    //Paso 8
    while(cadena!=null){
        try{
            //Paso 8.1
        cadena=almacenamiento.readLine();//que almacene una línea de texto
        //Paso 8.2
        if(cadena!=null){
            
            //almacena 
            KDNAKCH=KDNAKCH+ cadena+"\n";
        }
        }catch(IOException err){
        }
    }
    //el Paso 9 no se cierra en el try, porque cerraría en la primera línea
    //Paso 9 cada que lees, cada que escribes necesitas prueba y error.
    try{
        almacenamiento.close();
        leer.close();
    }catch(IOException ejem){
    
    }
    
    
    
    
    
    
    
    
    
    }
catch(IOException err){
    System.err.println("Mira, no se pudo leer nada.");
    
    }    
    JOptionPane.showMessageDialog(null, KDNAKCH, 
    "Mostrando los datos del archivo con mucho kch",1); 
    
    
    
    
    
    
    
    }
    
}
