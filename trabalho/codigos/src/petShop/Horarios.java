package petShop;

import java.util.LinkedList;

public class Horarios {
	private LinkedList<String> horarios = new LinkedList<String>();
	
	public LinkedList<String> getHorarios(){
		return horarios;
	}
	
	//14h30m
	public int cadastrarHorario(String horario){
		Validacao v = new Validacao();
		
		if(horario.trim() == "" || v.validaHorario(horario) == 0) {
			return 0;
		}
		
		if(this.horarios.indexOf(horario) != -1) {
			return 0;
		}
		
		this.horarios.add(horario);
		return 1;
	}
	
	public int removerHorario(String horario){
		boolean a;
		if(horario.trim() == "") {
			return 0;
		}
		
		a = this.horarios.remove(horario);
		
		if(a == true) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
