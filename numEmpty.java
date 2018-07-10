public int numEmpty() {
    return getNumEmpty(overallRoot);
}

public int getNumEmpty(IntTreeNode root) {
    if (root == null) {
        return 1;
    } else {
        return getNumEmpty(root.left) + getNumEmpty(root.right);
    }
}