public class AlunoPosGrad extends Aluno {
    
    public AlunoPosGrad (String n, int m, PosGrad p) {
        super(n, m);
        this.setPosGrad(p);
    }
    
    //Atributo
    private PosGrad posgraduacao;
    
    //Métodos Getters e Setter
    public void setPosGrad (PosGrad p) {
        this.posgraduacao = p;
    }
    
    public PosGrad getPosGrad () {
        return this.posgraduacao;
    }
}
