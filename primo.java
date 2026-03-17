public class primo {
    public static void main(String[] args) {
        int n = 7;
        boolean p = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                p = false;
                break;
            }
        }
        System.out.println(p);
    }
}