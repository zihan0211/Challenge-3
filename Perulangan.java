public class Perulangan {
    public static void main (String[] args) {
        int s = 9;
        for (int i = 1; i <= s; i++){
            for (int a = 8; a >= i; a--) {
                System.out.print(" ");
            }

            for (int b = 1; b <= i; b++){
                System.out.print("*");
            }

            for (int c = 1; c <= i - 1; c++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}