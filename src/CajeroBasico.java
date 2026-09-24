import java.util.Scanner;

public class CajeroBasico {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int saldo = 1000;
        System.out.println("Cajero automatico, ingresa un numero:");
        System.out.println("1. Verificar Saldo");
        System.out.println("2. Retirar Efectivo");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            System.out.println("Su saldo es de " + saldo);
        } else if (opcion == 2) {
            System.out.println("Ingresa la cantidad a retirar: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso. Su nuevo saldo es de " + saldo);
            } else {
                System.out.println("Fondos insuficientes");
            }
        } else {
            System.out.println("Opción no válida");
        }
    }
}
