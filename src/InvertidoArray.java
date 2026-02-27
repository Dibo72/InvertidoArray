import java.util.Scanner;
public class InvertidoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique la longitud:");
        int longitud = sc.nextInt();
        int[] primero = new int[longitud];
        int[] invertido = new int[longitud];

        longitud-=1;

        for (int i = 0; i <= longitud; i++) {
            System.out.println("Introduce el valor numero " + (i+1) + ":");
            primero[i] = sc.nextInt();
        }

        for (int i = 0; i <= longitud; i++) {
            invertido[longitud-i] = primero[i];
        }

        System.out.println("Array normal:");
        for (int i = 0; i <= longitud; i++) {
            System.out.print(primero[i] + " ");
        }

        System.out.println();

        System.out.println("Array invertido:");
        for (int i = 0; i <= longitud; i++) {
            System.out.print(invertido[i] + " ");
        }
    }
}