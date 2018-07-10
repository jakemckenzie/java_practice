public int height(){
    return getHeight(overallRoot);
}

public int getHeight (IntTreeNode root) {
    if (root == null) {
        return 0;
    } else {
        int l = getHeight(root.left) + 1;
        int r = getHeight(root.right) + 1;
        return (l > r) ? l : r;
    }
}