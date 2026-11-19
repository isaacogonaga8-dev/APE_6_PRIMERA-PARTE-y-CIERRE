import java.util.Scanner;

public class FiltroSumaProduccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] produccion = new int[10];
        int sumaIndicesPares = 0;
        int contadorImparesMayores15 = 0;
        int sumaTotal = 0;

        for (int i = 0; i < produccion.length; i++) {
            System.out.print("Ingrese la cantidad de piezas del turno " + (i + 1) + " (índice " + i + "): ");
            produccion[i] = sc.nextInt();

            sumaTotal += produccion[i];

            
            if (i % 2 == 0) {
                sumaIndicesPares += produccion[i];
            }

            
            if (produccion[i] % 2 != 0 && produccion[i] > 15) {
                contadorImparesMayores15++;
            }
        }

        double promedioGeneral = (double) sumaTotal / produccion.length;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma en índices pares (0, 2, 4, ...): " + sumaIndicesPares);
        System.out.println("Turnos con cantidad impar y mayor a 15: " + contadorImparesMayores15);
        System.out.printf("Promedio general de producción: %.2f%n", promedioGeneral);

        sc.close();
    }
}
