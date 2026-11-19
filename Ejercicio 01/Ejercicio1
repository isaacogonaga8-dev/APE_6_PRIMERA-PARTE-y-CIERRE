import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] gastos = new double[7];
        double suma = 0;

        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Ingrese el gasto del día " + (i + 1) + ": ");
            gastos[i] = sc.nextDouble();
            suma += gastos[i];
        }

        double promedio = suma / gastos.length;
        int diasIncremento = 0;

        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] *= 1.10;
                diasIncremento++;
            }
        }

        System.out.printf("\nGasto total: %.2f\n", suma);
        System.out.printf("Promedio diario: %.2f\n", promedio);
        System.out.println("Días con incremento: " + diasIncremento);
        
        System.out.println("Arreglo actualizado en orden inverso:");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Día %d: %.2f\n", (i + 1), gastos[i]);
        }
    }
}
