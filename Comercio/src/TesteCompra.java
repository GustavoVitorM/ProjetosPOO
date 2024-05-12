import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500.0, c.getValorTotal(), 0.001);
		assertEquals(500.0, c.getValorParcela(), 0.001);
		
	}
	public void compraParcelada() {
		Compra c = new Compra(4, 250);
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(1000.0, c.getValorTotal(), 0.001);
		assertEquals(250.0, c.getValorParcela(), 0.001);
		
	}

}
