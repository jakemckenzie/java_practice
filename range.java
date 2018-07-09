public int range(ArrayList list) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
        min = (list.get(i) < min) ? list.get(i): min;
        max = (list.get(i) > max) ? list.get(i) : max;
    }
    return (max - min) + 1;
}