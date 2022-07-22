import java.util.Scanner;

public class Tarefa2{

    public static void receberMatriz(int matriz[][]){
        int vetor[]= new int[15];
        System.out.printf("Vetor gerado com os elementos da diagonal principal: \n");
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                if(i==j){
                    vetor[i]=matriz[i][j];
                    System.out.printf(" %d", vetor[i]);
                }
            }
        }

    }

    public static void main(String[]args){
 //   System.out.print("olha mundo");
    int matrizTeclado[][]=new int [15][15];
    Scanner teclado = new Scanner(System.in);

    for(int i=0; i<15; i++){
        for(int j=0;j<15;j++){
        matrizTeclado[i][j] = teclado.nextInt();
    }
    }

    receberMatriz(matrizTeclado);
    }
}