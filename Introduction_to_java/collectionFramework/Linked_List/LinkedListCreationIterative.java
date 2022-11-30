// package Introduction_to_java.collectionFramework.Linked_List;

// class Node{
//     int i;
//     Node next;
// }

// class Linked{
//     public Node insertFront(int i , Node node){
//         Node a = getNewNode(i);
//         a.next=node;
//         return a;
//     }

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

// public class LinkedListCreationIterative {
//     public static void main(String[] args) {

//     Linked a = new Linked();
//     Node root = null;
//     root = a.insert(12,root);
//     root = a.insert(44,root);
//     root = a.insert(36,root);

//     root=a.insertFront(567, root);

//     a.printList(root);
        
//     }
// }