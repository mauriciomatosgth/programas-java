package entities;

public class Funcionario {
    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Funcionario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //metodos

    public void addAumento(double porcento){
        salary = salary + (salary*(porcento/100));
    }
    @Override
    public String toString(){
       return id+", " +name+ ", "+String.format("%.2f",salary);
    }
}
