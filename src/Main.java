
public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco("Banco do Povo");

		Cliente cliente = new Cliente();
		cliente.setNome("Washington");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		banco.adicionaConta(cc);
		banco.adicionaConta(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cliente = new Cliente();
		cliente.setNome("Vanessa");
		
		cc = new ContaCorrente(cliente);
		poupanca = new ContaPoupanca(cliente);

		banco.adicionaConta(cc);
		banco.adicionaConta(poupanca);

		cc.depositar(300);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.imprimirContas();
	}
}
