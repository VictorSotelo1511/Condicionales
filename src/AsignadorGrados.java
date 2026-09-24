import java.util.Scanner;

public class AsignadorGrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una calificación: ");
        int calificacion = sc.nextInt();
        sc.nextLine();

        if (calificacion >= 95) {
            System.out.println("A");
        } else if (calificacion >= 85) {
            System.out.println("B");
        } else if (calificacion >= 75) {
            System.out.println("C");
        } else if (calificacion >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

