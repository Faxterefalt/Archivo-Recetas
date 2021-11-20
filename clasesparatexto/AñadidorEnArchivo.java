package clasesparatexto;
import java.io.*;
import javax.swing.JOptionPane;
public class AñadidorEnArchivo
{
  

    public static void main(String[] args){
        File archivo; //para manipular al archivo
        FileWriter escribir; //para escribir en el archivo
        PrintWriter línea; //tambien escribe
        String cant="",uni="",nom="";
        archivo= new File("usuario.txt");
          if(!archivo.exists()){
            try{
        archivo.createNewFile();
        cant=JOptionPane.showInputDialog(null,"ingresa la cantidad:");
        uni=JOptionPane.showInputDialog(null,"ingresa la unidad:");
        nom=JOptionPane.showInputDialog(null,"ingresa el ingrediente:");
          escribir=new FileWriter(archivo,true); //el true comprueba que si, hay un archivo ya
          //añade al final
          línea = new PrintWriter(escribir);//sirve para escribir en varias líneas
          //Escribir en el archivo:
          línea.print(cant+" ");
          línea.print(uni+" ");
          línea.print(nom+" ");
          línea.close();
          escribir.close();
        }catch(IOException ejem){
        }
            }
            else{
                 try{
        
        cant=JOptionPane.showInputDialog(null,"ingresa la cantidad: "
                );
        uni=JOptionPane.showInputDialog(null,"ingresa la unidad: "+
                "(si sólo es el ingrediente, no escriba nada y pulse aceptar)");
        nom=JOptionPane.showInputDialog(null,"ingresa el ingrediente:"+
                "vavava");
          escribir=new FileWriter(archivo,true); //el true comprueba que si, hay un archivo ya
          //añade al final
          línea = new PrintWriter(escribir);//sirve para escribir en varias líneas
          //Escribir en el archivo:
          línea.print(cant+" ");
          línea.print(uni+" ");
          línea.print(nom+" ");
          línea.println(" ");
          línea.close();
          escribir.close();
        }catch(IOException ejem){
        }
            
            }
          
    
}
    
  }
