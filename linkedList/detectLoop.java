//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1/?track=ppc-linkedlist&batchId=221#

public static boolean detectLoop(Node head){
        // Add code here
        Node slow_p = head;
        Node fast_p = head;
        while(slow_p != null && fast_p != null && fast_p.next != null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p == fast_p){
                return true;
            }
        }
        return false;
    }
