public class Principal {

    public static void main(String []args){

        Cliente []vetor = new Cliente[5];
        vetor[0] = new Cliente ("0000000", "Juliana Silva", "32 9 8888-9999", "juliana@gmail.com", "prime");
        vetor[1] = new Cliente ("1111111", "Joao Gomes", "32 9 9999-0000", "joao@gmail.com", "normal");
        vetor[2] = new Cliente ("2222222", "Maria Santos", "32 9 1111-2222", "maria@gmail.com", "prime");
        vetor[3] = new Cliente ("3333333", "Leticia Souza", "32 9 3333-4444", "leticia@gmail.com", "normal");
        vetor[4] = new Cliente ("prime", "Ana Goncalves");

        for(int i=0; i<5; i++){
            if( vetor[i].getCategoria() == "prime"){
                vetor[i].imprimeDadosCliente();
            }
        }
        
    }
}
