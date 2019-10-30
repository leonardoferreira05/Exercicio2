public class Administrador extends Empregado {
    
    public Administrador (String n, String e, int t, int cS, double sB, int iP, double aDC) {
        super(n, e, t, cS, sB, iP);
        this.setAjudaDeCusto(aDC);
    }
 
    //Atributo
    private double ajudaDeCusto;
    
    //Métodos Getters e Setter
    public void setAjudaDeCusto (double aDC) {
        this.ajudaDeCusto = aDC;
    }
    
    public double getAjudaDeCusto () {
        return this.ajudaDeCusto;
    }
    
   
    public double calcularSalario () {
        return this.getSalarioBase() - ((this.getSalarioBase() * this.getImposto()) / 100) + this.ajudaDeCusto;
    }
    
    
}
