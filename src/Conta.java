
public abstract class Conta implements IConta
{
	protected static final int AGENCIA_PADRAO = 1;
	public static int SEQUENCIAL = 1; 
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected double valorInvestimento;
	protected String pixDestinatario;
	protected double valor;
	

	//Constante = Informação que tenha relação com a classe conta corrente
	public Conta() 
	{
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
	}	
	
	@Override
	public void investimentos(double valor, double taxaPercentual, int dias) 
	{
		
        double rendimento = valor * (taxaPercentual / 100) * (dias / 365.0);
        
        valorInvestimento += valor + rendimento;
	}
	
	@Override
	public void pagarPIX(String pixDestinatario, double valor) {
	    if (pixDestinatario != null && !pixDestinatario.isEmpty() && valor > 0) {
	        if (this.saldo >= valor) {
	            this.saldo -= valor;
	            this.pixDestinatario = pixDestinatario;
	            this.valor = valor; 
	            System.out.println("Pagamento realizado com sucesso para: " + pixDestinatario + ", valor: R$ " + valor);
	        } else {
	            System.out.println("Saldo insuficiente para realizar o pagamento.");
	        }
	    } else {
	        System.out.println("Destinatário inválido ou valor inválido.");
	    }
	}
	
	@Override
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
	
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	
	protected void imprimirInforComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Pix efetuado: %s, %.2f", this.pixDestinatario, this.valor));
		System.out.println(String.format("Valor investido: %.2f", this.valorInvestimento));
	}
}
