package petShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutosTest {

	@Test
	void testAlterarPrecoOK() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.alterarPreco(45), 1);
	}
	
	@Test
	void testAlterarPrecoIgual0() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.alterarPreco(0), 0);
	}
	
	@Test
	void testAlterarPrecoIgualNegativo() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.alterarPreco(-5), 0);
	}
	
	@Test
	void testRemoverOK(){
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.remover(4), 1);
	}
	
	@Test
	void testRemover11de5(){
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.remover(11), 0);
	}
	
	@Test
	void testAdicionarOK() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.adicionar(3), 1);
	}
	
	@Test
	void testAdicionarNegativo() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.adicionar(-3), 0);
	}
	
	@Test
	void testGetPrecoComDescontoMenorQue0() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.getPrecoDesconto(-1.0), -1);
	}

	@Test
	void testGetPrecoComDescontoMaiorQue1() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.getPrecoDesconto(1.4), -1);
	}
	
	@Test
	void testGetPrecoComDescontoCorreto() {
		Produtos produto = new Produtos("Shampoo", 50, 10);
		
		assertEquals(produto.getPrecoDesconto(0.5) != -1, true);
	}
}
