# Data Strucutre and Algorithms

##### The purpose of this repository is to store tests and examples of using some of the most famous data structures and some common algorithms.

___

## Array

By default, an array has the following characteristics:
- The get and set methods use an O(1)
- The insert and delete methods use an O(n)
- The size of the array is immutable (fixed)
- Allows random access to its objects

###### Test Class
```$xslt
DynamicArrayTest.java
```
___
    
## LinkedList
Unlike the array, a LinkedList has a chain of nodes, forming a list.

Each node has one object and the reference to the next node.

The first object in the list is called **head** and the last **tail**. (the tail has no reference to the next node).

By default, a LinkedList has the following characteristics:
- The get and set methods use an O(n)
- The insert and delete methods use an O(1)
- Does not allow random access

###### Test Class
```$xslt
LinkedListTest.java
``` 

___
    
## Stack
Stack follows the same logic of a LinkedList but they have some peculiarities.

By default Stacks have the **LIFO (Last In First Out)** behavior, where the last object entered in Stack is the first one to exit.

By default, Stack has the following characteristics:
- The method for insertion is called **push**
- The method for removal is called **pop**
- The method to get the ** head ** (last inserted object) is called **peek**

___
    
## Queue
Queue follows the same logic as a LinkedList but they have some peculiarities.

By default the Stacks have the **FIFO (First In First Out)** behavior, where the first object entered in the queue is the first one to exit.

By default, Queue has the following characteristics:
- The method for insertion is called **add**
- The method for removal is called **remove**
- The method to get the **head** (first inserted object) is called **peek**
    
___

## HashTable

HashTable is an object that uses an array of nodes with key and value and a reference to the next node (following the logic of a LinkedList) to avoid index conflicts.

When there is an index conflict in inserting an object into a HashTable, by default, the object with that key is retrieved and the new object is inserted in the **next** field, thus creating a reference between the objects (default LinkedList).


By default, Queue has the following characteristics:
- The method for insertion is called **put** receiving as parameters the *key* and *value*
- The method to recover is called **get** receiving as parameter the *key*

###### Test Class
```$xslt
HashTableTest.java
``` 

___

## BinaryTree

Binary trees are objects that have 2 children (left and right) of the same type as the parent.

By default, there is an algorithm called **Binary Search Tree** that aims to optimize the performance of a query that can traverse the entire tree structure.

The Binary Search Tree algorithm uses the Top to Bottom strategy to perform the child search.

By default this algorithm is classified as **O(log n)** - FIND, INSERT, DELETE

By default, a binary tree has the following characteristics.
- The children of a Binary Tree are called the Node.
- The node that does not have a parent is called a root
- Nodes with a value smaller than the root node are to the left and those with a larger value are to the right.

###### Test Class
```$xslt
BinarySearchTreeTest.java
``` 

## Binary Heap

Binary Heap is a strategy used to create a binary tree based on indices to define who is the parent, who is the child on the right and who is the child on the left.

There are 2 ways to use this algorithm.
- Using the **MAX** standard, we follow the pattern that the highest value node will always remain root, thus facilitating the recovery of your children. That is, if a node with a high value is later inserted, that node will go up in the hierarchy of the tree.
- Using the **MIN**, we follow the pattern that the lowest value node will always be root, creating a perfect balance of the tree structure.

This is a **high performance algorithm** because its way of extracting nodes is classified as **O(1)** and the **heapify algorithm**(balancing algorithm) is classified as **O(log n)**

###### Test Class
```$xslt
BinaryHeapMaxTest.java
BinaryHeapMinTest.java
``` 
___

##### References:
 - [Data Structures and Algorithms Bootcamp](https://www.udemy.com/data-structures-and-algorithms-bootcamp/learn/v4/content)
 
___
###### By [Júlio Falbo]