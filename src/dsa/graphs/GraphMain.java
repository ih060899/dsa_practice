package dsa.graphs;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "D");
//        graph.addEdge("D", "C");
//        graph.addEdge("A", "C");
//        graph.removeEdge("A", "C");
//        graph.removeNode("A");
//        graph.removeNode("B");
//        graph.print();

//        graph.traverseDepthFirstRec("G");

//        graph.traverseDepthFirst("A");

//        graph.traverseBreathFirst("A");

//        graph.addNode("X");
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("P");
//        graph.addEdge("X", "A");
//        graph.addEdge("X", "B");
//        graph.addEdge("A", "P");
//        graph.addEdge("B", "P");
//        System.out.println(graph.topologicalSort());

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        System.out.println(graph.hasCycle());
    }
}
