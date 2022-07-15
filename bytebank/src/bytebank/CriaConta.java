package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 200;
		conta.titular = "Gabriel";
		System.out.println(conta.saldo);
		
	}

}
