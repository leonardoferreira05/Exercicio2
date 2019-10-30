public class PosGrad extends Disciplina {
    
    public PosGrad (String nD, int cD, String pf) {
        super(nD, cD);
        this.setProfessor(pf);
    }
    
    //Atributo
    private String professor;
    
    //Métodos Getters e Setter
    public void setProfessor (String pf) {
        this.professor = pf;
    }
    
    public String getProfessor () {
        return this.professor;
    }
}
