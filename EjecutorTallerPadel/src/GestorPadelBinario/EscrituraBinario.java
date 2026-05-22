package GestorPadelBinario;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ejecutortallerpadel.PartidoPadel;
public class EscrituraBinario {
    
    private ObjectOutputStream salida;
    
    public EscrituraBinario(String nombre){
        
        try{
            salida = new ObjectOutputStream(new FileOutputStream(nombre));
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void guardarPartido(PartidoPadel p){
        try{
            salida.writeObject(p);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void cerrarArchivo(){
        try{
            salida.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
