public class Assistec extends Funcionario {
    
    public Assistec (String n, int m, Gerente spv){
        super(n, m);
        this.setSupervisor(spv);
    }
    
    //Atributos
    Gerente supervisor;
    private double bonus;
    
    //Métodos Getters e Setters
    public void setSupervisor (Gerente spv){
        this.supervisor = spv;
    }
    
    public Gerente getSupervisor () {
        return this.supervisor;
    }
    
    public void setBonus (double b) {
        this.bonus = b;
    }
    
    public double getBonus () {
        return this.bonus;
    }
}
