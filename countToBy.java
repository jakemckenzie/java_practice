public void countToBy(int a, int b) {
    if (a < 1 || b < 1) {
        throw new IllegalArgumentException();
    } else if (a < b) {
        System.out.print(a);
    } else {
        countToBy(a, b, a % b != 0 ? a % b : 1);
    }
}

public void countToBy(int a, int b, int c) {
    if (c <= a) {
        System.out.print(c);
        if (c != a) System.out.print(", ");
        countToBy(a, b, b + c);
    }
}