#include<stdio.h>
#include<stdlib.h>
#include <stdbool.h>
struct node
{
    int data;
    struct node *left,*right;
};
typedef struct node Node;
bool first;
// Function to perform In-Order Traversal
void inOrderTraversal(Node* root) {
    if (root == NULL) return;
    inOrderTraversal(root->left);
    if (!first) printf(" -> ");
    printf("%d",root->data);
    first = false;
    inOrderTraversal(root->right);
}
// Function to perform Post-Order Traversal
void postOrderTraversal(Node* root) {
    if (root == NULL) return;
    postOrderTraversal(root->left);
    postOrderTraversal(root->right);
    if (!first) printf(" -> ");
    printf("%d",root->data);
    first = false;
}

// Function to perform Pre-Order Traversal
void preOrderTraversal(Node* root) {
    if (root == NULL) return;
    if (!first) printf(" -> ");
    printf("%d",root->data);
    first = false;
    preOrderTraversal(root->left);
    preOrderTraversal(root->right);
}
Node * createNode(int data){
    Node *root=malloc(sizeof(Node));
    root->data=data;
    root->left=NULL;
    root->right=NULL;
}
int main() {
    // Creating a sample binary tree
    Node* root =  createNode(1);
    root->left = createNode(12);
    root->right = createNode(9);
    root->left->left = createNode(5);
    root->left->right = createNode(6);


    first = true;

    printf( "In-Order Traversal: ");
    inOrderTraversal(root);
    printf("\n");

    first = true;
    printf( "Post-Order Traversal: ");
    postOrderTraversal(root);
    printf("\n");

    first = true;
    printf( "Pre-Order Traversal: ");
    preOrderTraversal(root);
    printf("\n");

    // Clean up: Delete nodes to avoid memory leaks
    free(root->left->left);
    free(root->left->right);
    free(root->left);
    free(root->right);
    free(root);

    return 0;
}
