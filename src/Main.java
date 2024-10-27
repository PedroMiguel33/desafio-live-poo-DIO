
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cp.investimentos(100.0, 100, 30);
		cc.investimentos(150.0, 100, 30);
		
		cp.saldo = 500;
		cc.saldo = 500;
		
		cc.pagarPIX("dio@gmail.com", 150);
		cp.pagarPIX("dio@gmail.com", 200);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
