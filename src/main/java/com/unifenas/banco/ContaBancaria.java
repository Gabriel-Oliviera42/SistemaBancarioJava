package com.unifenas.banco;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false; // Não permite saque se valor <= 0 ou saldo insuficiente
        }
        this.saldo -= valor;
        return true;
    }

}