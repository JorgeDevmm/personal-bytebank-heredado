package proyecto;

public class TestTributacion {

    //validar mis instacias
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 33);
        CuentaCorriente cc2 = new CuentaCorriente(222, 33);
        cc.depositar(800);
        cc2.depositar(1200);

        SeguroDeVida seguro = new SeguroDeVida();

        //calculo mis impuestos pasando como parametro mi interface referenciado con las clases implementadas
        CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();
        CalculadoraDeImpuesto calc2 = new CalculadoraDeImpuesto();
        CalculadoraDeImpuesto calc3 = new CalculadoraDeImpuesto();

        calc.registra(cc);
        calc2.registra(cc2);
        calc3.registra(seguro);

        System.out.println("El total de impuesto de cuenta corriente es : " + calc.getTotalImpuesto());
        System.out.println("El total de impuesto de cuenta corriente es : " + calc2.getTotalImpuesto());
        System.out.println("El total de impuesto de seguro es :" + calc3.getTotalImpuesto());

    }
}
