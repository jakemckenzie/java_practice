public void stutter(ArrayList<String> a, int z) {
    ArrayList<String> b = new ArrayList<String>();
    for(String c : a) {
        for(int d = 0; d < z; d++)
            b.add(c);
    }
    a.clear();
    a.addAll(b);
}