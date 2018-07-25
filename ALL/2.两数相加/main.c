#include <stdio.h>
#include <math.h>
#include <stdlib.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

int getLength(struct ListNode *li) {
    int length = 0;
    while (li->next != NULL) {
        length++;
    }
    return length;
}

struct ListNode *creat(int m) {
    struct ListNode *h, *p, *t;
    h = (struct ListNode *) malloc(sizeof(struct ListNode));
    h->next = NULL;
    t = h;
    int count = 0;
    int n = m;
    while (m != 0) {
        m /= 10;
        count++;
    }
    for (int j = 0; j < count; ++j) {
        int k = (int) (n % (int) pow(10, j + 1) / pow(10, j));
        p = (struct ListNode *) malloc(sizeof(struct ListNode));
        p->val = k;
        p->next = NULL;
        t->next = p;
        t = p;
    }
    return h;
}

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *addTwoNumbers(struct ListNode *l1, struct ListNode *l2) {
    int len1 = getLength(l1);
    int len2 = getLength(l2);
    int r1 = 0;
    int r2 = 0;
    for (int i = 0; i < len1; ++i) {
        r1 += l1->val;
        l1 = l1->next;
    }
    for (int i = 0; i < len2; ++i) {
        r2 += l2->val;
        l2 = l2->next;
    }
    printf("%d", r1 + r2);
    return creat(r1 + r2);
}


int main() {
    printf("Hello, World!\n");
    addTwoNumbers(creat(342), creat(465));
    return 0;
}