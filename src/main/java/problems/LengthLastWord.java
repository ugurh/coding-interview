package problems;

public class LengthLastWord {

    public static int lengthOfLastWord(String s) {
        if (s == null || s.trim().equals(""))
            return 0;

        int count=0;
        boolean flag = false;
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))){
                flag=true;
                count=count+1;
            }else{
                if(flag){
                    return count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s ="      ";
        System.out.println(lengthOfLastWord(s));
    }
}
