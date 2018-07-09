public void takeSmallerFrom(LinkedIntList list2)
    {
        if(this.front== null|| list2.front == null)return;
        
        if(this.front.data> list2.front.data)
        {
            ListNode temp = this.front;
           this.front = list2.front;
            list2.front = temp;
            swapSubList( this.front, list2.front);
            
        }
        takeSmallerFrom(this.front, list2.front);
    }