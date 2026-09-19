import java.util.Scanner;

public class Programa1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        if(edad > 0) {
            if (edad < 18 && edad > 0) {
                System.out.println("Menor de Edad");
            } else if (edad >= 18 && edad < 50) {
            System.out.print("Adulto");
            } else {
                System.out.println("Adulto mayor");
            }
        } else {
            System.out.println("Edad no válida");
        }
    }
}
