
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Gerente gerente) {
		double bonificacao = gerente.getBonificacao();
		this.soma = this.soma + bonificacao;
	}

}
