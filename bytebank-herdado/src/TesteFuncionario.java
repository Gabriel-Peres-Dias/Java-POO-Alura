
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Gabriel");
		funcionario.setCpf("xxxxxxxxxxx");
		funcionario.setSalario(1928);
		
		System.out.println(funcionario.getBonificacao());

	}

}
