package org.example;
class Node {
    public int key;
    int value;
    Node left;
    Node right;
    int height;
    int balance;

    public Node(int value) {
        this.value = value;
        this.height = 1;
    }

    public Node() {

    }

    public int getValue(int i) {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBalance(int i) {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
