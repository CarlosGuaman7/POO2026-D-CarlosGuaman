package GestorPadelTexto;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import ejecutortallerpadel.PartidoPadel;
public class EscrituraTexto {

    private BufferedWriter salida;
    
    public EscrituraTexto(String nombre){
        try{
            salida = new BufferedWriter(new FileWriter(nombre));
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void guardarPartido(PartidoPadel p){
        try{
            String linea = p.getParticipante1()+";"+
                    p.getParticipante2()+";"+
                    p.getMarcador();
            salida.write(linea);
            salida.newLine();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void cerrarArchivo() {
        try {
            salida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
