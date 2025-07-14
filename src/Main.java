import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion=0;
        while (opcion != 8){
            System.out.println("\n\n*********************************************************\n"+
                    "Bienvenido/a al Conversor de Moneda! \n\n"+
                    "Ingrese la conversión que deseas realizar: \n\n"+
                    "1) Dólar =>> Peso Argentino\n"+
                    "2) Peso Argentino =>> Dólar\n"+
                    "3) Dólar =>> Real Brasileño\n"+
                    "4) Real Brasileño =>> Dólar\n"+
                    "5) Dólar =>> Peso Colombiano\n"+
                    "6) Peso Colombiano =>> Dólar\n"+
                    "7) Convertir otra moneda =>> Dólar\n"+
                    "8) Salir");
            System.out.println("****************************************************************");
            System.out.println("Elija una Opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                    break;
                case 3:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, teclado);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, teclado);
                    break;
                case 8:
                    System.out.println("Gracias por usar nuestro Conversor de Monedas...\n" +
                            "Thank u for choosing our virtual Money Exchange...");
                default:
                    System.out.println("Opción no válida, elija otra opción porfavor.");
                    break;
            }
        }
    }
}