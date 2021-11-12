
package Empregado;


public class salario {

    private String nomeEmp;
    private String sobreEmp;
    private float salario;
   
            
    public salario(String nomeEmp, String sobreEmp, float salario) {
        this.setNomeEmp (nomeEmp);
        this.setSobreEmp (sobreEmp);
        this.setSalario (salario);
    }
    public float getAnual(){          
        return salario * 12;
    }
    public double getAumento(){
        return ((salario * 12) * 1.1);
    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public String getSobreEmp() {
        return sobreEmp;
    }

    public void setSobreEmp(String sobreEmp) {
        this.sobreEmp = sobreEmp;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
   
        if (salario < 0){
            this.salario = 0;
        } else{
            this.salario = salario;
        }
    }

}
