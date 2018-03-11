package exercicios;

public class continue_rotulada {

	public static void main(String[] args) {
		
		int i=0, j=0;
		principal12: for (j = 1; j<10; j ++){
			for (i = 0; i <10; i ++){
				if ((i % j) == 0){
					System.out.println("i = " +i + "j = "+j);
					continue principal12;
				}
			}
			j++;
		}

	}

}
