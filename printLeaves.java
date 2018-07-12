public void printLeaves() {
    if (overallRoot != null) {
        System.out.print("leaves:");
        printLeaves(overallRoot);
    } else {
        System.out.println("no leaves");
    }
}

public void printLeaves(IntTreeNode a) {
    if (a == null) return;
    if (a.left == null && a.right == null) {
        System.out.print(" " + a.data);
    } else {
        printLeaves(a.right);
        printLeaves(a.left);
    }
}