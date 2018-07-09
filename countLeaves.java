public int countLeaves () {
    return getLeafCount(overallRoot);
}
private int getLeafCount(IntTreeNode overallRoot) {
        if (overallRoot == null)
            return 0;
        if (overallRoot.left == null && overallRoot.right == null)
            return 1;
        else
            return getLeafCount(overallRoot.left) + getLeafCount(overallRoot.right);
}