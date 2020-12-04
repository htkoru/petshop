package petShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidacaoTest {

	@Test
	void validaSeTemLetraErrado() {
		Validacao v = new Validacao();
		
		assertEquals(v.validaSeTudoEhNumero("3112a233344455"), 0);
	}
	
	@Test
	void validaSeTemLetraCerto() {
		Validacao v = new Validacao();
		
		assertEquals(v.validaSeTudoEhNumero("31121233344455"), 1);
	}

	@Test
	void cadastrarHorarioSemHora() {
		Validacao v = new Validacao();
		
		assertEquals(v.validaHorario("1530m"), 0);
	}
	
	@Test
	void cadastrarHorarioFormatoErrado() {
		Validacao v = new Validacao();
		
		assertEquals(v.validaHorario("1ah30m"), 0);
	}
	
	@Test
	void cadastrarHorarioCerto() {
		Validacao v = new Validacao();
		
		assertEquals(v.validaHorario("14h30m"), 1);
	}
}
