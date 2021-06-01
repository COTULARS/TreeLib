package treelib.tree;

import treelib.node.Node;

import java.util.HashMap;

public class Tree {
    private HashMap<Object, Node> indexes = new HashMap<>();
    public static Node MAIN;

    public Tree(Node main){
        MAIN = main;

    }
}
