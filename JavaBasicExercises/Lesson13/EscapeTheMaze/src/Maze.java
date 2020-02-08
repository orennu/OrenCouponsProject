
public class Maze {	

	public boolean isMazedSolved(boolean[][] maze) {
		
		return findMazeExit(maze, maze.length - 1, maze[0].length - 1);
	}

	private boolean findMazeExit(boolean[][] maze, int row, int col) {
		
		if (row == 0 && col == 0) {
			System.out.println("[" + row + ", " + col + "]");
			return true;
		}
		
		if (!maze[row][col]) {
			return false;
		}
		
		maze[row][col] = false;
		
		// Check moving left
		if (col > 0) {
			if (findMazeExit(maze, row, col - 1)) {
				System.out.println("[" + row + ", " + col + "]");
				return true;
			}
		}
		
		// Check moving right
		if (col < maze[0].length - 1) {
			if (findMazeExit(maze, row, col + 1)) {
				System.out.println("[" + row + ", " + col + "]");
				return true;
			}
		}
		
		// Check moving up
		if (row > 0) {
			if (findMazeExit(maze, row - 1, col)) {
				System.out.println("[" + row + ", " + col + "]");
				return true;
			}
		}
		
		// Check moving down
		if (row < maze.length - 1) {
			if (findMazeExit(maze, row + 1, col)) {
				System.out.println("[" + row + ", " + col + "]");
				return true;
			}
		}
		
		return false;
	}
}
