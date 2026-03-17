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
    }
}