package proyecto;

public class ControlBonificacion {

    private double suma;

    public double getSuma() {
        return suma;
    }

    //podemos aplicar polimorfismo y tener solo un método de puerta de enlace, ya que tener clases extendidas de funcionario pueden acceder todas con este método
    //todos los que son heredador de la clase funcionario pueden acceder a este método por medio de polimorfismo
    public double registrarSalario(Funcionario funcionario){
        this.suma += funcionario.getBonificacion();
        System.out.println("Calculo actual:" + suma);
        return this.suma;
    }

}
