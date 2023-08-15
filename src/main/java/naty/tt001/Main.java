package naty.tt001;

public class Main {
    public static void main(String[] args){
        Conta c1 = new ContaComum(50.0);
        Conta c2 = new ContaComum(100.0);
        ContaEspecial c3 = new ContaEspecial(100.0,200.0);
        ContaEspecial c4 = new ContaEspecial(50.0,100.0);
                
                
        //c2.transferePara(c1, 30.0);
        
        System.out.println("Conta = " + c3.getSaldo());
        System.out.println("Conta = " + c4.getSaldo());
        
        
//        c.deposito(1000.0);
//        
//        c.saque(1000.0);
//        
//        System.out.println("Saldo = " + c.getSaldo());
//       
        //alt+insert - criar coisinha 
       
    }
    // criar conta poupança que faz aniversario
}
