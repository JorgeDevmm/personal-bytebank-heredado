package proyecto;

public class CalculadoraDeImpuesto {

    private double totalImpuesto;

    //este método pide como parametro un rotulo de interface y ese rotulo al esta implementado en dos clases, se pueden colocar cualquiera de los dos objetos
    public void registra(Tributacion t) {
        double valor = t.getvalorImpuesto();
        this.totalImpuesto += valor;
    }

    //getter
    public double getTotalImpuesto() {
        return totalImpuesto;
    }
}
