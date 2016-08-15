
public class PlaysWithArrays {

		public static void print2darray(int[][] array){
			
			String[] linelist = new String[array[0].length];
			for (int i = 0; i < linelist.length; i++){	
				linelist[i] = "";
				for(int x = 0; x < array.length; x++){
					linelist[i] += array[x][i];
				}
				System.out.println(linelist[i]);
			}}
		public static void fillarray(int val, int[][] array){
			for (int y= 0; y<array[0].length; y++){
				//fills the array with consecutive values
				
				for(int x = 0; x < array.length; x++){
					array[x][y] = val;
					val++; 
				}
				
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr_list = new int[3][3];
		String[] linelist = new String[arr_list[0].length];
		for (int i = 0; i<linelist.length;i++){
			linelist[i] = "";
		}
		//arr_list[0][0] = 7;
		System.out.println("arr list 00 =" + arr_list[0][0]);
		System.out.println("arrlistlength" + arr_list.length);
		System.out.println("arrlistlength0" + arr_list[0].length);
		System.out.println("linelistlength" + linelist.length);
		

		
		
		int val = 1;
		for (int y= 0; y<arr_list[0].length; y++){
			//fills the array with consecutive values
			
			for(int x = 0; x < arr_list.length; x++){
				arr_list[x][y] = val;
				val++; 
			}
			
		}
		
		print2darray(arr_list);
		
		
		
		
//		for (int i = 0; i < linelist.length; i++)
//		{
//			for(int x = 0; x < arr_list.length; x++){
//				linelist[i] += arr_list[x][i];
//				
//			}
//			System.out.println(linelist[i]);
			
			//stuff
			
//		}
		//main for loop end
			
			
		}//main end
		
		
	}


