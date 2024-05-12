package carros;

public class Carro {
	// Estado ou Atributos 
	int potencia;
	int velocidade;
	String nome;
	
	// comportamentos ou métodos
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade = velocidade / 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " + nome +" esta a velocidade de " + getVelocidade() + "km/h");
	}
}
