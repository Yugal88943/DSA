// Cycle Detection in Directed Graph (DFS Method)
import java.util.ArrayList;
import java.util.List;

public class DirectedGraphCycleDetection {
    private int vertices;
    private List<List<Integer>> adjList;

    public DirectedGraphCycleDetection(int v){
        vertices = v;
        adjList = new ArrayList<>();
        for(int i=0; i<v; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination){
        adjList.get(source).add(destination);        
    }

    private boolean isCyclicUtil(int node, boolean[] visited, boolean[] recStack){
        if (recStack[node]) 
            return true;
        if (visited[node]) 
            return false;
        visited[node] = true;
        recStack[node] = true;
        for(int neighbor: adjList.get(node)){
            if (isCyclicUtil(neighbor, visited, recStack)) 
                return true;
        }    
        recStack[node] = false;
        return false;
    }

    public boolean isCyclic(){
        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];
        for(int i=0; i<vertices; i++){
            if (isCyclicUtil(i, visited, recStack)) 
                return true;
        }
        return false;
    }

    // Driver Code
    public static void main(String[] args) {
        DirectedGraphCycleDetection graph = new DirectedGraphCycleDetection(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1); // Creates a Cycle

        if (graph.isCyclic()) 
            System.out.println("Cycle Detected in Directed Graph.");
        else
            System.out.println("No Cycle in Directed Graph.");    
        
    }
}
