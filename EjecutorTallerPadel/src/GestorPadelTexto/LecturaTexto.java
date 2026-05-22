
package GestorPadelTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ejecutortallerpadel.PartidoPadel;
public class LecturaTexto {
    
    private BufferedReader entrada;
    
    public LecturaTexto(String nombre){
        try{
            entrada = new BufferedReader(new FileReader(nombre));
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void leerPartido(){
        try{
            String linea;
            while((linea = entrada.readLine())!= null){
                String[] datos= linea.split(";");
                if(datos.length < 3){
                    System.out.println("Linea malformada, ignorando: " + linea);
                    continue;
                }
                PartidoPadel p= new PartidoPadel(datos[0],datos[1],datos[2]);
                System.out.println(p);
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
     public void cerrarArchivo() {
        try {
            entrada.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
     
}
