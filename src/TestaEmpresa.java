public class TestaEmpresa {
    
    public static void main(String[] args) {
        
        Gerente gt1 = new Gerente("Leo", 1238290, "cantina");
        Gerente gt2 = new Gerente("Poliane", 2924678, "almoxarifado");
        
        AssisAdm assisAdm1 = new AssisAdm("Luiz", 1607543, gt1);
        Assistec assistec1 = new Assistec("Rodrigo", 897879, gt2);
        
        System.out.println("Assistente Administrativo:");
        System.out.println("Nome: "  + assisAdm1.getNome());
        System.out.println("Matrícula:" + assisAdm1.getMatricula() + "\n");
        System.out.println("Supervisor: " + assisAdm1.supervisor.getNome());
        System.out.println("Matrícula: " + assisAdm1.supervisor.getMatricula());
        System.out.println("Departamento: " + assisAdm1.supervisor.getDepResp() + "\n");
        
        System.out.println("Assistente Técnico:");
        System.out.println("Nome: "  + assistec1.getNome());
        System.out.println("Matrícula:" + assistec1.getMatricula() + "\n");
        System.out.println("Supervisor: " + assistec1.supervisor.getNome());
        System.out.println("Matrícula: " + assistec1.supervisor.getMatricula());
        System.out.println("Departamento: " + assistec1.supervisor.getDepResp());
        
    }
}
