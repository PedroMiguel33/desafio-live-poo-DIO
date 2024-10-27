
public class ContaCorrente extends Conta
{

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Imprimindo extrato conta corrente === ");
		super.imprimirInforComuns();
		
	}
}