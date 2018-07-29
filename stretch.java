public void stretch(ArrayList<String> list, int a) {
    if(a < 1) list.clear();
    if (a < 2) return; 
    int b = list.size() * (a-1);
    ArrayList<String> list2 = list;
    for(int c = list2.size() - 1; c >= 0; c--) 
        for(int d = 0; d < a-1; d++) 
            list.add(c,list2.get(c));
}