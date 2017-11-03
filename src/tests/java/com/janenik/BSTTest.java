package com.janenik;

import com.janenik.BinarySearchTree.BST;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jane on 7/27/17.
 */
public class BSTTest {


    @Test
    public void testBST(){

        BST tree = new BST();

        tree.insert(5);
        tree.insert(9);
        tree.insert(0);
        tree.insert(2);
        tree.insert(23);
        tree.insert(6);
        tree.insert(1);

        BST tree2 = new BST();
        tree2.insert(4);

        assertTrue(tree.find(5));
        assertFalse(tree.find(100));

        assertTrue(tree.findRecusive(5));
        assertFalse(tree.findRecusive(100));

        assertNotEquals(8, tree.size());
        assertEquals(7, tree.size());

        assertNotEquals(24, tree.maxValue());
        assertEquals(23, tree.maxValue());

        assertEquals(0, tree.minValue());
        assertNotEquals(2, tree.minValue());

        assertEquals(0, tree.minValueRec());
        assertNotEquals(2, tree.minValueRec());

        assertNotEquals(2, tree.maxValueRec());
        assertEquals(23, tree.maxValueRec());

        assertNotEquals(9, tree.sizeIter());
        assertEquals(7, tree.sizeIter());

        assertEquals(4, tree.height());
        assertEquals(4, tree.heightIter());
        assertNotEquals(5, tree.heightIter());
        assertNotEquals(6, tree.height());

        assertTrue(tree.isBST());

        assertTrue(tree2.isBST());

        assertEquals(0, tree.kSmallestElement(1));
        assertEquals(23, tree.kSmallestElement(7));
    }
}
