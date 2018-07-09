public int range(ArrayList list) {
    if (list.size() == 0) return 0; 
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
        min = ((int)list.get(i) < min) ? (int)list.get(i): min;
        max = ((int)list.get(i) > max) ? (int)list.get(i) : max;
    }
    return (max - min) + 1;
}