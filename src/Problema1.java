import java.util.ArrayList;
public class Problema1 {

    
    public static void main(String[] args) {
        ArrayList<Monetaria> cuentaM = new ArrayList<>();        
        ArrayList<Ahorro> cuentaA = new ArrayList<>();
        cuentaM.add(new Monetaria(1592648,1500.00,26664750,"Walter"));
        cuentaM.add(new Monetaria(98732184,2735.20,9512354,"Daniel"));
        cuentaM.add(new Monetaria(123456,10200.45,33365656,"Evelyn"));
        cuentaA.add(new Ahorro(252525,325.5,654987321,"Sheily"));
        cuentaA.add(new Ahorro(464544,450,9713579,"Sergio"));
        cuentaA.add(new Ahorro(7893123,90123.45,1593574,"Mynor"));
        
        for(int i = 0; i < cuentaM.size(); i++){
            
            System.out.println("Los Datos Monetarios de la "+cuentaM.get(i).toString());
            double credito = Math.random()*100;
            double saldo = cuentaM.get(i).Acreditar(credito);
            cuentaM.get(i).setSaldo(saldo);
            System.out.println("Se acredito: "+credito);
            System.out.println("Saldo nuevo: "+cuentaM.get(i).getSaldo());
            for(int j = 1; j <= 3; j++){
                if( j < 3){
                    double debito = Math.random()*100;
                    saldo = cuentaM.get(i).Debitar(debito);
                    cuentaM.get(i).setSaldo(saldo);
                    System.out.println("Se debito: "+ debito);
                    System.out.println("Saldo nuevo: "+cuentaM.get(i).getSaldo());
                }else{
                    double debito = (Math.random()*100);
                    double debitot = debito + 10;
                    saldo = cuentaM.get(i).Debitar(debitot);
                    cuentaM.get(i).setSaldo(saldo);
                    System.out.println("Se debito: "+ debito);
                    System.out.println("Cargo por manejo: 10");
                    System.out.println("Saldo nuevo: "+cuentaM.get(i).getSaldo());                    
                }
                
            }
        }
           System.out.println("\n\n"); 
            
           for(int x = 0; x < cuentaA.size(); x++){
            
            System.out.println("Los Datos de Ahorro de la "+cuentaA.get(x).toString());
            double creditoA = Math.random()*100;
            double saldoA = cuentaA.get(x).Acreditar(creditoA);
            cuentaA.get(x).setSaldo(saldoA);
            System.out.println("Se acredito: "+creditoA);
            System.out.println("Saldo nuevo: "+cuentaA.get(x).getSaldo());
            for(int j = 1; j <= 3; j++){
                if( j < 3){
                    double debitoA = Math.random()*100;
                    saldoA = cuentaM.get(x).Debitar(debitoA);
                    cuentaM.get(x).setSaldo(saldoA);
                    System.out.println("Se debito: "+ debitoA);
                    System.out.println("Saldo nuevo: "+cuentaA.get(x).getSaldo());
                }
            }    
            double interes = cuentaA.get(x).getSaldo() * 0.09;
            System.out.println("su cuenta acumulo 9% de su saldo final");
            System.out.println("Monto: " + interes);
            saldoA = cuentaA.get(x).ActualizarSaldo(saldoA)+interes;
            cuentaA.get(x).setSaldo(saldoA);
            System.out.println("Su nuevo saldo + el interes: "+cuentaA.get(x).getSaldo());
            
           }
        System.out.println("\n\n");
            
        
        }
    }        
    

