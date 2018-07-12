public String toString2() {
    return getTS(overallRoot);
}
public String getTS(IntTreeNode a) {
    if (a == null) return "empty";
    return (a.left == null && a.right == null) ? "" + a.data : "(" + a.data + ", " + getTS(a.left) + ", " + getTS(a.right) + ")";
}