package dynamicprogramming;

public class LongestCommonSubstring {

	
	private static void LCS() {
		String[] str1="kabcdaf".split("");
		String[] str2="nacbdcf".split("");
		int[][] arr=new int[str1.length+1][str2.length+1];
		int counter=0;

		
		
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if(i==0 || j==0) {
					arr[i][j]=0;
					continue;
				}
				if(str1[i-1].equals(str2[j-1])){
					arr[i][j]=arr[i-1][j-1]+1;
					System.out.println(arr[i][j] +"-"+ str1[i]+" - "+str2[j]);
					counter++;
					System.out.println("counter1 : "+counter);
				}else {
					arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
				}
			}
		}
		System.out.println("counter : "+counter);
	}
	

	
	
	
	
	public static void main(String[] args) {
			LCS();
	}
}
