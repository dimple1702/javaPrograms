
public class DiagonalDifference{
	public static void main(String[] args) {
		int arr[][] = new int[][]{{1,2,3},{4,5,6},{9,8,9}};

		int left = 0, right = 0;
		int row = arr.length;
		int col = arr[0].length;

		for(int i = 0, j = col-1; i < col; i++, j--){
			left += arr[i][i];
			right += arr[i][j];			
		}

		System.out.println("Difference of Diagonals: " + Math.abs(left - right));
	}
}