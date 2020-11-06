

public abstract class CuentaBanco extends Cliente{
    long noCuenta;
    double saldo;
    

    public CuentaBanco(long noCuenta, double saldo, long dpi, String nombre) {
        super(dpi, nombre);
        this.noCuenta = noCuenta;
        this.saldo = saldo;
        
    }

    public long getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(long noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" + "noCuenta= " + noCuenta + " nombre= "+ nombre +", saldo=" + saldo + '}';
    }

  
    
}
