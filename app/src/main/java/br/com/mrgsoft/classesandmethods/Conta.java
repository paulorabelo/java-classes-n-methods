package br.com.mrgsoft.classesandmethods;

class Conta {

    private int numeroConta;
    private double saldo = 100;

    public double recupearSaldo(){
        return this.saldo;
    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }
}
