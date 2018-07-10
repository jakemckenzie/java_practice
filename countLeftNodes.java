public int countLeftNodes() {
    return countLeftNodes(overallRoot);
}
private int countLeftNodes(IntTreeNode a) {
    if(a == null) return 0;
    int b = countLeftNodes(a.right);
    if(a.left != null) b += 1 + countLeftNodes(a.left);
    return b;
}