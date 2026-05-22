
package ejecutortallerpadel;
import java.io.Serializable;
public class PartidoPadel implements Serializable {
    
    private String participante1;
    private String participante2;
    private String marcador;

    public PartidoPadel(String participante1, String participante2, String marcador) {
        this.participante1 = participante1;
        this.participante2 = participante2;
        this.marcador = marcador;
    }

    public String getParticipante1() {
        return participante1;
    }

    public void setParticipante1(String participante1) {
        this.participante1 = participante1;
    }

    public String getParticipante2() {
        return participante2;
    }

    public void setParticipante2(String participante2) {
        this.participante2 = participante2;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
    
    @Override
    public String toString() {

        return String.format(
            "Pareja 1: %s\nPareja 2: %s\nMarcador: %s\n",
            participante1,
            participante2,
            marcador
        );
    }
}
