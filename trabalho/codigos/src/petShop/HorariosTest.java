package petShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HorariosTest {

	@Test
	void cadastrarHorarioRepetido() {
		Horarios a = new Horarios();
		a.cadastrarHorario("1h30m");
		
		assertEquals(a.cadastrarHorario("1h30m"), 0);
	}
	
	@Test
	void cadastrarHorarioSucesso() {
		Horarios a = new Horarios();
		
		assertEquals(a.cadastrarHorario("14h30m"), 1);
	}
	
	@Test
	void removerHorarioInexistente() {
		Horarios a = new Horarios();
		a.cadastrarHorario("1h30m");
		
		assertEquals(a.removerHorario("1h30m"), 0);
	}
	
	@Test
	void removerHorarioFormatacaoErrada() {
		Horarios a = new Horarios();
		
		assertEquals(a.removerHorario("1h30m"), 0);
	}
	
	@Test
	void removerHorarioSemMinuto() {
		Horarios a = new Horarios();
		
		assertEquals(a.removerHorario("14h30"), 0);
	}
	
	@Test
	void removerHorarioSemHora() {
		Horarios a = new Horarios();
		
		assertEquals(a.removerHorario("1430m"), 0);
	}
	
	@Test
	void removerHorarioSucesso() {
		Horarios a = new Horarios();
		a.cadastrarHorario("13h30m");
		a.cadastrarHorario("14h30m");
		
		assertEquals(a.removerHorario("14h30m"), 1);
	}

}
