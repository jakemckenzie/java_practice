public boolean isFull() {
    return findIsFull(overallRoot);
}

public boolean findIsFull(IntTreeNode a) {
    if(a == null) return true;
    if(a.left == null && a.right != null || a.left != null && a.right == null) return false;
    return findIsFull(a.left) && findIsFull(a.right);
}