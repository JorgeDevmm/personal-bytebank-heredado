package proyecto;

public abstract class Funcionario {

    private String nombre;
    private String documento;
    private double salario;

    private int tipo;

    //constructor
    public Funcionario() {
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public double getSalario() {
        return salario;
    }

    public int getTipo() {
        return tipo;
    }


    //sobrescribir método
    public abstract double getBonificacion();
}
