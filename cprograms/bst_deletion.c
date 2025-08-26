#include <stdio.h>
#include <stdlib.h>
struct Node {
    int item;
    struct Node* left;
    struct Node* right;
};
struct Node* newNode(int item) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->item = item;
    node->left = node->right = NULL;
    return node;
}
struct Node* insert(struct Node* root, int item) {
    if (root == NULL) {
        return newNode(item);
    }
    if (item < root->item) {
        root->left = insert(root->left, item);
    } else if (item > root->item) {
        root->right = insert(root->right, item);
    }
    return root;
}
struct Node* minValueNode(struct Node* node) {
    struct Node* current = node;
    while (current && current->left != NULL) {
        current = current->left;
    }
    return current;
}
struct Node* deleteNode(struct Node* root, int item) {
    if (root == NULL) {
        return root;
    }
    if (item < root->item) {
        root->left = deleteNode(root->left, item);
    } else if (item > root->item) {
        root->right = deleteNode(root->right, item);
    } else {
        if (root->left == NULL && root->right == NULL) {
            free(root);
            return NULL;
        }
        else if (root->left == NULL) {
            struct Node* temp = root->right;
            free(root);
            return temp;
        } else if (root->right == NULL) {
            struct Node* temp = root->left;
            free(root);
            return temp;
        }
        else {
            struct Node* temp = minValueNode(root->right);
            root->item = temp->item;
            root->right = deleteNode(root->right, temp->item);
        }
    }
    return root;
}
void inOrder(struct Node* root) {
    if (root != NULL) {
        inOrder(root->left);
        printf("%d ", root->item);
        inOrder(root->right);
    }
}
int main() {
    struct Node* root = NULL;
    root = insert(root, 50);
    root = insert(root, 30);
    root = insert(root, 20);
    root = insert(root, 40);
    root = insert(root, 70);
    root = insert(root, 60);
    root = insert(root, 80);
    printf("Binary Search Tree before deletion:\n");
    inOrder(root); 
    printf("\n");
    root = deleteNode(root, 20); 
    printf("Binary Search Tree after deletion of 20:\n");
    inOrder(root); 
    printf("\n");
    return 0;
}