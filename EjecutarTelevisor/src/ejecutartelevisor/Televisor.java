package ejecutartelevisor;

public class Televisor {
    
    private String numSerie;
    private int tamanio;
    private double precio;
    private String modelo;

    public Televisor(String numSerie, int tamanio, double precio, String modelo) {
        this.numSerie = numSerie;
        this.tamanio = tamanio;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
