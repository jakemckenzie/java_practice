public void takeSmallerFrom(LinkedIntList a) {
    if (front != null && a.front != null) {
        ListNode b = null;
        ListNode c = null;
        if (front.data > a.front.data) {
            b = front;
            c = front.next;
            front = a.front;
            a.front = b;
            a.front.next = front.next;
            front.next = c;
        }
        ListNode d = front;
        ListNode e = a.front;
        while (!(d == null && e == null && d.next == null && e.next == null)) {
            if (d.next.data > e.next.data) {
                b = d.next;
                c = d.next.next;
                d.next = e.next;
                e.next = b;
                e.next.next = d.next.next;
                d.next.next = c;                  
            } 
            d = d.next;
            e = e.next;
        }
    }
}