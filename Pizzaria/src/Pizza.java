import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
	ArrayList<String> ingredientesInd = new ArrayList<String>();
	static HashMap<String, String> ingredientesTot = new HashMap<String, String>();
	int preco;
	
	public void adicionarIngrediente(String ingrediente) {
		ingredientesInd.add(ingrediente);
		contabilizarIngrediente(ingrediente);
	}
	
	public void getPreco() {
		int quantIng = ingredientesInd.size();
		if (quantIng <= 2) {
			preco = 15;
		} else if (quantIng <= 5) {
			preco = 20;
		} else {
			preco = 23;
		}
	}
	
	static void contabilizarIngrediente(String ingrediente) {
		for (String item : ingredientesTot) {
			
		}
	}
	
}
