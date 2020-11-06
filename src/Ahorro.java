
public class Ahorro extends CuentaBanco {

    public Ahorro(long noCuenta, double saldo, long dpi, String nombre) {
        super(noCuenta, saldo, dpi, nombre);
    }

    @Override
    public double Acreditar(double credito) {
        double result = saldo + credito;
        return result;
    }

    @Override
    public double Debitar(double debito) {
        
        double result = 0;
        result = saldo - debito;
        
        return result;
    }

    @Override
    public double ActualizarSaldo(double actual) {
        double interes = saldo * 0.09;
        double result = saldo + interes;
        return result;
    }
    
    
}
