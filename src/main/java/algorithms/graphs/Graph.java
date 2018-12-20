package algorithms.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencies;

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencies = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjacencies[i] = new LinkedList<>();
        }
    }

    public void addEdge(int element, int neighbor) {
        adjacencies[element].add(neighbor);
    }

    public void addBidirectionalEdge(int element, int neighbor) {
        adjacencies[element].add(neighbor);
        adjacencies[neighbor].add(element);
    }

    public String breadthFirstSearch(int element) {
        boolean visited[] = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[element] = true;
        System.out.println("Starting at " + element);
        queue.add(element);

        StringBuilder path = new StringBuilder();
        while (!queue.isEmpty()) {
            element = queue.poll();
            path.append(element);
            System.out.println("De-queueing " + element);

            Iterator<Integer> i = adjacencies[element].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    System.out.println("Queueing " + n);
                    queue.add(n);
                }
            }
        }
        return path.toString();
    }

    public String depthFirstSearch(int element) {
        boolean visited[] = new boolean[vertices];

        Stack<Integer> stack = new Stack<>();
        stack.add(element);

        visited[element] = true;

        StringBuilder path = new StringBuilder();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            path.append(current);
            System.out.print(current + " ");

            Iterator<Integer> i = adjacencies[current].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    stack.add(n);
                    visited[n] = true;
                }
            }
        }
        return path.toString();
    }
}

//Based on https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/