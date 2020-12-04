package petShop;

import java.util.LinkedList;

//pets que trabalhamos
public class Pets {
	private LinkedList<String> animais = new LinkedList<String>();
	
	public LinkedList<String> getServicos(){
		return animais;
	}
	
	public int cadastrarAnimal(String animal){
		if(animal.trim() == "" || this.animais.indexOf(animal) != -1) {
			return 0;
		}
		
		this.animais.add(animal);
		return 1;
	}
	
	public int removerAnimal(String animal){
		boolean a;
		if(animal.trim() == "") {
			return 0;
		}
		
		a = this.animais.remove(animal);
		
		if(a == true) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
