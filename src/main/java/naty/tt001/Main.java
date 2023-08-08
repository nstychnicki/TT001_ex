package naty.tt001;

public class Main {
    public static void main(String[] args){
        Conta c1 = new Conta(50.0);
        Conta c2 = new Conta(100.0);
        
        c1.transferePara(c2, 30.0);
        
        
        System.out.println("Conta = " + c2.getSaldo());
        
        
//        c.deposito(1000.0);
//        
//        c.saque(1000.0);
//        
//        System.out.println("Saldo = " + c.getSaldo());
//       
        //alt+insert - criar coisinha 
       
    }
    
}
