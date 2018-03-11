package exercicios;

public class operadores_unarios {

	public static void main(String[] args) {
		
		int a = 0;
		int b = a++; // inclementado antes de atribuir
		int c = ++a; // inclementado depois de atribuir
		b = a--;     //declementado depois de atribuir
		c = --a;     //declementado antes de atribuir  
		
		//mais e menos unario: +e
		
		int x = +3; // x recebe o positivo 3
		x = -x;     // x recebe -3, neste caso
		
		//inversão de Bits
		int i = ~1; // i =-2 (os bits foram invertidos)
		
		//complementar booleano:!
		boolean falsidade = !(true); // inverte o valor booleano
		
		// Conversão de tipos
		double d = 1.99;
		int z = (int) d; // converte de double p/ int com perda de precisão

	}

}
