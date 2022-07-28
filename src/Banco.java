import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionaConta(Conta conta) {
		contas.add(conta);
	}

	public List<Conta> getContas() {
		return Collections.unmodifiableList(contas);
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	protected void imprimirContas() {

		System.out.println("\n=== Relação de Contas do "  + this.getNome() + " ===");
		System.out.println("Agência    Conta    Titular");

		for ( Conta conta : this.getContas() ) 
			{System.out.println(" " + String.format("%05d",conta.getAgencia())  + "    " + String.format("%07d",conta.getNumero()) + "   " + conta.cliente.getNome());}
	}
}
