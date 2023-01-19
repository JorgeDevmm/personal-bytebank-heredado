package proyecto;

public class CalculadoraDeImpuesto {

    private double totalImpuesto;

    public void registra(Tributacion t) {
        double valor = t.getvalorImpuesto();
        this.totalImpuesto += valor;
    }

    //getter
    public double getTotalImpuesto() {
        return totalImpuesto;
    }
}
