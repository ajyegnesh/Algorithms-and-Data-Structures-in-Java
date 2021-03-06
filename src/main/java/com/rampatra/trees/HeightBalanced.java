package com.rampatra.trees;

import com.rampatra.base.BinaryNode;
import com.rampatra.base.BinarySearchTree;

import static java.lang.System.out;

/**
 * Created by IntelliJ IDEA.
 *
 * @author rampatra
 * @since 6/26/15
 * @time: 7:07 PM
 */
public class HeightBalanced<E extends Comparable<E>> extends BinarySearchTree<E> {

    /**
     * An empty tree is height-balanced. A non-empty binary tree T is balanced if:
     * 1) Left subtree of T is balanced
     * 2) Right subtree of T is balanced
     * 3) The difference between heights of left subtree and right subtree is not more than 1.
     *
     * @return True if tree is height balanced otherwise false.
     */
    public boolean isHeightBalanced() {
        return isHeightBalanced(root);
    }

    public boolean isHeightBalanced(BinaryNode<E> node) {
        if (node == null) return true;

        if (Math.abs(height(node.left) - height(node.right)) > 1) {
            return false;
        }

        return isHeightBalanced(node.left) && isHeightBalanced(node.right);
    }

    public static void main(String[] args) {
        HeightBalanced<Integer> bst = new HeightBalanced<>();
        bst.put(6);
        bst.put(3);
        bst.put(5);
        bst.put(7);
        bst.put(8);
        bst.put(9);
        out.print("\nIs height balanced: " + bst.isHeightBalanced());
    }
}
