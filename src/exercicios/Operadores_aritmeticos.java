package exercicios;

public class Operadores_aritmeticos {

	public static void main(String[] args) {
		
		int um = 3/2;                 // divisão de interios gera inteiros
		float umEmeio = (float) 3/2;  //ocorre promoção aritmetica para float
		double xyz = umEmeio * um;    // ocorre promoção aritmetica para float
		
		int resto = 7 %2; //resto = 1

		long l = 1000 + 4000;
		double d = 1.0 -0.01;
		
		long var = 12345;
		String str = "O Valor de Var é: " + var;
		
		String sqr = "O Valor de Var é: " + Long.toString(var);
		
		/*
		 *Operadores de Deslocamento
		 *
		 * 2 deslocamentos a direita
		 * int i = 192 >>1
		 * int i = 192 >>7
		 * 
		 * int i = -192 >>1
		 * int i = -192 >>7
		 * 
		 * 2 deslocamentos a esquerda
		 * int i = 192 <<1
		 * int i = 192 <<7
		 * 
		 * int i = -192 <<1
		 * int i = -192 <<7
		 * 
		 * 3 deslocamentos a direita
		 * int i = 192 >>>1
		 * int i = 192 >>>7
		 * 
		 * int i = -192 >>>1
		 * int i = -192 >>>7
		 * 
		 * 
		*/
	}

}
