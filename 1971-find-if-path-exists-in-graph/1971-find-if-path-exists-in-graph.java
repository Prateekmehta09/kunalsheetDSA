class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination) return true;
        return bfs(edges,source,destination,n);
    }
      
    static boolean bfs(int edges[][],int source,int                                                             destination,int n){
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int visited[]= new int[n];
        for(int i=0;i<n;i++) adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q= new ArrayDeque<>();
        q.add(source);
        visited[source]=1;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int v:adj.get(curr)){
                if(visited[v]==1) continue;
                if(v==destination) return true;
                q.add(v);
                visited[v]=1;
            }
        }
        return false;   
    
}
}