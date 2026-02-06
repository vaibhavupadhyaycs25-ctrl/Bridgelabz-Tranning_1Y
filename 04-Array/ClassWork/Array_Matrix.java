class Array_Matrix{
	public static void main (String[] Args){
	int arr1[] ={1,2,3,4,5};
	int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
	int row= arr2.length;
	int col= arr2[0].length;
	for(int i=0;i<=row;i++){
		for(int j=0;j<col;j++){
		System.out.print(arr2[i][j] +" ");
				
		}
		System.out.println();
		}
		}
	}