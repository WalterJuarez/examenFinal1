
public abstract class Cliente {
    long dpi;
    String nombre;

    public Cliente(long dpi, String nombre) {
        this.dpi = dpi;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dpi=" + dpi + ", nombre=" + nombre + '}';
    }

    
    abstract public double Acreditar(double credito);
    
    abstract public double Debitar(double debito);
    
    abstract public double ActualizarSaldo();
    
    
    
}
