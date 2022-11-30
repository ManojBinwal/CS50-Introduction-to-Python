package Introduction_to_java.collectionFramework.Linked_List;

class Node{   //a node is collection of a data and a reference.
    int i;    //we are just taking integer data type in int right now          
    Node next; //this will store reference
}

class Linked{

    public Node insertFront(int i , Node node){  //function to insert node at the starting of list
        Node a = getNewNode(i);  //node a call the method getnewnode which creates a new node and set i as data
        a.next=node; //sets the reference as next node
        return a;
    }

    public void printList(Node node){
            if(node==null){
                return;
            }
            System.out.print(node.i + " ");
            printList(node.next);
        }


    private Node getNewNode(int i){ //setter method for the node class
        Node a = new Node();        
        //created object of node class // this will be address where new data is 
        //stored therefore the refence to the previous node.
        a.i = i;                    //set the data/element to be i
        a.next = null;              //set the reference on the node to null since it is pointing to nothing.
        return a;                   //this will return new data and reference 

    }

    

    public Node insert(int i, Node node){
        if(node==null){   //checking if node is null, it will be when there are no elements
            return getNewNode(i); //if null then it will return new data and reference(node)
        }
        else{
            node.next = insert(i, node.next); 
            //inset element at node then create new node and insert elements again.
        }
        return node;
    }
    
}

public class LinkedListCreation {
    public static void main(String[] args) {
        Linked a = new Linked(); //object of linked class to manipulate methods of linked class
        Node root = null;  //root node is always null when there are no elements
        root = a.insert(12,root);  //inserting element 12 in root node // insert method to insert data
        root = a.insert(44,root);
        root = a.insert(99,root);

        root = a.insertFront(455,root);

        a.printList(root);
    }
}
