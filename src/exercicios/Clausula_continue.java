package exercicios;

public class Clausula_continue {

	public static void main(String[] args) {
		
		char letras[] = {'A', 'X', 'R', 'B','S', 'I', 'L'};
		int i;
		
        for (i=0; i <letras.length; i++){
			if(letras[i] == 'X'){
			continue;
		}
	
	System.out.println(letras[i]);

	}
  }
}
