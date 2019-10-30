public class ProfessorRI extends Professor {
    
    public ProfessorRI(String n, int idade, int m, double s) {
        super(n, idade, m);
        this.setSalario(s);
    }
    
    //Atributo
    double salario;
    
    //Métodos Gtters e Setters
    public void setSalario(double s) {
        this.salario = s;
    }
    
    public double getSalario () {
        return this.salario;
    }
}