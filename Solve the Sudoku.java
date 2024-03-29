#  >> JAVA CODE <<


class Solution
{
    //Function to find a solved Sudoku. 
    static boolean isValid(int num,int[][] grid, int row,int col)
    {
        for(int i=0;i<9;i++)
            if(grid[row][i]==num) return false;
        
        for(int i=0;i<9;i++)
            if(grid[i][col]==num) return false;
        
        int rr=row-row%3, cc=col-col%3;
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(grid[rr+i][cc+j]==num) return false;
            }
        }
        
        return true;
    }
    static boolean SolveSudoku(int grid[][])
    {
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(grid[i][j]==0)
                {
                    for(int k=1;k<=9;k++)
                    {
                        if(isValid(k,grid,i,j))
                        {
                            grid[i][j]=i;
                            boolean ans=SolveSudoku(grid);
                   
                            if(ans) return true;
                            else grid[i][j]=0;
                        }
                    }
            
                    return false;
                }
            }
        }
        
            return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
                System.out.print(grid[i][j]+" ");
        }
    }
}



#  >> PYTHON CODE <<

class Solution:
    
    #Function to find a solved Sudoku. 
    
    def SolveSudoku(self,grid):
        def isValid(num,grid,row,col):
            for i in range(9):
                if(grid[row][i]==num):
                    return False
            
            for i in range(9):
                if(grid[i][col]==num):
                    return False
            
            rr=row-row%3
            cc=col-col%3
            
            for i in range(3):
                for j in range(3):
                    if(grid[rr+i][cc+j]==num):
                        return False
            
            return True
            
            
        for i in range(9):
            for j in range(9):
                if(grid[i][j]==0):
                    for k in range(1,10):
                        if(isValid(k,grid,i,j)):
                            grid[i][j]=k
                            ans=self.SolveSudoku(grid)
                            if(ans): return True
                            else: grid[i][j]=0
    
                    return False         
        
        return True    
               
    
    #Function to print grids of the Sudoku.    
    def printGrid(self,arr):
        for i in range(9):
            for j in range(9):
                print(arr[i][j],end=" ")
