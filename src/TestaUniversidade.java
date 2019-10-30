public class TestaUniversidade {
    
    public static void main(String[] args) {
        
        ProfessorRI pfRI1 = new ProfessorRI("Leo", 21, 6176465, 2500.00);
        ProfessorHO pfHO1 = new ProfessorHO("Bia", 25, 215454, 10.00);
        
        System.out.println("Professor Integral 40 hr/semana:");
        System.out.println("Nome: " + pfRI1.getNome());
        System.out.println("Idade: " + pfRI1.getIdade());
        System.out.println("Matrícula: " + pfRI1.getMatricula());
        System.out.println("Salário: R$" + pfRI1.getSalario() + "\n");
        
        System.out.println("Professor Horista:");
        System.out.println("Nome: " + pfHO1.getNome());
        System.out.println("Idade: " + pfHO1.getIdade());
        System.out.println("Matrícula: " + pfHO1.getMatricula());
        System.out.println("Salário: R$" + pfHO1.calcValorHrTotal(35));
    }          
}
