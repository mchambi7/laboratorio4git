import java.util.Scanner;
public class primo {
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 29; 
        if (esPrimo(num)) {
            System.out.println(num+ "es primo");
        } else {
            System.out.println(num+ "no es primo.");
        }
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