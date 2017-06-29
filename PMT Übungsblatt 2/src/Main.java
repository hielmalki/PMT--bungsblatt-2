
public class Main {
	public static int mult(int a, int b){
		int result = a * b;
		return result;
	}
	
	public static int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	public static boolean compareTo (String str1, String str2){
		if(str1.equals(str2)){
			return true;
		} else {
			return false;
		}
	}
	
	public static String subString(int a, int b){
		String str = "Cogito ergo sum";
		final String STR_CONST = "ergo";
		String strErgo = str.substring(7, 11);
		return strErgo;
	}
}
