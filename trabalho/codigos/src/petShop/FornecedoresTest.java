package petShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FornecedoresTest {

	@Test
	void cadastrarNomeVazio() {
		Fornecedores a = new Fornecedores();
		
		assertEquals(a.cadastrarNome(""), 0);
	}
	
	@Test
	void cadastrarCnpjVazio() {
		Fornecedores a = new Fornecedores();
		
		assertEquals(a.cadastrarCnpj(""), 0);
	}
	
	@Test
	void cadastrarTelefoneVazio() {
		Fornecedores a = new Fornecedores();
		
		assertEquals(a.cadastrarTelefone(""), 0);
	}
	
	@Test
	void cadastrarNomeCorreto() {
		Fornecedores a = new Fornecedores();
		
		assertEquals(a.cadastrarNome("Fabrica do joão"), 1);
	}
	
	@Test
	void cadastrarCnpjCorreto() {
		Fornecedores a = new Fornecedores();
		assertEquals(a.cadastrarCnpj("21122233344455"), 1);
	}
	
	@Test
	void cadastrarTelefoneCorreto() {
		Fornecedores a = new Fornecedores();
		
		assertEquals(a.cadastrarTelefone("2111112222"), 1);
	}
	
	@Test
	void cadastrarTelefoneTamanhoErrado() {
		Fornecedores a = new Fornecedores();
		
		assertEquals(a.cadastrarTelefone("211111222212"), 0);
	}
	
	@Test
	void excluirFornecedor() {
		Fornecedores a = new Fornecedores();
		a.cadastrarNome("Fabrica do joão");
		a.cadastrarCnpj("41122233344455");
		a.cadastrarTelefone("2111112222");
		a.excluirFornecedor();
		
		assertEquals(a.getExcluido(), true);
	}
}
