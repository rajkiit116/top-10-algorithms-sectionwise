package stringarray;

public class StringReverseWithoutSpecialCharacter {

	/*Input:   str = "Ab,c,de!$"
	Output:  str = "ed,c,bA!$"*/
	
	public static void main(String[] args) {
	
		String[] str="Ab,c,de!$".split("");
		int l=0;
		int r=str.length-1;
		while(l<r) {
			if(isSpecialCharacter(str[l])) {
				l++;
			}else if(isSpecialCharacter(str[r])) {
				r--;
			}else {
				String temp=str[l];
				str[l]=str[r];
				str[r]=temp;
				l++;r--;
			}
		}
		for (String string : str) {
			System.out.print(string);
		}
	}
	private static boolean isSpecialCharacter(String string) {
		return string.matches("[,!$@#%^&*-+]")? true :false;
	}
}
