#include <stdio.h>
#include <stdlib.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode *removeNthFromEnd(struct ListNode *head, int n) {
    struct ListNode *dummy = (struct ListNode *)malloc(sizeof(struct ListNode));
    dummy->next = head;
    struct ListNode *first = dummy;
    struct ListNode *second = dummy;

    
    for (int i = 0; i <= n; i++) {
        first = first->next;
    }

    
    while (first != NULL) {
        first = first->next;
        second = second->next;
    }

 
    struct ListNode *temp = second->next;
    second->next = temp->next;
    free(temp);

    return dummy->next; 
}

int main() {
    
    struct ListNode *head = (struct ListNode *)malloc(sizeof(struct ListNode));
    head->val = 1;
    head->next = NULL;

   
    int n = 1; // Change this to the desired n value
    struct ListNode *newHead = removeNthFromEnd(head, n);

  
    struct ListNode *current = newHead;
    while (current != NULL) {
        printf("%d ", current->val);
        current = current->next;
    }

    return 0;
}
