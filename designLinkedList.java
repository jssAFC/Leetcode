class MyLinkedList {
    ListNode head;
    ListNode tail;
    private int size;
    
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
            next=null;
        }
    }

    public MyLinkedList() {
        head=tail=null;
        size=0;

    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;

        ListNode temp=head;
        for(int i=0;i<index;i++){
            if(temp.next==null) break;
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        
        // ListNode node=new ListNode(val);
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if (size == 0) tail = node;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode node=new ListNode(val);
        if(size==0){
            head=tail=node;
        }else{

        tail.next=node;
        tail=node;
        }

        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;

        if(index==0){
            addAtHead(val);
            return;
        }

        if(index==size){
            addAtTail(val);
            return;
        }

        ListNode temp=head;

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }

        ListNode node=new ListNode(val);
        node.next=temp.next;
        temp.next=node;
    

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return ;

        if(index==0){
            head=head.next;
            if(size==1) tail=head;
            size--;
            return;
        }
        ListNode temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        
        if(temp.next!=null)
        temp.next=temp.next.next;
        if(index==size-1) tail=temp;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */