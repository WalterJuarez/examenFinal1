
public abstract class Cliente {
    long dpi;
    String nombre;

    public Cliente() {
    }

    public Cliente(long dpi, String nombre) {
        this.dpi = dpi;
        this.nombre = nombre;
    }

    public abstract double Acreditar();
    
    public abstract double Debitar();
    
    public abstract double ActualizarSaldo();
    
    
    
}
