public String toString2(){
    StringBuilder a = new StringBuilder();
    ListNode b = front;
    a.append('[');
    while (b != null){
        a.append(b.data);
        b = b.next;
    }
    a.append(']');
    return a.toString();
}