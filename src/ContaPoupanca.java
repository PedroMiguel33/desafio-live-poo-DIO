
public class ContaPoupanca extends Conta
{

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Imprimindo extrato conta poupanca === ");
		super.imprimirInforComuns();
		
	}
	
}

