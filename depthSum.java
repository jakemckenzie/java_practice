public int depthSum() {
    return depthSum(overallRoot, 1);
}
public int depthSum(IntTreeNode a, int b) {
    if(a == null) return 0;
    return depthSum(a.left, b + 1) + depthSum(a.right, b + 1) + (b * a.data);
}