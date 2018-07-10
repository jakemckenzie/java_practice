public void printLevel(int a) {
    if(a < 1) throw new IllegalArgumentException();       
    printLevel(a, overallRoot);
}

public void printLevel(int a, IntTreeNode b) {
    if(b == null) return;
        
    if(a == 1) {
        System.out.println(b.data);
        return;
    }
    printLevel(a - 1, b.left);
    printLevel(a - 1, b.right);
}