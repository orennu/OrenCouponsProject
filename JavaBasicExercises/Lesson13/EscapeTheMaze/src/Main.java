
public class Main {
	public static void main(String[] args) {

		MazeMocks mazeMock = new MazeMocks();
		Maze maze = new Maze();
		
		boolean[][] maze1 = mazeMock.maze1;
		boolean[][] maze2 = mazeMock.maze2;
		boolean[][] maze3 = mazeMock.maze3;

		System.out.println("Solving maze1\n=================");
		System.out.println(maze.isMazedSolved(maze1));
		System.out.println("Solving maze2\n=================");
		System.out.println(maze.isMazedSolved(maze2));
		System.out.println("Solving maze3\n=================");
		System.out.println(maze.isMazedSolved(maze3));
	}
}
