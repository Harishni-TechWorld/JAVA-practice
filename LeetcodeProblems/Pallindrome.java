package harsh1;

public class Pallindrome {
	    public static boolean isPalindrome(int x) {
	        int original=x;
	        int reverse=0;
	        while(x>0){
	            int LastDigit=x % 10;
	            x=x/10;
	            reverse=reverse*10+LastDigit;
	        }
	        return original==reverse;   
	    }
	     public static void main(String[] args){
	        int x=-121;
	        boolean result=isPalindrome(x);
	        System.out.println("Output:"+result);
	    }
	}



