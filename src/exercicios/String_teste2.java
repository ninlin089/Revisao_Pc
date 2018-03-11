package exercicios;

public class String_teste2 {
	public static void main(String[] args) {
		
		String str = "Isto é uma String do java";
		
		
		// o metodo split quebra a String e varias outras pelo separador desejado
		String[] palavras = str.split("");
		
		int i = str.indexOf("Uma"); //retorna o indice da palavra na string 
		
		if (str.startsWith("Olá") || str.endsWith("Mundo")) {
			// testa o começo e o fim da String - retorna boolean
		}
		
		str = str.trim(); //elimina os espaços em branco no inicio e fim
		str = str.replace('a','@'); //substitui os caracteres
		
		//substitui uma palavra (Usa expressões regulares)
		str = str.replaceAll("String", "Cadeia de caracteres");
	
	}
	

}
