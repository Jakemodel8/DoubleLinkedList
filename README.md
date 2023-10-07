# DoubleLinkedList
# DLNode

## Collaborator 
- Nikhil Jindal

Two classes to implement a doubly linked list. DLNode contains the nodes for the list. DoubleLinkedList contains the implementation of the actual list.

DLNode:
- Constructor takes a generic element, and two DLNodes, next and previous

- getNext:
  - return the following node
 
- setElement:
  - set the element of the node
    
- getElement:
  - get the element of the node
 
- setNext:
  - set the pointer for the following node
  
- getPrev:
  - get the pointer to the previous node
    
- setPrev:
  - set the pointer for the previous node

DoubleLinkedList
- Constructor takes nothing

- getHead:
  - return the node at the head of the list
  
- setHead:
  - set the head of the list
  
- getTail:
  - return the tail of the list

- setTail:
  - set the tail of the list
    
- add:
  - add a node to the end of the list
    
- swap:
  - swap a node with its predecessor
  - contains cases to handle edge cases
