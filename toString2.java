public String toString2(){
    StringBuilder a = new StringBuilder();
    ListNode b = front;
    a.append('[');
    while (b != null){
        a.append(b.data);
        b = b.next;
        a.append(", ");
    }
    if (a.length() > 2) {
        a.deleteCharAt(a.length() - 1);
        a.deleteCharAt(a.length() - 1);
    }
    a.append(']');
    return a.toString();
}