class Solution {
        public static int islandPerimeter(int[][] arr) {
        if(arr.length == 0) {
			return 0;
		}
		int m = arr.length;
		int n = arr[0].length;
		int count = 0;
		
		for(int i=0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[i][j]==1) {
					if(i ==0 || arr[i-1][j]== 0) {
						count++;
					}
					if(i == m-1 || arr[i+1][j]==0) {
						count++;
					}
					if( j == 0 || arr[i][j-1]==0) {
						count++;
					}
					if(j == n-1 || arr[i][j+1]==0) {
						count++;
					}
				}
			}
		}
		return count;
    }
}

    