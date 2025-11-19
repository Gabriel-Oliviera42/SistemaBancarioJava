package com.unifenas.banco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    void deveInicializarComSaldoPositivo() {
        ContaBancaria conta = new ContaBancaria(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void deveLancarExcecaoSeSaldoInicialNegativo() {
        // Verifica o tratamento de erros [cite: 11]
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new ContaBancaria(-50.0);
        });
        assertEquals("Saldo inicial não pode ser negativo.", exception.getMessage());
    }

    @Test
    void deveSacarComSucesso() { // 3º Teste
        ContaBancaria conta = new ContaBancaria(200.0);
        assertTrue(conta.sacar(50.0));
        assertEquals(150.0, conta.getSaldo()); // Verifica o retorno de função [cite: 11]
    }

    @Test
    void naoDeveSacarComSaldoInsuficiente() { // 4º Teste
        ContaBancaria conta = new ContaBancaria(100.0);
        assertFalse(conta.sacar(150.0));
        assertEquals(100.0, conta.getSaldo()); // Saldo não deve mudar
    }

    @Test
    void naoDeveSacarValorNegativoOuZero() { // 5º Teste
        ContaBancaria conta = new ContaBancaria(100.0);
        assertFalse(conta.sacar(0.0));
        assertFalse(conta.sacar(-10.0));
        assertEquals(100.0, conta.getSaldo()); // Saldo não deve mudar
    }

    @Test
    void deveDepositarComSucesso() { // 6º Teste
        ContaBancaria conta = new ContaBancaria(100.0);
        assertTrue(conta.depositar(50.0));
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void deveDepositarGrandesValores() { // 7º Teste
        ContaBancaria conta = new ContaBancaria(0.0);
        assertTrue(conta.depositar(999999.99));
        assertEquals(999999.99, conta.getSaldo());
    }

    @Test
    void naoDeveDepositarValorNegativoOuZero() { // 8º Teste
        ContaBancaria conta = new ContaBancaria(100.0);
        assertFalse(conta.depositar(0.0));
        assertFalse(conta.depositar(-50.0));
        assertEquals(100.0, conta.getSaldo()); // Saldo não deve mudar
    }
}