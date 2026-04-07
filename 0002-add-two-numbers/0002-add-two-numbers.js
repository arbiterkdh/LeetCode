/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    const dummy = new ListNode();
    let current = dummy;
    let sum = 0, carry = 0;
    while (l1 != null || l2 != null || carry > 0) {
        let val1 = 0, val2 = 0;
        if (l1 != null) {
            val1 = l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            val2 = l2.val;
            l2 = l2.next;
        }
        sum = val1 + val2 + carry;
        sum >= 10 ? (carry = 1, sum %= 10) : carry = 0;
        current.next = new ListNode(sum);
        current = current.next;
    }
    return dummy.next;
};