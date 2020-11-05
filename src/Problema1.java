import java.util.ArrayList;
public class Problema1 {

    
    public static void main(String[] args) {
        ArrayList<Monetaria> cuentaM = new ArrayList<>();
        cuentaM.add(new Monetaria(1592648,1500.00,26664750,"Walter"));
        
        for(int i =0; i < cuentaM.size(); i++){
            System.out.println("No de Cuenta: "+cuentaM.get(i).getNoCuenta());
            System.out.println("No de Dpi: "+cuentaM.get(i).getDpi());
            System.out.println("Nombre de Cuenta: "+cuentaM.get(i).getNombre());
            System.out.println("Saldo Inicial: "+cuentaM.get(i).getSaldo());
            
        }
  
                
        
    }
    
}
