
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		
		g1.setNome("Gabriel Peres Dias");
		g1.setCpf("12398745612");
		g1.setSalario(1928);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salário: " + g1.getSalario());
		
		g1.setSenha(12345);
		boolean autenticado = g1.autentica(12345);
		System.out.println(autenticado);
		
		System.out.println(g1.getBonificacao());
	}

}
