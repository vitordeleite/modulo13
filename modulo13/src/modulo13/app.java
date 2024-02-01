package modulo13;

public class app {
 public static void main(String[] args) {
	 PessoaCivil pc = new PessoaCivil(1889994541d, "romario");
	 PessoaJuridica pj = new PessoaJuridica(545458d, "sergio");
	 pc.pagarImpostoDeRenda();
	 pj.pagarImpostoDeRenda();
}
}
