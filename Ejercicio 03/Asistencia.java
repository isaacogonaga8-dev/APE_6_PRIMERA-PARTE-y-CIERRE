import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = sc.nextInt();

        int[] notas = new int[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nota del estudiante " + (i + 1) + ": ");
                notas[i] = sc.nextInt();
            } while (notas[i] < 0 || notas[i] > 20);
        }

        int suma = 0, aprobados = 0, reprobados = 0;

        for (int i = 0; i < n; i++) {
            suma += notas[i];
            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = (double) suma / n;

        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        System.out.println("Estudiantes bajo el promedio:");
        for (int i = 0; i < n; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1));
            }
        }
    }
}
