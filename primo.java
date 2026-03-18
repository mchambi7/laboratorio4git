import java.util.Scanner;
public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int numero = sc.nextInt(); 
        if (numero <= 1) {
            System.out.println(numero + " no es primo");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            } 
            if (esPrimo) {
                System.out.println(numero + " si es primo");
            } else {
                System.out.println(numero + " no es primo");
            }
        }
        sc.close();
    }
}