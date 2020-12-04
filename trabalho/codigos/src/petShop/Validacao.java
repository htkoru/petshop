package petShop;

public class Validacao {
	public int validaSeTudoEhNumero(String str) {
		for(int i = 0; i < str.length(); i++) {
			if( str.charAt(i) != '0' && str.charAt(i) != '1' && str.charAt(i) != '2' && str.charAt(i) != '3' &&
				str.charAt(i) != '4' && str.charAt(i) != '5' && str.charAt(i) != '6' && str.charAt(i) != '7' && 
				str.charAt(i) != '8' && str.charAt(i) != '9') {
				return 0;
			}
		}
		
		return 1;
	}
	//01h30m
	public int validaHorario(String str) {
		if( str.charAt(0) != '0' && str.charAt(0) != '1' && str.charAt(0) != '2' && str.charAt(0) != '3' &&
			str.charAt(0) != '4' && str.charAt(0) != '5' && str.charAt(0) != '6' && str.charAt(0) != '7' && 
			str.charAt(0) != '8' && str.charAt(0) != '9') {
			return 0;
		}
		
		if( str.charAt(1) != '0' && str.charAt(1) != '1' && str.charAt(1) != '2' && str.charAt(1) != '3' &&
			str.charAt(1) != '4' && str.charAt(1) != '5' && str.charAt(1) != '6' && str.charAt(1) != '7' && 
			str.charAt(1) != '8' && str.charAt(1) != '9') {
			return 0;
		}
		
		if( str.charAt(2) != 'h' ) {
			return 0;
		}
		
		if( str.charAt(3) != '0' && str.charAt(3) != '1' && str.charAt(3) != '2' && str.charAt(3) != '3' &&
			str.charAt(3) != '4' && str.charAt(3) != '5' && str.charAt(3) != '6' && str.charAt(3) != '7' && 
			str.charAt(3) != '8' && str.charAt(3) != '9') {
			return 0;
		}
		
		if( str.charAt(4) != '0' && str.charAt(4) != '1' && str.charAt(4) != '2' && str.charAt(4) != '3' &&
			str.charAt(4) != '4' && str.charAt(4) != '5' && str.charAt(4) != '6' && str.charAt(4) != '7' && 
			str.charAt(4) != '8' && str.charAt(4) != '9') {
			return 0;
		}
		
		if( str.charAt(5) != 'm' ) {
			return 0;
		}
		
		return 1;
	}
}
