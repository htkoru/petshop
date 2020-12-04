package petShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PetsTest {

	@Test
	void cadastrarAnimalVazio() {
		Pets a = new Pets();
		
		assertEquals(a.cadastrarAnimal(""), 0);
	}
	
	@Test
	void cadastrarAnimalExistente() {
		Pets a = new Pets();
		a.cadastrarAnimal("Cachorro");
		
		assertEquals(a.cadastrarAnimal("Cachorro"), 0);
	}
	
	@Test
	void cadastrarAnimalCorreto() {
		Pets a = new Pets();
		
		assertEquals(a.cadastrarAnimal("Cachorro"), 1);
	}
	
	@Test
	void removerAnimalVazio() {
		Pets a = new Pets();
		
		assertEquals(a.removerAnimal(""), 0);
	}

	void removerAnimalInexistente() {
		Pets a = new Pets();
		a.cadastrarAnimal("Cachorro");
		a.cadastrarAnimal("Gato");
		
		assertEquals(a.removerAnimal("a"), 0);
	}
	
	@Test
	void removerAnimalSucesso() {
		Pets a = new Pets();
		a.cadastrarAnimal("Cachorro");
		a.cadastrarAnimal("Gato");
		
		assertEquals(a.removerAnimal("Gato"), 1);
	}

}
