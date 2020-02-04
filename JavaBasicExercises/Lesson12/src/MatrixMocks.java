
public class MatrixMocks {
	
	int[][] checkAscending = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	int[][] checkFirstCellNotAscending = {{9, 2}, {4, 5},	{7, 8}};
	int[][] checkLastColFirstRowNotAscending = {{1, 2, 3, 0}, {4, 5, 6, 7}, {8, 9, 10, 11}};
	int[][] checkLastColSecondRowNotAscending = {{1, 2, 3, 4, 5}, {1, 7, 8, 9, 10}};
	int[][] checkSecondRowNotAscending = {{1, 2, 3, 4}, {5, 0, 7, 8}, {9, 10, 11, 12}};
	int[][] checkLastRowFirstColNotAscending = {{1, 2, 3}, {4, 5, 6}, {5, 8, 9}};
	int[][] checkLastColLastRowNotAscending = {{1, 2}, {4, 5}, {7, 8}, {10, 6}};
	int[][] checkAllCellsSame = {{2, 2}, {2, 2}, {2, 2}};
}