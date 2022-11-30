// package Introduction_to_java.collectionFramework.Linked_List;

// class Node{
//     int i;
//     Node next;
// }

// class Linked{

//     public void printList(Node node){
//         if(node == null ){
//             return;
//         }
//         System.out.print(node.i + " ");
//         printList(node.next);
//     }

//     private Node getNewNode(int i){
//         Node a = new Node();
//         a.i = i;
//         a.next = null;
//         return a;
//     }

//     public Node insert(int i, Node node){
//         if(node==null){
//             return getNewNode(i);
//         }
//         else {
//             node.next = insert(i,node.next);
//         }
//         return node;
//     }

// }

// public class LinkedListCreation1 {
//     public static void main(String[] args) {

//     Linked a = new Linked();
//     Node root = null;
//     root = a.insert(12,root);
//     root = a.insert(44,root);
//     root = a.insert(36,root);

//     a.printList(root);
        
//     }
// }