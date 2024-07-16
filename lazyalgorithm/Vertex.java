package lazyalgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private List<Edge> adjacentVertices;

    public Vertex(String name){
        this.name = name;
        this.adjacentVertices = new ArrayList<>();
    }

    public void addEdge(Edge edge){
        adjacentVertices.add(edge);
    }

    public String getName() {
        return name;
    }

    public List<Edge> getAdjacentVertices() {
        return adjacentVertices;
    }

    @Override
    public String toString() {
        return name;
    }
}
