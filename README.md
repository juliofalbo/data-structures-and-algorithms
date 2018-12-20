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

___

## Binary Heap

Binary Heap is a strategy used to create a binary tree based on indices to define who is the parent, who is the child on the right and who is the child on the left.

Unlike a traditional binary tree, this algorithm creates an array of children (nodes) and the hierarchical structure of the tree is defined through the indices, as informed above.

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

## Memoization

Memoization is a strategy used to optimize recursion.

This strategy consists of creating an array and indexing the recursive results.

For example, a purely recursive Fibonacci algorithm was created and another using Memoization and a test was performed comparing the execution time of each one.

###### Test Class
```$xslt
FibonacciTest.java
``` 

___

## Sorting Algorithms

There are 3 basic algorithms for sorting and they are:
- Bubble Sort
- Merge Sort
- Quick Sort

Below I will explain each one better

#### Bubble Sort 
The strategy used by Bubble Sort Algorithm is to compare an object with the **next object** in the list.

This approach is functional but **not very performative**, since it is an algorithm with a run-time characteristic **O(n^2)**

###### Test Class
```$xslt
BubbleSortTest.java
``` 

#### Merge Sort 

The strategy used by Merge Sort Algorithm consists of **split the array into 2 parts**, until on only isolated objects.

The isolate objects are compared, ordered and regrouped in sequence. (as a merge)

###### Test Class
```$xslt
MergeSortTest.java
``` 

#### Quick Sort
The strategy used by Quick Sort Algorithm is to determine a focal point, called **pivot** (usually the middle object of the array, **but this is not a rule**), retrieve the first and last object (calling left and right) and compare values with the pivot value.

Objects larger than pivot **will move to the right** and **smaller objects to the left**.

At the end of this comparison, the algorithm separates the list into 2 lists and repeats the same process until all objects are sorted.

This algorithm is quite perfomatic and is classified with the **O(n log n)** runtime characteristic and of the three types presented is the **most performative**.

###### Test Class
```$xslt
QuickSortTest.java
``` 
___

## Graphs
Graphs can use 2 strategies:
- Directed (Unidirectional)
- Undirected (Bidirectional)

Your data structure has 3 settings:
- **Edge List**
- **Adjacency Matrix**
- **Adjacency List**

To exemplify the data structure of a graph, I will use the following examples:

![Directed](https://i.ibb.co/58SFwbN/graph.png)

#### Edge List
It consists of the mapping relationship between the elements.
###### Directed
```
[0,1]
[1,3]
[1,5]
[4,3]
[3,6]
[3,7]
[7,8]
```
###### Undirected
```
[0,1][1,0]
[1,3][3,1]
[1,5][5,1]
[4,3][3,4]
[3,6][6,3]
[3,7][7,3]
[7,8][8,7]
```

### Adjacency Matrix
It consists of the matrix of mapped relationships in the Edge List
###### Directed
```
  0 1 3 4 5 6 7 8
0 0 1 0 0 0 0 0 0
1 0 0 1 0 1 0 0 0
3 0 0 0 0 0 1 1 0
4 0 0 1 0 0 0 0 0
5 0 0 0 0 0 0 0 0
6 0 0 0 0 0 0 0 0
7 0 0 0 0 0 0 0 1
8 0 0 0 0 0 0 0 0
```
###### Undirected
```
  0 1 3 4 5 6 7 8
0 0 1 0 0 0 0 0 0
1 1 0 1 0 1 0 0 0
3 0 1 0 1 0 1 1 0
4 0 0 1 0 0 0 0 0
5 0 1 0 0 0 0 0 0
6 0 0 1 0 0 0 0 0
7 0 0 1 0 0 0 0 1
8 0 0 0 0 0 0 1 0
```

### Adjacency List
Consists of listing the mapped relationship in the Edge List through an array of LinkedList
###### Directed
```
0 -> [1]
1 -> [3,5]
3 -> [6,7]
4 -> [3]
5 -> []
6 -> []
7 -> [8]
8 -> []
```
###### Undirected
```
0 -> [1]
1 -> [0,3,5]
3 -> [1,4,6,7]
4 -> [3]
5 -> [1]
6 -> [3]
7 -> [3,8]
8 -> [7]
```

### Graph Algorithms

There are 2 types of algorithms when we talk about graphs:
- Breadth First Search (BFS)
- Depth First Search (DFS)

### Breadth First Search (BFS)
The BFS algorithm consists of defining the initial element and from that element recover its first level neighbors. 

After calculating all first-level neighbors, the algorithm passes to the 2-level neighbors and assumes successively.

It is also important to remember that this algorithm uses the **Queue concept (FIFO)** to scan the graphs.

### Depth First Search (DFS)
The DFS algorithm consists of defining an initial element and from this element retrieve any hierarchical structure of its children. 

Unlike BFS, this algorithm does not wait for the computation of the first-level neighbors to advance the level. When you verify that the element under analysis has children, it calculates all children of that element to jump to the other element of the same level.

It is also important to remember that this algorithm uses the **Stack concept (LIFO)** to scan the graphs.


**It is important to note that in the 2 algorithms (BFS and DFS), the already analyzed elements are marked as visited to avoid a StackOverflowError.**
___

##### References:
 - [Data Structures and Algorithms Bootcamp](https://www.udemy.com/data-structures-and-algorithms-bootcamp/learn/v4/content)
 
___
###### By [Júlio Falbo]