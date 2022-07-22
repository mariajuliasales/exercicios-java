public class Cliente{

    private String cpf, telefone, categoria;
    public String nome, email;

    public Cliente(String c, String n, String t, String e, String cat){
        this.cpf = c;
        this.nome = n;
        this.telefone = t;
        this.email = e;
        this.categoria = cat;
    }

    public Cliente(String c, String n){
        this.categoria = c;
        this.nome = n;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone( String telefone){
        this.telefone = telefone;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria( String categoria){
        this.categoria = categoria;
    }

    public void imprimeDadosCliente(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
        System.out.printf("\n");
    }


    public void calculaDesconto(){
        if(this.categoria == "prime"){
            System.out.println("O cliente da categoria Prime possui um desconto de 5%.");
        } else if(this.categoria == "normal"){
            System.out.println("O cliente da categoria Normal possui um desconto de 2%.");
        } else {
            System.out.println("O cliente ao possui desconto.");
        }
        System.out.printf("\n");
    }
}