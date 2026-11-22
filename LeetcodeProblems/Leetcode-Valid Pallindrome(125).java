

class Pallindrome{
    public static boolean isPallindrome(String s){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }else{
               char leftChar=s.charAt(left);
               char rightChar=s.charAt(right);

               leftChar=Character.toLowerCase(leftChar);
               rightChar=Character.toLowerCase(rightChar);


              if(leftChar!=rightChar){
                  return false;
              }
            left++;
            right--;
            }
            
        }
        return true;
    }
    public static void main(String[] args){

        String s="abb";
        boolean result=isPallindrome(s);
        System.out.println("Pallindrome:"+result);
    }
}
       