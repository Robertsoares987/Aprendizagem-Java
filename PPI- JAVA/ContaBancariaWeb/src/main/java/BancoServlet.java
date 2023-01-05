
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int balance;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomeCliente = request.getParameter("nomeCliente");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String depositarValor = request.getParameter("depositarValor");
		String sacarValor = request.getParameter("sacarValor");
		String operacao = request.getParameter("operacao");
		String valorSaque = request.getParameter("valorSaque");
		String valorDeposito = request.getParameter("valorDeposito");
		String resposta = "";

		if (operacao.equals("recuperarNomeCliente")) {
			resposta = "Nome: " + nomeCliente;
		}
		if (operacao.equals("recuperarCpfCliente") && tipoCliente.equals("pessoaFisica")) {
			resposta = "CPF: " + cpfCnpj;
		}
		if (operacao.equals("recuperarCpfCliente") && tipoCliente.equals("pessoaJuridica")) {
			resposta = "Valor inserido não corresponde ao CPF";
		}
		if (operacao.equals("recuperarCnpjCliente") && tipoCliente.equals("pessoaJuridica")) {
			resposta = "CNPJ: " + cpfCnpj;
		}
		if (operacao.equals("recuperarCnpjCliente") && tipoCliente.equals("pessoaFisica")) {
			resposta = "Valor inserido não corresponde ao CNPJ";
		}
		if (operacao.equals("recuperarSaldo")) {
			resposta = "Saldo: R$" + balance;
		}
		if (operacao.equals("depositarValor") && valorDeposito != "") {
			int depositValor = Integer.parseInt(valorDeposito);
			if (depositValor > 0) {
				int saldo = (balance += depositValor);
				resposta = "Depósito: R$" + valorDeposito + "<br>Saldo: R$" + String.valueOf(saldo);
			}
			if (depositValor <= 0) {
				resposta = "Insira um valor maior que 0 para efetuar o depósito.";
			}
		}
		if (operacao.equals("depositarValor") && valorDeposito == "") {
			resposta = "Insira um valor maior que 0 para efetuar o depósito.";
		}

		if (operacao.equals("sacarValor") && valorSaque != "") {
			int saqueValor = Integer.parseInt(valorSaque);
			if (saqueValor > 0) {
				int saldo = (balance -= saqueValor);
				resposta = "Saque: R$" + (saqueValor) + "<br>Saldo: R$" + saldo;
			}
		}
		if (operacao.equals("sacarValor") && valorSaque == "") {
			resposta="Insira o valor que deseja sacar!";
		}
		if (operacao.equals("depositarSacarValor") && valorDeposito != "" && valorSaque != "") {
			int saldo = Integer.parseInt(valorDeposito) - Integer.parseInt(valorSaque);
			balance = saldo;
			resposta = "saldo: " + saldo;

		}

		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);
	}

}
