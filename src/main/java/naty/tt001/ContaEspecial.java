package naty.tt001;


public class ContaEspecial extends Conta{
    //contaespecial é filho de conta
    private Double limite;
    
    
    public ContaEspecial(Double saldo, Double limite){
        super(saldo);
        this.limite = limite;
    }

    public boolean saque(Double valor){
        if(super.getSaldo() - valor + this.limite >= 0.0){
            super.saque(valor);
            return true;
        }
        return false;
    }  
    
}


