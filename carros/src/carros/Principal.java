package carros;

public class Principal {

	public static void main(String[] args) {
		// Criando um objeto da classe carro
		Carro c1 = new Carro();
		// Definindo seus valores
		c1.potencia = 10;
		c1.nome = "Corcel";
		c1.velocidade = 0;
		
		// Criando outro objeto da mesma classe
		Carro c2 = new Carro();
		c2.potencia = 15;
		c2.nome = "Carango";
		c2.velocidade = 0;
		
		Carro c3 = new Carro();
		c3.potencia = 10;
		c3.nome = "Corcel";
		c3.velocidade = 0;
		
		// Executando metodos, note q um não afeta o outro mesmo sendo da mesma classe
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c2.acelerar();
		c2.acelerar();
		
		c1.imprimir();
		c2.imprimir();
		System.out.println("Imprimindo c3");
		c3.imprimir();
	}

}
