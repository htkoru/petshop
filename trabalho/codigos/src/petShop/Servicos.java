package petShop;

import java.util.LinkedList;

public class Servicos {
	private LinkedList<String> servs = new LinkedList<String>();
	
	public LinkedList<String> getServicos(){
		return servs;
	}
	
	public int cadastrarServico(String serv){
		if(serv.trim() == "" || this.servs.indexOf(serv) != -1) {
			return 0;
		}
		
		this.servs.add(serv);
		return 1;
	}
	
	public int removerServico(String serv){
		boolean a;
		if(serv.trim() == "") {
			return 0;
		}
		
		a = this.servs.remove(serv);
		
		if(a == true) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
