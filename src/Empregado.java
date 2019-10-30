public class Empregado extends Pessoa {
   
    public Empregado (String n, String e, int t, int cS, double sB, int iP) {
        super(n, e, t);
        this.setCodigoSetor(cS);
        this.setSalarioBase(sB);
        this.setImposto(iP);
    }

    // Atributos:
    private int codigoSetor; 
    private double salarioBase;
    private int imposto;
    
    //Métodos Getters e Setters 
    public void setCodigoSetor (int cS) {
        this.codigoSetor = cS;
    }
    
    public int getCodigoSetor () {
        return this.codigoSetor;
    }
    
    public void setSalarioBase(double sB) {
        this.salarioBase = sB;
    }
    
    public double getSalarioBase () {
        return this.salarioBase;
    }
    
    public void setImposto (int iP) {
        this.imposto = iP;
    }
    
    public int getImposto () {
        return this.imposto;
    }
    
    public double calcularSalario () {
        return this.salarioBase - ((this.salarioBase * this.imposto) / 100);
    }
}
