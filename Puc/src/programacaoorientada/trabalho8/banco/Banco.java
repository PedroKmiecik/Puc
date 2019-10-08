package programacaoorientada.trabalho8.banco;

import java.util.ArrayList;

import programacaoorientada.trabalho8.exceptions.*;

public class Banco {

	private String name;
	private double horario;
	private ContaCorrente novaConta;
	private ArrayList<ContaCorrente> contas = new ArrayList<>();
	private ArrayList<Integer> numeroContas = new ArrayList<>();

	public void criar_conta(int numero, String senha, double saldo) {
		ContaCorrente novaConta = new ContaCorrente(numero, senha, saldo);
		contas.add(novaConta);
		numeroContas.add(novaConta.getNumero());
	}

	public void sacar(int numero, String senha, double valor)
			throws ExcecaoContaInvalida, ExcecaoSenhaInvalida, ExcecaoHorarioInvalido, ExcecaoSaldoInsuficiente {
		if (horario < 8 || horario > 22)
			throw new ExcecaoHorarioInvalido("Saque não autorizado. Horário não permitido");
		if (numeroContas.contains(numero) == false)
			throw new ExcecaoContaInvalida("Saque não autorizado. Conta Inexistente");
		contas.get(numeroContas.indexOf(numero)).retirar(valor, senha);
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}

	public double getHorario() {
		return horario;
	}

}
