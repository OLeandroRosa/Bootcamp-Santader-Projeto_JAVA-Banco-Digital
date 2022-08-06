
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente leandro = new Cliente();
		leandro.setNome("Leandro");
		
		Conta cc = new ContaCorrente(leandro);
		cc.depositar(100);
		
		
		
		Conta poupanca = new ContaPoupanca(leandro);
		
		
		cc.transferir(70, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
