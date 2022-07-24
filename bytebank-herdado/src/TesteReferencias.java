
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("José Pereira");
		g1.setSalario(1928);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
				
	}

}
