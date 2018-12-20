package algorithms.graphs;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {

    private Graph graph;

    @Before
    public void setUp() {
        graph = new Graph(8);
    }

    @Test
    public void breadFirstSearch() throws Exception {
        graph.addBidirectionalEdge(0, 1);
        graph.addBidirectionalEdge(1, 4);
        graph.addBidirectionalEdge(4, 6);
        graph.addBidirectionalEdge(6, 0);
        graph.addBidirectionalEdge(1, 5);
        graph.addBidirectionalEdge(5, 3);
        graph.addBidirectionalEdge(3, 0);
        graph.addBidirectionalEdge(5, 2);
        graph.addBidirectionalEdge(2, 7);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 0)");

        Assert.assertEquals("01634527", graph.breadthFirstSearch(0));
    }

    @Test
    public void depthFirstSearch() {
        graph.addBidirectionalEdge(0, 1);
        graph.addBidirectionalEdge(1, 4);
        graph.addBidirectionalEdge(4, 6);
        graph.addBidirectionalEdge(6, 0);
        graph.addBidirectionalEdge(1, 5);
        graph.addBidirectionalEdge(5, 3);
        graph.addBidirectionalEdge(3, 0);
        graph.addBidirectionalEdge(5, 2);
        graph.addBidirectionalEdge(2, 7);

        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 0)");

        Assert.assertEquals("03527641", graph.depthFirstSearch(0));
    }

    @Test
    public void depthFirstSearchDirected() {
        graph.addEdge(0, 1);
        graph.addEdge(1, 4);
        graph.addEdge(4, 6);
        graph.addEdge(6, 0);
        graph.addEdge(1, 5);
        graph.addEdge(5, 3);
        graph.addEdge(3, 0);
        graph.addEdge(5, 2);
        graph.addEdge(2, 7);

        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 0)");

        Assert.assertEquals("01527346", graph.depthFirstSearch(0));
    }

}
