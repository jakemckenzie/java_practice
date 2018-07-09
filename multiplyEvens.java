public int multiplyEvens(int a) {
    if (a < 1) throw new IllegalArgumentException();
    if (a == 1) return 2;
    return 2 * a * multiplyEvens(a - 1);
}