
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamim
 */
public class TestCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X;

        while (true) {
            int sum = 0;
            X = sc.nextInt();
            if (X == 0) {
                break;
            } else {
                for (int i = X; i < (X + (5 * 2)); i += 2) {
                    int j = i;
                    if (i % 2 == 0) {
                        sum += j;
                    } else {
                        j = i + 1;
                        sum += j;
                    }
                }
                System.out.println(sum);
            }

        }

    }

}

// Node nodeA = new Node(6);
//        Node nodeB = new Node(3);
//        Node nodeC = new Node(4);
//        Node nodeD = new Node(2);
//        Node nodeE = new Node(1);
//
//        nodeA.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//        nodeD.next = nodeE;
//
//        System.out.println("This linked list's length is: (should print 5)");
//        System.out.println(countNodes(nodeA));
//    }
//
//    static int countNodes(Node head) {
//        // assuming that head != null
//        int count = 1;
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//            count += 1;
//        }
//        return count;
//    }
//}
//
//class Node {
//
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
