package lazyalgorithm;

public class Edge implements Comparable<Edge> {

    private double weight;
    private Vertex start;
    private Vertex target;

    public Edge(Vertex start, Vertex target, double weight) {
        this.weight = weight;
        this.start = start;
        this.target = target;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }

    @Override
    public int compareTo(Edge o) {
        return Double.compare(this.weight, o.getWeight());
    }

    @Override
    public String toString() {
        return start + " -----"+weight+"-------> " + target;
    }
}
