// Cycle Detection in Undirected Graph (DFS Method)
import java.util.ArrayList;
import java.util.List;

public class UnDirectedGraphCycleDetection {
    private int vertices;
    private List<List<Integer>> adjList;

    public UnDirectedGraphCycleDetection(int v){
        vertices = v;
        adjList = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination){
        // Undirected graph → add both directions
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    private boolean isCyclicUtil(int node, boolean[] visited, int parent){
        visited[node] = true;

        for(int neighbor : adjList.get(node)){
            if(!visited[neighbor]){
                if(isCyclicUtil(neighbor, visited, node))
                    return true;
            }
            else if(neighbor != parent){
                return true; // Cycle found
            }
        }
        return false;
    }

    public boolean isCyclic(){
        boolean[] visited = new boolean[vertices];

        for(int i = 0; i < vertices; i++){
            if(!visited[i]){
                if(isCyclicUtil(i, visited, -1))
                    return true;
            }
        }
        return false;
    }

    // Driver Code
    public static void main(String[] args) {
        UnDirectedGraphCycleDetection graph =
                new UnDirectedGraphCycleDetection(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1); // Creates Cycle

        if(graph.isCyclic())
            System.out.println("Cycle Detected in Undirected Graph.");
        else
            System.out.println("No Cycle in Undirected Graph.");
    }
}
