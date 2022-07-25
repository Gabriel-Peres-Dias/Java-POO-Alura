
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		
		EditorVideo e1 = new EditorVideo();
		e1.setSalario(2500);
		
		Designer d1 = new Designer();
		g1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
				
	}

}
