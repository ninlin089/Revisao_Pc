package exercicios;

public class String_teste {

	public static void main(String[] args) {
		String str = "Isto é uma String do java";
		String xyz = new String("Isto é uma String do java");
		
		if (str == xyz) System.out.print("IGUAL");
		else System.out.print("Diferente");
		
		if (str.equals(xyz)) {
			//maneira correta de se comparar o conteudo das strings
		}

		System.out.print("tAMANHO DA STRING: "+ str.length() ); 
		
		System.out.print("SubString: " +str.substring(0, 10) );
		
		System.out.print("Caracter na posição 5: "+str.charAt(5));
	}

}
