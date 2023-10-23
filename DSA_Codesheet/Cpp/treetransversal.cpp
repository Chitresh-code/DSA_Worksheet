#include <iostream>
using namespace std;

// Node structure for the binary tree
struct Node {
    int data;
    Node* left;
    Node* right;
    Node(int value) : data(value), left(nullptr), right(nullptr) {}
};

// Function to perform In-Order Traversal
void inOrderTraversal(Node* root, bool& first) {
    if (root == nullptr) return;
    inOrderTraversal(root->left, first);
    if (!first) cout << " -> ";
    cout << root->data;
    first = false;
    inOrderTraversal(root->right, first);
}

// Function to perform Post-Order Traversal
void postOrderTraversal(Node* root, bool& first) {
    if (root == nullptr) return;
    postOrderTraversal(root->left, first);
    postOrderTraversal(root->right, first);
    if (!first) cout << " -> ";
    cout << root->data;
    first = false;
}

// Function to perform Pre-Order Traversal
void preOrderTraversal(Node* root, bool& first) {
    if (root == nullptr) return;
    if (!first) cout << " -> ";
    cout << root->data;
    first = false;
    preOrderTraversal(root->left, first);
    preOrderTraversal(root->right, first);
}
int main() {
    // Creating a sample binary tree
    Node* root = new Node(1);
    root->left = new Node(12);
    root->right = new Node(9);
    root->left->left = new Node(5);
    root->left->right = new Node(6);

  
    bool first = true;

    cout << "In-Order Traversal: ";
    inOrderTraversal(root, first);
    cout << endl;

    first = true;
    cout << "Post-Order Traversal: ";
    postOrderTraversal(root, first);
    cout << endl;

    first = true;
    cout << "Pre-Order Traversal: ";
    preOrderTraversal(root, first);
    cout << endl;

    // Clean up: Delete nodes to avoid memory leaks
    delete root->left->left;
    delete root->left->right;
    delete root->left;
    delete root->right;
    delete root;

    return 0;
}


// Output
//In-Order Traversal: 5 -> 12 -> 6 -> 1 -> 9
//Post-Order Traversal: 5 -> 6 -> 12 -> 9 -> 1
//Pre-Order Traversal: 1 -> 12 -> 5 -> 6 -> 9