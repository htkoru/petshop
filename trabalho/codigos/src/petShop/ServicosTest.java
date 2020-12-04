package petShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ServicosTest {
	
	@Test
	void cadastrarServicoVazio() {
		Servicos a = new Servicos();
		
		assertEquals(a.cadastrarServico(""), 0);
	}
	
	@Test
	void cadastrarServicoExistente() {
		Servicos a = new Servicos();
		a.cadastrarServico("Tosa");
		a.cadastrarServico("Banho");
		
		assertEquals(a.cadastrarServico("Tosa"), 0);
	}
	
	@Test
	void cadastrarServicoCorreto() {
		Servicos a = new Servicos();
		
		assertEquals(a.cadastrarServico("Tosa"), 1);
	}
	
	@Test
	void removerServicoVazio() {
		Servicos a = new Servicos();
		
		assertEquals(a.removerServico(""), 0);
	}

	void removerServicoInexistente() {
		Servicos a = new Servicos();
		a.cadastrarServico("Tosa");
		a.cadastrarServico("Banho");
		
		assertEquals(a.removerServico("a"), 0);
	}
	
	@Test
	void removerServicoSucesso() {
		Servicos a = new Servicos();
		a.cadastrarServico("Tosa");
		a.cadastrarServico("Banho");
		
		assertEquals(a.removerServico("Tosa"), 1);
	}
}
