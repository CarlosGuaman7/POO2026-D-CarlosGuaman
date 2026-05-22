package GestorPadelBinario;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import ejecutortallerpadel.PartidoPadel;
public class LecturaBinario {
    
    private ObjectInputStream entrada;
    
    public LecturaBinario(String nombre){
        
        try{
           entrada = new ObjectInputStream(new FileInputStream(nombre));  
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void leerPartidos(){
        
        try{
            while(true){
                PartidoPadel p = (PartidoPadel)entrada.readObject();
                System.out.println(p);
            }
        }catch(EOFException e){
            System.out.println("Fin del archivo");
        }catch(IOException| ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void cerrarArchivo(){
        
        try{
            entrada.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
