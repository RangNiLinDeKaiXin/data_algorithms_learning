package com.lcc.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author: lcc
 * @Date: 2018-11-07
 **/
public class BinaryTree {


  public static Node init() {
    Node J = new Node(8, null, null);
    Node H = new Node(4, null, null);
    Node G = new Node(2, null, null);
    Node F = new Node(7, null, J);
    Node E = new Node(5, H, null);
    Node D = new Node(1, null, G);
    Node C = new Node(9, F, null);
    Node B = new Node(3, D, E);
    Node A = new Node(6, B, C);
    return A;  //返回根节点
  }

  //打印节点数值
  public static void printNode(Node node) {
    System.out.print(node.getData());
  }


  //先序遍历
  public static void preOrder(Node root) {
    Stack<Node> stack = new Stack<>();
    Node node = root;
    while (node != null || stack.size() > 0) {
      if (node != null) {
        printNode(node);
        stack.push(node);
        node = node.getLeftNode();
      } else {

        node = stack.pop();
        node = node.getRightNode();

      }

    }

  }


  //中序遍历
  public static void inOrder(Node root) {
    Stack<Node> stack = new Stack<>();
    Node node = root;
    while (node != null && stack.size() > 0) {
      if (node.getLeftNode() != null) {
        stack.push(node);
        node = node.getLeftNode();
      } else {
        node = stack.pop();
        printNode(node);
        node = node.getRightNode();


      }

    }


  }


  //后续遍历
  public static void postOrder(Node root) {
    Stack<Node> stack = new Stack<Node>();
    Stack<Node> output = new Stack<Node>();//构造一个中间栈来存储逆后续遍历的结果
    Node node = root;
    while (node != null || stack.size() > 0) {
      if (node != null) {
        stack.push(node);
        output.push(node);
        node = node.getRightNode();
      } else {
        node = stack.pop();
        node = node.getLeftNode();
      }

    }

    while (output.size() > 0) {
      printNode(output.pop());
    }

  }

  public static void levelOrder(Node root) {
    Node last = root;
    Node nlast = root;
    //层次遍历
    Queue<Node> queue = new LinkedList();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node t = queue.peek();
      System.out.print(queue.poll().getData() + " ");
      if (t.getLeftNode() != null) {
        queue.add(t.getLeftNode());
        nlast = t.getLeftNode();
      }
      if (t.getRightNode() != null) {
        queue.add(t.getRightNode());
        nlast = t.getRightNode();
      }
      // 如果当前输出结点是最右结点，那么换行
      if (last == t) {
        System.out.println();
        last = nlast;
      }
    }
  }

  public static void main(String[] args) {
    Node root = init();

    System.out.println("先序遍历");
    preOrder(root);
    System.out.println("");

    System.out.println("中序遍历");
    inOrder(root);
    System.out.println("");

    System.out.println("后序遍历");
    postOrder(root);
    System.out.println("");

    System.out.println("层遍历");
    levelOrder(root);
    System.out.println("");

  }


}
