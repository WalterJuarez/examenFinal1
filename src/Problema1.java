import java.util.ArrayList;
public class Problema1 {

    
    public static void main(String[] args) {
        //ArrayList<Monetaria> cuentaM = new ArrayList<>();        
        //cuentaM.add(new Monetaria(1592648,1500.00,26664750,"Walter"));
        
        Monetaria cuenta1 = new Monetaria(1592648,1500.00,26664750,"Walter");
        double saldo1 = cuenta1.Acreditar(1500.15);
        System.out.println("datos de la cuenta " + cuenta1.toString());
        System.out.println("saldo de cuenta " + cuenta1.getSaldo());
        cuenta1.setSaldo(saldo1);
        System.out.println("saldo de cuenta (credito)" + cuenta1.getSaldo());
        saldo1 = cuenta1.Debitar(35.35);
        cuenta1.setSaldo(saldo1);
        System.out.println("saldo de cuenta (debito)" + cuenta1.getSaldo());
        saldo1 = cuenta1.Debitar(100);
        cuenta1.setSaldo(saldo1);
        System.out.println("saldo de cuenta (debito)" + cuenta1.getSaldo());
        saldo1 = cuenta1.Debitar(200);
        cuenta1.setSaldo(saldo1);
        System.out.println("saldo de cuenta (debito)" + cuenta1.getSaldo());
  
                
        
    }
    
}
