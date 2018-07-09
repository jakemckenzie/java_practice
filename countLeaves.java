<<<<<<< HEAD
public int countLeaves () {
    return getLeafCount(overallRoot);
}
private int getLeafCount(IntTreeNode overallRoot) {
        if (overallRoot == null) {
            return 0;
        }
        if (overallRoot.left == null && overallRoot.right == null) {
            return 1;
        } else {
            return getLeafCount(overallRoot.left) + getLeafCount(overallRoot.right);
        }
=======
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
>>>>>>> b4f0610fac53d5b234b1cf1f1593e39df868cfca
}