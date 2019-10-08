package programacaoorientada.trabalho8.banco;

import programacaoorientada.trabalho8.exceptions.*;

public class ContaCorrente {

	private int numero;
	private String senha;
	private double saldo;

	public ContaCorrente(int numero, String senha, double saldo) {
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
	}

	public void retirar(double valor, String senha) throws ExcecaoSaldoInsuficiente, ExcecaoSenhaInvalida {
		if (senha != this.senha)
			throw new ExcecaoSenhaInvalida("Saque não autorizado. Senha Inválida");
		if (saldo < valor)
			throw new ExcecaoSaldoInsuficiente("Saque não autorizado. Saldo Insuficiente. Saldo Atual: R$" + saldo);
		saldo -= valor;
		System.out.println("Saque no valor de R$" + valor + " Autorizado. " + "Saldo Atual: R$" + saldo);
	}

	public int getNumero() {
		return numero;
	}

}
