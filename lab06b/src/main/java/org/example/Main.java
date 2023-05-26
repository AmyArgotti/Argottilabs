package org.example;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        arbolnodo a = new arbolnodo("A");
        arbolnodo b = new arbolnodo("BB");
        arbolnodo c = new arbolnodo("CCC");
        arbolnodo d = new arbolnodo("DDDD");
        arbolnodo rootF = new arbolnodo("F");

        arbolnodo g = new arbolnodo("G");
        arbolnodo e = new arbolnodo("EE");
        arbolnodo h= new arbolnodo("HHH");
        arbolnodo i = new arbolnodo("IIII");

        d.setLeftChild(c);
        d.setRightChild(e);

        b.setLeftChild(a);
        b.setRightChild(d);

        i.setLeftChild(h);

        g.setRightChild(i);

        rootF.setLeftChild(b);
        rootF.setRightChild(g);
        rootF.preorder(rootF,System.out::println);

        rootF.preorder(rootF,node ->{
            for (int j = 0; j <10 ; j++) {
                System.out.println(node.getData());

            }
        });
        System.out.println("-----------------");
        System.out.println(rootF.preorderFun(rootF,node -> node.getData().length()));

    }
}
