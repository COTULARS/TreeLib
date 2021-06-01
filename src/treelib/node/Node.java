package treelib.node;

import java.util.ArrayList;

public abstract class Node {
    private Node parent;
    private ArrayList<Node> childs = new ArrayList<>();

    public Node(){
    }
    public Node getParent() {
        return parent;
    }
    public Node getChildById(int id) {
        return childs.get(id);
    }
    public void addChild(Node node){
        node.setParent(this);
        childs.add(node);
    }
    public void changeParent(Node newParent){
        newParent.addChild(this);
        parent.removeChild(this);
    }
    public void removeChild(Node rm){
        childs.remove(rm);
    }
    private void setParent(Node p){
        parent = p;
    }
    public int getChildCount(){
        return childs.size();
    }
    public abstract void walkAfterEvent();
    public abstract void walkBeforeEvent();
    public void walk(){
        walkAfterEvent();
        for (Node n : childs){
            n.walk();
        }
        walkBeforeEvent();
    }
}