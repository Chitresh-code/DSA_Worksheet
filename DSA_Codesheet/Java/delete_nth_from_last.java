package DSA_Worksheet.DSA_Codesheet.Java;

public class delete_nth_from_last {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        removeFromLast(head,1);
        Node curr = head;
        //printing the nodes
        while (curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }


    }
    static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    static Node removeFromLast(Node head,int n){
        //finding the length of the list
        Node curr = head;
        int len = 0;
        while (curr !=null){
            len++;
            curr = curr.next;
        }
        if(len==0){
            return null;
        }
        //node which we want to delete is at the len-n position from starting
        int temp = len-n;
        Node prev = null;
        curr = head;
        for (int i = 0; i < temp; i++) {
            prev = curr;
            curr = curr.next;
        }
        if(prev==null){
            head = head.next;
            return head;
        }else{
            prev.next = prev.next.next;
        }

        return head;
    }

}