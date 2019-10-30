public class TestaEmpresa {
    
    public static void main(String[] args) {
        
        Gerente gt1 = new Gerente("Leo", 1238290, "cantina");
        Gerente gt2 = new Gerente("Poliane", 2924678, "almoxarifado");
        
        AssisAdm assisAdm1 = new AssisAdm("Luiza", 5454543, gt1);
        AssisTec assisTec1 = new AssisTec("Rodrigo", 897879, gt2);
        
        System.out.println("Assistente Administrativo:");
        System.out.println("Nome: "  + assisAdm1.getNome());
        System.out.println("Matrícula:" + assisAdm1.getMatricula() + "\n");
        System.out.println("Supervisor: " + assisAdm1.supervisor.getNome());
        System.out.println("Matrícula: " + assisAdm1.supervisor.getMatricula());
        System.out.println("Departamento: " + assisAdm1.supervisor.getDepResp() + "\n");
        
        System.out.println("Assistente Técnico:");
        System.out.println("Nome: "  + assisTec1.getNome());
        System.out.println("Matrícula:" + assisTec1.getMatricula() + "\n");
        System.out.println("Supervisor: " + assisTec1.supervisor.getNome());
        System.out.println("Matrícula: " + assisTec1.supervisor.getMatricula());
        System.out.println("Departamento: " + assisTec1.supervisor.getDepResp());
        
    }
}
