import java.util.Scanner;

public class Programa2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero");
        int num = sc.nextInt();
        sc.nextLine();

        if (num > 0) {
            System.out.println("Es positivo");
        } else if (num < 0 ) {
            System.out.print("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
}