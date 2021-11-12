package Empregado;


public class Main {

    
    public static void main(String[] args) {
        
        
        salario FuncionarioUm = new salario ("Maicon","Bertold", 1192.4f);
        System.out.println("Empregado " + FuncionarioUm.getNomeEmp()+
                 " " +FuncionarioUm.getSobreEmp() + " Anualmente ganha R$: "
                + FuncionarioUm.getAnual());
         
        
        System.out.println("Funcionario " + FuncionarioUm.getNomeEmp() +
                 " "+FuncionarioUm.getSobreEmp() + " Com Aumento de 10% R$: "
                + FuncionarioUm.getAumento()); 
        
        
        
        
        
    }
    
}
