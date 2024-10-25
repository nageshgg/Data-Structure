import java.util.ArrayList;

 class Node {
    int data;
    ArrayList<Node> children;

    Node(int data) {
        this.data = data;
        this.children = null;
    }

    boolean addRootNode(int data){
        ArrayList<Node> children = null;
        Node newNode = new Node(data);
        return true;
    }
}

public class Tree {
    public static void main(String[] args) {
        Node n= new Node(1);

    }
}
