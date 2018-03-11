package exercicios;

public class break_rotulada {

	public static void main(String[] args) {
		
		int j =0, i = 0;
		
		principal11: while(true) {
			for(i = 0; i <1000; i ++){
				if (j == 10 &&  i ==100)
					break principal11;
			}
		}

	}

}
