#include <iostream>
#include <malloc.h>

using namespace std;

struct node {
    int value;
    struct node *next;
};

int main() {
    int n, k, x;

    cin >> n >> k >> x;

    struct node *head = nullptr, *tail = nullptr;
    for (int i = 0; i < n; ++i) {
        struct node *temp = (struct node *) malloc(sizeof(struct node *));
        temp->value = i + 1;
        if (i == 0) {
            head = temp;
            tail = temp;
        } else {
            tail->next = temp;
            tail = temp;
        }
    }
    tail->next = head;

    while (head->value != x) {
        head = head->next;
    }

    int dead = 0, toKill = 0;
    while (dead != n - 1) {
        toKill = head->value % k;
        while (toKill-- && dead < n - 1) {
            struct node *temp = head;
            temp = head->next;
            head->next = head->next->next;
            free(temp);
            dead++;
        }
        head = head->next;
    }

    cout << head->value << "\n";

    return 0;
}