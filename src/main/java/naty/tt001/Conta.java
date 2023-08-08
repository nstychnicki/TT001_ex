package naty.tt001;

public class Conta {
    //atributos
    private Double saldo = 100.0;
    
    //construtores
    public Conta(Double valor){
        this.saldo = valor;
    }
    
    //métodos
    public Double getSaldo(){
        return this.saldo;
    }
    
    public void deposito(Double valor){
        this.saldo = this.saldo + valor;
    }
    
    public boolean saque(Double valor){
        if( this.saldo - valor >= 0.0){
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    
    public void transferePara(Conta destino, Double valor){
//        if(this.getSaldo() >= valor){
//            destino.saldo += valor;
//            this.saldo -= valor;
//        }
          
        if(this.saque(valor)){
            destino.deposito(valor);
        }
        
    }
}
