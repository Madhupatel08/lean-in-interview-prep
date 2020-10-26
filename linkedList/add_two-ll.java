//problem:  https://leetcode.com/problems/add-two-numbers/solution/

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        ListNode temp = head;
        while(temp1 != null && temp2 != null){
            int sum = temp1.val + temp2.val + carry;
            carry = sum/10;
            sum = sum%10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            temp1 = temp1.next ;
            temp2 = temp2.next ;
            
        }
        while(temp1 != null ){
            int sum = temp1.val +carry;
            carry = sum/10;
            sum = sum%10 ;
            temp.next = new ListNode(sum);
            temp = temp.next;
            temp1 = temp1.next ;    
        }
        while(temp2!=null){
            int sum = temp2.val + carry;
            carry = sum/10;
            sum = sum%10 ;
            temp.next = new ListNode(sum);
            temp = temp.next;
            temp2 = temp2.next; 
        }
        if (carry > 0){
            temp.next = new ListNode(carry);
        }
        return head.next;
    }
