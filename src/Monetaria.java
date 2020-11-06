
public class Monetaria extends CuentaBanco{

    public Monetaria(long noCuenta, double saldo, long dpi, String nombre) {
        super(noCuenta, saldo, dpi, nombre);
    }

    
    @Override
    public double Acreditar(double credito) {
        
        double result = saldo + credito;
        
        return result;
    }

    @Override
    public double Debitar(double debito) {
        int cont = 1;
        double result = 0;
        
        if(cont < 3){
            cont++;
            result = saldo - debito;
        }else{
            cont = 1;
            result = saldo - debito -10;
        }
        return result;
    }

    @Override
    public double ActualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
