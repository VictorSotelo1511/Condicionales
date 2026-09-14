import java.util.Scanner;

public class Programa3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros");
        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();
        sc.nextLine();
        int num3 = sc.nextInt();
        sc.nextLine();

        if (num1 > num2) {
           if (num1 > num3){
                System.out.println(num1);
           }
        } else if (num2 > num3) {
            System.out.print(num2);
        } else {
            System.out.print(num3);
        }
    }
}