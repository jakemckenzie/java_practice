public void stutter(ArrayList<String> a) {
    ArrayList<String> b = new ArrayList<String>();
    for(String c : a) {
        for(int d = 0; d < 2; d++) {
            b.add(c);
        }
    }
    a.clear();
    a.addAll(b);
}