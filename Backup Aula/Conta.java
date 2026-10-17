public abstract class Conta {
    private double numConta;
    private double numBanco;
    private double saldo;
    private double deposito;
    private double saque;

    //construtor

    Conta(double numbank;double saldo){
        this.numbank=numbank;
        this.saldo=saldo;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(double numBanco) {
        this.numBanco = numBanco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    



    






}
