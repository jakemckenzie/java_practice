public static void switchPairs(ArrayList<String> a) {
    for (int b = 0; b < a.size() >> 1; b++) {
        String c = a.get(1 + (b << 1));
        a.set(1 + (b << 1), a.get(b << 1));
        a.set(b << 1, c);
    }
}