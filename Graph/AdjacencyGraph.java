import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.List;

class Graph{
    public Map<Integer , List<Integer>> adjlist;

    public Graph(){
        adjlist = new HashMap<>();
    }

    public void addEdge(int u , int v){
        adjlist.putIfAbsent(u, new ArrayList<>());
        adjlist.putIfAbsent(v , new ArrayList<>());
        adjlist.get(u).add(v);
    }

    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start , visited);
    }

    public void dfsHelper(int vertex  , Set<Integer> visited){
        visited.add(vertex);
        System.out.print(vertex + " ");
        for(int child : adjlist.getOrDefault(vertex, new ArrayList<>())){
            if(!visited.contains(child)){
                dfsHelper(child, visited);
            }
        }
    }

    public void bfs(int start){
        Queue<Integer> visited = new LinkedList<>();
        

    }

}
public class AdjacencyGraph{
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);
        g.addEdge(5, 6);
        g.addEdge(6, 1);
        g.addEdge(6, 3);

        System.out.println("DFS traversal : ");
        g.dfs(1);
    }
}