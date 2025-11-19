package com.unifenas.banco;

public class ContaBancaria {
    private double saldo = 0.0;

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            // Hotfix: mudei a mensagem da exceção para maior clareza
            throw new IllegalArgumentException("Saldo inicial deve ser maior ou igual a zero.");
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

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }
}