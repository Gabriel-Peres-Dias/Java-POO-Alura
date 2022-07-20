
public class TestaContaSemSemCliente {

	public static void main(String[] args) {

		Conta contaDoGabriel = new Conta();
		System.out.println(contaDoGabriel.titular);
		
		contaDoGabriel.titular = new Cliente();
		contaDoGabriel.titular.nome = "Gabriel";
		System.out.println(contaDoGabriel.titular.nome);
	}

}
