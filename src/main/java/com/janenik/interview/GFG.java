package com.janenik.interview;

/**
 * Created by jane on 8/12/19.
 */
class GFG
{
    static int R = 4;
    static int C = 4;

    // Function to return the count of possible paths
// in a maze[R][C] from (0, 0) to (R-1, C-1) that
// do not pass through any of the marked cells
    static int countPaths(int maze[][])
    {

        // If the initial cell is blocked,
        // there is no way of moving anywhere
        if (maze[0][0] == -1)
            return 0;

        // Initializing the leftmost column
        for (int i = 0; i < R; i++)
        {
            if (maze[i][0] == 0)
                maze[i][0] = 1;

                // If we encounter a blocked cell in leftmost
                // row, there is no way of visiting any cell
                // directly below it.
            else
                break;
        }

        // Similarly initialize the topmost row
        for (int i = 1; i < C; i++)
        {
            if (maze[0][i] == 0)
                maze[0][i] = 1;

                // If we encounter a blocked cell in bottommost
                // row, there is no way of visiting any cell
                // directly below it.
            else
                break;
        }

        // The only difference is that if a cell is -1,
        // simply ignore it else recursively compute
        // count value maze[i][j]
        for (int i = 1; i < R; i++)
        {
            for (int j = 1; j < C; j++)
            {

                // If blockage is found, ignore this cell
                if (maze[i][j] == -1)
                    continue;

                // If we can reach maze[i][j] from
                // maze[i-1][j] then increment count.
                if (maze[i - 1][j] > 0)
                    maze[i][j] = (maze[i][j] +
                            maze[i - 1][j]);

                // If we can reach maze[i][j] from
                // maze[i][j-1] then increment count.
                if (maze[i][j - 1] > 0)
                    maze[i][j] = (maze[i][j] +
                            maze[i][j - 1]);
            }
        }

        // If the final cell is blocked,
        // output 0, otherwise the answer
        return (maze[R - 1][C - 1] > 0) ?
                maze[R - 1][C - 1] : 0;
    }

    // Function to return the count of all possible
// paths from (0, 0) to (n - 1, m - 1)
    static int numberOfPaths(int m, int n)
    {
        // We have to calculate m+n-2 C n-1 here
        // which will be (m+n-2)! / (n-1)! (m-1)!
        int path = 1;
        for (int i = n; i < (m + n - 1); i++)
        {
            path *= i;
            path /= (i - n + 1);
        }
        return path;
    }

    // Function to return the total count of paths
// from (0, 0) to (n - 1, m - 1) that pass
// through at least one of the marked cells
    static int solve(int maze[][])
    {

        // Total count of paths - Total paths that do not
        // pass through any of the marked cell
        int ans = numberOfPaths(R, C) - countPaths(maze);

        // return answer
        return ans;
    }

    // Driver code
    public static void main (String[] args)
    {
        int maze[][] = { { 0, 0, 0, 0 },
                { 0, -1, 0, 0 },
                { -1, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        System.out.println(solve(maze));
    }
}
