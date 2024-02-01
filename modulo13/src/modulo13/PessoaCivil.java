package modulo13;

public class PessoaCivil extends Pessoa {
	
	private double cpf;
	 

	public PessoaCivil(double cpf, String nome) {
		this.cpf = cpf;
		this.setNome(nome);
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	@Override
	public void pagarImpostoDeRenda() {
		System.out.println("pessoa fisica pagando imposto de renda ");
		
	}
	
}
