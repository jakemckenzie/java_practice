public void doublePositives() {
    doublePositives(overallRoot);
}
public void doublePositives(IntTreeNode a) {
    if(a == null) return;
    if(a.data > 0) a.data <<= 1;    
    doublePositives(a.left);
    doublePositives(a.right);
}