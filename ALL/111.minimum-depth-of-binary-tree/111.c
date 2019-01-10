#include <stdio.h>
#include <stdlib.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int minDepth(struct TreeNode *root)
{
    int l, r;
    if (!root) //叶子节点
    {
        return 0;
    }
    else
    {
        // 由于要寻找到最近叶子节点的结点数量，当其中一条子树为空时，要计算另一条子树的深度
        if (root->left == NULL)
        {
            return minDepth(root->right) + 1;
        }
        else if (root->right == NULL)
        {
            return minDepth(root->left) + 1;
        }
        else
        {//当都不为空时，计算最短子树深度
            l = minDepth(root->left);
            r = minDepth(root->right);
            return (l < r ? l : r) + 1;
        }
    }
}

int main(int argc, char const *argv[])
{
    /* code */
    struct TreeNode *root = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    struct TreeNode *l = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    l->val = 2;
    l->left = NULL;
    l->right = NULL;
    root->val = 1;
    root->left = l;
    root->right = NULL;

    int x = minDepth(root);
    printf("%d", x);
    return 0;
}
