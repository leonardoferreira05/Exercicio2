public class AlunoGrad extends Aluno {
    
    public AlunoGrad (String n, int m, Graduacao g) {
        super(n, m);
        this.setGrad(g);
    }
    
    //Atributos
    private Graduacao graduacao;
    
    //Métodos Getters e Setters
    public void setGrad (Graduacao g) {
        this.graduacao = g;
    }
    
    public Graduacao getGraduacao () {
        return this.graduacao;
    }
}
