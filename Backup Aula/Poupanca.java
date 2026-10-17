public class Poupanca extends Conta{

    Poupanca(double numbank,double saldo) {
        super(numbank,saldo);
        this.numbank=numbank;
        this.saldo=saldo;

    }

    public double verSaldo(){
        return this.getSaldo();
    }
    public double meuDeposito(double valor){
        return this.getSaldo + valor;
    }

   
    }
    


