package questoin2;

public class Q12_6511269 {
	public static String withTwiceChar(String str, char more){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
        	if (str.charAt(i) == more) {
        		result += str.substring(i,i+1) + str.substring(i,i+1);
        	} else {
        		result += str.substring(i,i+1);
        	}
        }
        return result;
    }
	public static void main(String[] args) { 
		String test1 = "hello there!";
		String test2 = "**Another** **Example!**"; 
		System.out.println(withTwiceChar(test1,'e')); //hello theeree!
		System.out.println(withTwiceChar(test1,'l')); //hellllo there! 
		System.out.println(withTwiceChar(test2,'e')); //**Anotheer** **Examplee!** 
		System.out.println(withTwiceChar(test2,' ')); //**Anotheer** **Examplee!**
  }
}
