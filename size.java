public int size() {
    int[] a = new int[1];   
    preOrderParse(overallRoot, a);
    return a[0];
}
public void preOrderParse(IntTreeNode b, int[] a) {
    if (b == null) return;
    a[0]++;
    preOrderParse(b.left, a);
    preOrderParse(b.right, a);
}