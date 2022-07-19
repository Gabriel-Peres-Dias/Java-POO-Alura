package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.saldo = 200;
		conta.deposita(50);
		
		Conta contaDois = new Conta();
		
		contaDois.saldo = 500;
		System.out.println(contaDois.saca(600));
		System.out.println(contaDois.saldo);
		
	}

}
