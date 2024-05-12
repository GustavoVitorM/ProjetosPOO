
public class Paciente {
	double altura;
	double peso;
	
	public Paciente(double peso, double altura) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public double CalcularIMC() {
		return peso/(altura*altura);
	}
	
	public String diagnostico() {
		double imc = CalcularIMC();
		String resultado = "";
		
		if (imc < 16) {
			resultado = "Baixo peso muito grave";
		} else if (imc >= 16 && imc < 17) {
			resultado = "Baixo peso grave";
		} else if (imc >=17 && imc < 18.50) {
			resultado = "Baixo peso";
		} else if (imc >= 18.50 && imc < 24.99) {
			resultado = "Peso normal";
		} else if (imc >= 25 && imc < 30) {
			resultado = "Sobrepeso";
		} else if (imc >= 30 && imc < 35) {
			resultado = "Obesidade grau I";
		} else if (imc >= 35 && imc < 40) {
			resultado = "Obesidade grau II";
		} else if (imc >= 40) {
			resultado = "Obesidade grau III (Obesidade morbida)";
		}
		
		return resultado;
	}
}
