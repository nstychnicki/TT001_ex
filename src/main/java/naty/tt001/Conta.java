package naty.tt001;

//classe pai
public abstract class Conta {
    //so pode criar um objeto a partir das conta filhas por conta do abstrato
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
        this.saldo = this.saldo - valor;
        return true;
    }
    
    /*public boolean saque(Double valor){
        if( this.saldo - valor >= 0.0){
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    vai para as classes filho
    }*/
    
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
