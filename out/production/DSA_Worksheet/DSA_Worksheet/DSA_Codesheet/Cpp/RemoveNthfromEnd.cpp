// deleting a node from end
#include <bits/stdc++.h>
using namespace std;

struct Node {
	int data;
	struct Node* next;
	Node(int value)
	{
		this->data = value;
		this->next = NULL;
	}
};

int length(Node* head)
{
	Node* temp = head;
	int count = 0;
	while (temp != NULL) {
		count++;
		temp = temp->next;
	}
	return count;
}

void printList(Node* head)
{
	Node* ptr = head;
	while (ptr != NULL) {
		cout << ptr->data << " ";
		ptr = ptr->next;
	}
	cout << endl;
}

Node* deleteNthNodeFromEnd(Node* head, int n)
{
	int Length = length(head);
	int nodeFromBeginning = Length - n + 1;
	Node* prev = NULL;
	Node* temp = head;
	for (int i = 1; i < nodeFromBeginning; i++) {
		prev = temp;
		temp = temp->next;
	}
	if (prev == NULL) {
		head = head->next;
		return head;
	}
	else {
		prev->next = prev->next->next;
		return head;
	}
}

int main()
{
	Node* head = new Node(1);
	head->next = new Node(2);
	head->next->next = new Node(3);
	head->next->next->next = new Node(4);
	head->next->next->next->next = new Node(5);

	head = deleteNthNodeFromEnd(head, 1);

	printList(head);
	return 0;
}
