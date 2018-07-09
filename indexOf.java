public int indexOf(int a) {
    ListNode b = front;
    int c = -1;
    int d = 0;
    while (b != null) {
        if (b.data == a) return d;
        d++;
        b = b.next;
    }
    return -1;
}