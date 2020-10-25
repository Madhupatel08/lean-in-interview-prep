
//approach 1 (basic)
public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode temp = head ;
        while(temp!=null){
            temp = temp.next ;
            len++;
        }
        temp = head ;
        int count = 0;
        while(count<len/2){
            temp = temp.next ;
            count++;;
        }
        return temp;
    }
    
//approach 2 
//using fast and slow pointer
public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
