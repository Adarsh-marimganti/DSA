//find merging point in two linkedlists, find the probelm link below
//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class FindMerge{
    public ListNode getIntersectionNode(ListNode n1, ListNode n2) {
        HashSet<ListNode> hs=new HashSet<>();
        while(n1!=null){
             hs.add(n1);
             n1=n1.next;
        }
        while(n2!=null){
            if(hs.contains(n2)) return n2;
            n2=n2.next;
        } 
        return n2;
    }
}