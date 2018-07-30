public void compressDuplicates(Stack<Integer> s) {
    if(s.size() < 1) return;
    int c = 1;    
    Queue<Integer> q = new LinkedList<Integer>();
    int t = s.pop();    
    while(!s.isEmpty()) {
        int n = s.pop();
        if(n == t) {
            c++;
        } else {
            q.add(t);
            q.add(c);
            c = 1;
            t = n;
        }
    }  
    q.add(t);
    q.add(c);
    while(!q.isEmpty()) s.push(q.remove());
    while(!s.isEmpty()) q.add(s.pop());
    while(!q.isEmpty()) s.push(q.remove());
    
}