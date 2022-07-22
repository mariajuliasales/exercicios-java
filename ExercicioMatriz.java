import java.util.Scanner;

public class ExercicioMatriz{
	public static void main (String[] args){

	    Scanner teclado = new Scanner(System.in);
	    int matriz[][] = new int [5][5];
	    int somaDiagonalPrincipal=0;
	    
	    System.out.println("Preencha os valores da matriz 5x5:");
	    for (int i = 0; i<5; i++){
	        for (int j = 0; j<5; j++){
	            matriz[i][j]=teclado.nextInt();
	            if(i==j){
	                somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[i][j];
	            }
	        }
	    }
	    System.out.print("Soma dos valores da diagonal principal: " + somaDiagonalPrincipal + "\n");

	    System.out.print("Valores da diagonal secundaria: ");
	    for (int i = 0; i<5; i++){
	        for (int j = 0; j<5; j++){
	            if(i+j==matriz.length - 1){
	                System.out.print(matriz[i][j] + " ");
	            }
	    	}
		}
        System.out.println("");

        System.out.println("Substituicao dos valores da terceira linha por 1:");
        for (int j = 0; j<5; j++){
            matriz[2][j]=1;
        }
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
            System.out.print(matriz[i][j] + " ");    
        	}
        System.out.println("");
		}
	}
}