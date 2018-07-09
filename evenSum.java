public int evenSum() {
	int sum = 0;
	boolean even = true;
	ListNode current = front;
	while (current != null) {
		sum = even ? sum + current.data: sum;
		even = !even;
		current = current.next;
	}
	return sum;
}