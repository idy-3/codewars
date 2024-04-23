package kata;

public class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var merged = new ListNode();
        var tempList = merged;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tempList.next = list1;
                list1 = list1.next;
            } else {
                tempList.next = list2;
                list2 = list2.next;
            }
            tempList = tempList.next;
        }

        tempList.next = (list1 != null) ? list1 : list2;

        return merged.next;
    }

    // Recursive
    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists1(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists1(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;
        return list1;
    }

    public static void printLinkedList(ListNode listNode) {
        var builder = new StringBuilder();

        builder.append("[");
        while (listNode != null) {
            builder.append(listNode.val).append(",");
            listNode = listNode.next;
        }
        builder.append("]");

        System.out.println(builder);
    }

}
