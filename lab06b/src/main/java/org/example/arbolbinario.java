package org.example;

import java.util.HashSet;
import java.util.Set;

public class arbolbinario {
    arbolnodo root;

    public boolean containsDuplicate(arbolnodo node ){
        Set<Integer> set= new HashSet<>();
        return traverse(node,set);
    }
    public boolean traverse(arbolnodo node , Set<Integer> set){
        if (node == null){
            return false;
        }
        if (set.contains(node.getVal())){
            return true;
        }
        set.add(node.getVal());
        return traverse(node.getLeftChild(),set)|| traverse(node.getRightChild(),set);
    }

}
