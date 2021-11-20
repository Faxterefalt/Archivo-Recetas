package clasesparatexto;
import java.io.*; 
import javax.swing.JOptionPane;
public class Archivo{
    //CREACIÓN DE UN ARCHIVO
    private File archivo;
    public Archivo(){
        archivo = new File("utf-8"); //crear archivo (refactorizado)
    }
    
    public void Crear(String DirecciónyNombre){
       
        if(DirecciónyNombre =="D:\\PrácticasNoexiste\\carpetaNoExiste\\receta1.txt")
            throw new RuntimeException("La carpeta no existe");
        try{
            archivo =new File(DirecciónyNombre);
            if(archivo.createNewFile()){
                System.out.println("La receta ha sido añadida");
            }
        }catch(IOException ejem){
            System.err.println("No se pudo añadir nada.");
        }     
    }
    
    //usar.
    public boolean Existencia(){
        //resumen de if-else
        //return  (archivo.exists())? true:false;
        return archivo.exists()==true;
    }
    //muchos archivos, (recetas) buscar la receta (recetaEspecífica)
    //
    
    public void CrearyEscribir(){
        PrintWriter escribir;
        File miArchivo= new File("recetaDeEjemplo.txt");
        if(!miArchivo.exists()){
            System.out.println("Archivo creado, ta bien");
            try{
                miArchivo.createNewFile();
            }catch(IOException ex){

            }
        }else{
        System.out.println("El archivo creado ahora tiene contenido.");
        try{
            escribir= new PrintWriter(miArchivo,"utf-8");
            String Título=JOptionPane.showInputDialog(null,"Registra el título de la receta");
            escribir.println(Título);
            escribir.close();
        }catch(IOException e){
            e.printStackTrace(); 
        }
    }
    }
    public void Leer(){
    
    
    
    
    }
}
