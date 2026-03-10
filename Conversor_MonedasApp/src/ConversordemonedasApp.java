import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversordemonedasApp {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        ConsultaApi consulta = new ConsultaApi();

        List<Conversion> historial = new ArrayList<>();

        while(opcion != 10){

            System.out.println("************************************");
            System.out.println("Sea bienvenido al conversor de monedas");
            System.out.println("");
            System.out.println("1) Dólar → Peso argentino");
            System.out.println("2) Peso argentino → Dólar");
            System.out.println("3) Dólar → Real brasileño");
            System.out.println("4) Real brasileño → Dólar");
            System.out.println("5) Dólar → Peso colombiano");
            System.out.println("6) Peso colombiano → Dólar");
            System.out.println("7) Sol Peruano → Dólar");
            System.out.println("8) Dólar → Sol Peruano");
            System.out.println("9) Ver historial de conversiones");
            System.out.println("10) Salir");
            System.out.println("************************************");

            opcion = lectura.nextInt();

            if(opcion == 10){
                System.out.println("Programa finalizado");
                break;
            }

            if(opcion == 9){

                System.out.println("Historial de conversiones:");

                if(historial.isEmpty()){
                    System.out.println("No hay conversiones registradas.");
                } else {
                    for(Conversion c : historial){
                        System.out.println(c);
                    }
                }
                continue;
            }

            System.out.println("Ingrese el valor que deseas convertir:");
            double cantidad = lectura.nextDouble();

            String monedaOrigen = "";
            String monedaDestino = "";

            switch(opcion){

                case 1:
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    break;

                case 2:
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    break;

                case 3:
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                    break;

                case 4:
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                    break;

                case 5:
                    monedaOrigen = "USD";
                    monedaDestino = "COP";
                    break;

                case 6:
                    monedaOrigen = "COP";
                    monedaDestino = "USD";
                    break;

                case 7:
                    monedaOrigen = "PEN";
                    monedaDestino = "USD";
                    break;

                case 8:
                    monedaOrigen = "USD";
                    monedaDestino = "PEN";
                    break;

                default:
                    System.out.println("Opción inválida");
                    continue;
            }

            Moneda moneda = consulta.buscarConversion(monedaOrigen, monedaDestino);

            double resultado = cantidad * moneda.conversion_rate();

            Conversion conversion = new Conversion(monedaOrigen, monedaDestino, cantidad, resultado);
            historial.add(conversion);

            System.out.printf("Tipo de cambio: %.6f%n", moneda.conversion_rate());
            System.out.printf("Resultado: %.2f %s%n", resultado, monedaDestino);
        }

        lectura.close();
    }
}