import java.util.Scanner;

public class Tarefa1{

public static void main (String[]args){

    Scanner teclado = new Scanner(System.in);
    int valorTeclado = teclado.nextInt();
    int vetor[]=new int [50];
    int soma=0;

    for (int i=0; i<50; i++){
        vetor[i]=i;
    }

    for (int i=0; i<50; i++){
        if(vetor[i] % valorTeclado == 0){
            System.out.println(i);
        }
    }

    for(int i=0; i<50; i++){
        soma = soma + vetor[i];
    }

    System.out.println("A soma dos valores do vetor e: " + soma);

}
}