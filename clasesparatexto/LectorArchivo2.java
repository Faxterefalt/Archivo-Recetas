package clasesparatexto;
import java.io.*;
import javax.swing.JOptionPane;
public class LectorArchivo2
{
    public static void main (String[] args){
        int registros=1;
        File archivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena, ingrediente1="", ingrediente2="",ingrediente3="";
        archivo= new File("usuario.txt");
        try{
        leer= new FileReader(archivo);
        almacenamiento=new BufferedReader(leer);
        cadena="";
        while(cadena!=null){
            try{
            cadena=almacenamiento.readLine();
            ingrediente1=cadena;
            cadena=almacenamiento.readLine();
            ingrediente2=cadena;
            cadena=almacenamiento.readLine();
            ingrediente3=cadena;
                if(cadena!=null){
                    //la línea de abajo tiene error(!)
                    JOptionPane.showMessageDialog(null, "Ingrediente 1: "+ingrediente1
                        +"\nIngrediente 2: "+ingrediente2+"\nIngrediente 3: "+ingrediente3,
                        "Mostranfo datos de registro #",registros);
                    registros++;
                    }
            }catch(IOException ejem){
            }
        }
                try{
                    almacenamiento.close();
                    leer.close();
                    }catch(IOException ejem){
                    }
        
    }catch(IOException err){
    
    }
    
    }
}
