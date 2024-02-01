package modulo13;

public class PessoaJuridica extends Pessoa {
  private double cnpj;

  public PessoaJuridica(double cnpj, String nome) {
		this.cnpj = cnpj;
		this.setNome(nome);
	}

  @Override
public void pagarImpostoDeRenda() {
	System.out.println("empresa pagando imposto de renda ");
	
} 
}
