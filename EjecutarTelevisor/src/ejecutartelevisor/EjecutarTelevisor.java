package ejecutartelevisor;
import java.util.ArrayList;
public class EjecutarTelevisor {

    public static void main(String[] args) {
        
        ArrayList <Televisor> tv = new ArrayList<>();
        
        Televisor t = new Televisor("001",55,650,"QLED");
        
        tv.add(t);
        
        tv.add(new Televisor("002",45,500,"XXXX"));
        
        tv.add(new Televisor("003",75,900,"YYYY"));
        
        for(int i = 0; i< tv.size(); i++){
        System.out.println("El precio del tv es : " + tv.get(i).getPrecio());
        }
        
    }
    
}
