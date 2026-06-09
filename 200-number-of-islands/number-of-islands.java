class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int count=0;
        int[][] vis = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]=='1'&&vis[i][j]==0){ 
               count++;
               BFS(i,j,vis,grid);             }
            }
        }
        return count;
    }
    public static void BFS(int row, int col, int[][]vis, char[][]grid){
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));

        vis[row][col]=1;
        int drow[] = {-1,0,1,0};
        int[]dcol = {0,1,0,-1};

        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;

            q.remove();

            for(int i =0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]=='1'&&vis[nrow][ncol]==0){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }


        }
    }

    
}
class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}