import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String _monedaBase,
                                 String _monedaObjetivo,
                                 ConsultaMoneda consulta,
                                 Scanner teclado) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMonedas(_monedaBase, _monedaObjetivo);
        System.out.println("La conversión para hoy de: ["+
                _monedaBase+"] equivale a "+ monedas.conversion_rate()+" ["+
                _monedaObjetivo+"]");

        System.out.println("Ingrese el valor que deseas convertir: " +_monedaBase);

        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();

        System.out.println("El valor " + cantidad +
                "[" + _monedaBase +
                "] corresponde al valor final de: "
                + cantidadConvertida + "" +
                "[" + monedas.target_code() + "]");
    }

    public static void convertirOtraMoneda (ConsultaMoneda consulta, Scanner teclado) {
        System.out.println("Ingrese el código de la moneda que desea convertir: ");

        String monedaBase = teclado.nextLine().toUpperCase();

        System.out.println("Ingrese la moneda Objetivo: ");

        String monedaObjetivo = teclado.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, teclado);
    }
}
