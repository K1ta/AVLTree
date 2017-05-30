package avltree;

import java.util.ArrayList;

/**
 *
 * @author K1ta
 */
public class Main {

    public static void main(String[] args) {
        AVLTree<Integer> tree1 = new AVLTree();
        tree1.add(1);
        tree1.add(2);
        tree1.add(3);
        tree1.add(4);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        Integer a[] = new Integer[3];
        a[0] = 100;
        a[1] = 20;
        a[2] = 10;
        Integer[] b = tree1.toArray(a);
        for(int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
