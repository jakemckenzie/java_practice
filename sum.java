public int sum () {
    return getSum(overallRoot);
}

public int getSum(IntTreeNode overallRoot) {
    if (overallRoot == null){
        return 0;
    }
    return getSum(overallRoot.left) + overallRoot.data + getSum(overallRoot.right);
}