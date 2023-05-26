package org.example;

import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;

public class arbolnodo {

    private String data;
    private arbolnodo leftChild;
    private arbolnodo rightChild;



    public arbolnodo(String data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }


    public void preorder(arbolnodo node, Consumer<arbolnodo> p){
        if (node == null)return;
        p.accept(node);

        preorder(node.leftChild,p);
        preorder(node.rightChild,p);
    }
    public Integer preorderFun(arbolnodo node, Function<arbolnodo,Integer > p){
        if (node == null) return 0;

        Integer res= p.apply(node);

        Integer leftRes=preorderFun(node.leftChild,p);
        Integer rightRes=preorderFun(node.rightChild,p);

        return res+leftRes+rightRes;
    }

    public void preorder(arbolnodo node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preorder(node.leftChild);
        preorder(node.rightChild);

    }

    public void iterativePreorder(arbolnodo node) {
        if (node == null) {
            return;
        }
        Stack<arbolnodo> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            arbolnodo Node = stack.pop();
            System.out.println(Node.getData());

            if (Node.getRightChild() != null) {
                stack.push(Node.getRightChild());
            }
            if (Node.getLeftChild() != null) {
                stack.push(Node.getLeftChild());
            }
        }
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public arbolnodo getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(arbolnodo leftChild) {
        this.leftChild = leftChild;
    }

    public arbolnodo getRightChild() {
        return rightChild;
    }

    public void setRightChild(arbolnodo rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return
                "data='" + data;
    }
}
