public static void printTwos(int n) {
    if (n == 0) throw new IllegalArgumentException();
    if(n % 4 == 0) {
        System.out.print("2 * ");
        printTwos(n / 4);
        System.out.print(" * 2");
    } else if(n % 2 == 0) {
        System.out.print("2 * ");
        printTwos(n / 2);
    } else {
        System.out.print(n);
    }
}