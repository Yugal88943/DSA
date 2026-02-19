import java.util.*;

class UndirectedGraphCycleDetection{
    private int V; // Number of Vertices
    private LinkedList<Integer> adj[]; // Adjacency List

    // Constructor
    UndirectedGraphCycleDetection(int v){
        V = v;
        adj = new LinkedList [v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList<Integer>();
    }

    //  Function to add an edge
    void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v); //Because graph is undirected
    }

    // DFS Function to Detect Cycle
    boolean isCyclicUtil(int v, boolean visited[], int parent){
        visited[v] = true;

        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            int i = it.next();
            // If not visited, recur for the node
            if (!visited[i]) {
                if(isCyclicUtil(i, visited, v))
                    return true;
            }

            // If visited, not parent, then cycle would exist
            else if(i != parent){
                return true;
            }
        }
        return false;
    }

    // Function to check cycle in graph
    boolean isCyclic(){
        boolean visited[] = new boolean[V];
        // Call recursive helper for all vertices
        for(int u=0; u<V; u++){
            if (!visited[u]) 
                if(isCyclicUtil(u, visited, -1))
                    return true;
        }
        return false;
    }

    // Driver Code
    public static void main(String[] args) {
        UndirectedGraphCycleDetection g = new UndirectedGraphCycleDetection(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 1); // This edge creates a cycle

        if (g.isCyclic()) 
            System.out.println("Graph Contains Cycle!");
        else
            System.out.println("Graph does not contain cycle.");
    }
}   

