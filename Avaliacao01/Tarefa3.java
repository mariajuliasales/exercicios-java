import java.util.Scanner;

public class Tarefa3{
    
    public static void multiplo(int posicao, int matriz[][]){
        for(int i=0;i<posicao;i++){
            for(int j=0;j<posicao;j++){
                if(matriz[i][j] % 3==0){
                    System.out.println(" O numero " + matriz[i][j] + " e multiplo de 3 ");

                }
            }
        }
    }

    public static void positivoNegativo(int posicao, int matriz[][]){

        for(int i=0;i<posicao;i++){
            for(int j=0;j<posicao;j++){
                if(matriz[i][j]<0){
                    System.out.println(" O numero " + matriz[i][j] + " é negativo");
                }
                if(matriz[i][j]>=0){
                    System.out.println(" O numero " + matriz[i][j] + " e positivo");
                }
            }
        }
    }

    public static void main (String[]args){

        int matriz[][]= new int[15][15];
        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe o numero de posicoes que a matriz quadrada terá: ");
        int posicoes = teclado.nextInt();

        for(int i=0;i<posicoes;i++){
            for(int j=0;j<posicoes;j++){
                matriz[i][j]= teclado.nextInt();
        }
    }

    multiplo(posicoes, matriz);

    positivoNegativo(posicoes, matriz);
}}