public class Disciplina {
    
    public Disciplina (String nD, int cD) {
        this.setNomeD(nD);
        this.setCodigoD(cD);
    }
    
    //Atributos
    private String nomeD;
    private int codigoD;
    
    //Métodos Getters e Setters
    public void setNomeD (String nD) {
        this.nomeD = nD;
    }
    
    public String getNomeD () {
        return this.nomeD;
    }
    
    public void setCodigoD (int cD) {
        this.codigoD = cD;
    }
    
    public int getCodigoD () {
        return this.codigoD;
    }
}