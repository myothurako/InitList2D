/*
 * Activity 3.3.1
 */
public class InitList2D
{
  public static void main(String[] args)
  {
    String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}  }; 

    for (int i = 0; i < 4; i++)
    {
            for (int j = 0; j < 2; j++)
            {
                     System.out.println(board[i][j]);
            }
    }

    System.out.println();
    for (int i = 0; i < board[0].length; i++)
    {
        for (int j = 0; j < board.length; j++)
        {
            System.out.println(board[j][i]);
        }
    }
  }  
}
