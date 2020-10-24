public static void removeDuplicates(Node head) {
	   HashSet<Integer>map = new HashSet<>();
        Node current = head ;
        Node previous = null ;
      while(current!=null){
          int val = current.data;
          if(map.contains(val)){
              previous.next = current.next;
          }else{
              map.add(val);
              previous = current;
          }
          current = current.next;
      } 
	}
