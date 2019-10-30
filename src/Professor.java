public class Professor {
    
    //Atributos
    String nome;
    int idade;
    int matrícula;
    
    //Método Construtor
    public Professor(String n, int idade, int m) {
        this.setNome(n);
        this.setIdade(idade);
        this.setMatricula(m);
    }
    
    //Métodos Getter e Setter
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public int getIdade () {
        return this.idade;
    }
    
    public void setMatricula (int m){
        this.matrícula = m;
    }
    
    public int getMatricula () {
        return this.matrícula;
    }
}
