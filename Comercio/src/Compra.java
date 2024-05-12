
public class Compra {
	float valorTotal;
	int numeroParcelas;
	
	// a vista
	public Compra(float valor) {
		this.valorTotal = valor;
		numeroParcelas = 1;
	}
	
	//parcelado
	public Compra(int qtdParcelas, float valorParcela) {
		this.numeroParcelas = qtdParcelas;
		this.valorTotal = valorParcela * qtdParcelas;
	}
	
	public float getValorTotal() {
		return valorTotal;
	}
	
	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public float getValorParcela() {
		return valorTotal / numeroParcelas;
	}
}
