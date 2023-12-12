package dsa.weighted_graph;

public class WeightedGraphMain {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
//        graph.addEdge("A", "B", 1);
//        graph.addEdge("B", "C", 2);
//        graph.addEdge("A", "C", 10);

//        graph.addEdge("A", "B", 0);
//        graph.addEdge("B", "C", 0);
//        graph.addEdge("C", "A", 0);

        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "D", 4);
        graph.addEdge("C", "D", 5);
        graph.addEdge("A", "C", 1);
        graph.addEdge("B", "C", 2);

//        System.out.println(graph.getShortestPath("A", "C"));
//        System.out.println(graph.hasCycle());

        graph.print();
        WeightedGraph tree = graph.getMinimumSpanningTree();
        tree.print();
    }
}
