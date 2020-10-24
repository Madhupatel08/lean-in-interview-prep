 Node reverseList(Node head)
    {
        // code here
        Node previous = null ;
        Node current = head ;
        while(current != null){
            Node cn = current.next;
            current.next = previous;
            previous = current;
            current = cn;
        }
        
        return previous;
    }
