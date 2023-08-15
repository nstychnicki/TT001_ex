package naty.tt001;

public class ContaComum extends Conta{
    
    public ContaComum(Double saldo){
        super(saldo);
    }
    
    public boolean saque(Double valor){
        if( this.getSaldo() - valor >= 0.0){
            super.saque(valor);
            return true;
        }
        return false;
    }
}
