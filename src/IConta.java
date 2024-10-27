
public interface IConta 
{
	 void sacar(double valor);
	
	 void depositar(double valor);

	 void transferir(double valor, Conta contaDestino);
	 
	 void investimentos(double valor, double taxaPercentual, int dias);
	 
	 void pagarPIX(String pixDestinatario, double valor);
	 
	 void imprimirExtrato();
	 

}
