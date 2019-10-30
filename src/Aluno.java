public class Aluno {
    
    //Atributos
    private String nome;
    private int matricula;
    
    public Aluno (String n, int m) {
        this.setNome(n);
        this.setMatricula(m);
    }
    
    //Métodos Getters e Setters
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setMatricula (int m) {
        this.matricula = m;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
}
