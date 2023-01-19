package proyecto;

public class SeguroDeVida implements Tributacion{

    @Override
    public double getvalorImpuesto() {
        return 50;//al seguro es un monto fijo
    }
}
