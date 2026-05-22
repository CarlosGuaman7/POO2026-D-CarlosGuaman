package ejecutortallerpadel;
import GestorPadelBinario.*;
import GestorPadelTexto.*;
public class EjecutorTallerPadel {

    public static void main(String[] args) {
        PartidoPadel p1 = new PartidoPadel("Juan/Carlos", "Pedro/Luis", "6-4 7-5");
        PartidoPadel p2 = new PartidoPadel("Ana/Maria", "Sofia/Lucia","6-3 6-2");
        PartidoPadel p3 = new PartidoPadel("Jose/Pedro", "Diana/Ariana","9-2 3-4");
        
        EscrituraBinario eb = new EscrituraBinario("partidos.dat");

        eb.guardarPartido(p1);
        eb.guardarPartido(p2);
        eb.guardarPartido(p3);

        eb.cerrarArchivo();

        System.out.println("LECTURA BINARIA");

        LecturaBinario lb = new LecturaBinario( "partidos.dat" );

        lb.leerPartidos();
        lb.cerrarArchivo();

        EscrituraTexto et = new EscrituraTexto("partidos.txt");

        et.guardarPartido(p1);
        et.guardarPartido(p2);

        et.cerrarArchivo();

        System.out.println("LECTURA TEXTO");

        LecturaTexto lt = new LecturaTexto("partidos.txt");
        lt.leerPartido();

        lt.cerrarArchivo();
    }
    
    
}
