
public class Monetaria extends CuentaBanco{

    public Monetaria(long noCuenta, double saldo, long dpi, String nombre) {
        super(noCuenta, saldo, dpi, nombre);
    }

    
    @Override
    public double Acreditar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Debitar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ActualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
