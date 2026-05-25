package day4.assignment;

public class CountVCDS {
    public static void solution(String s) {
        s = s.toLowerCase();
        String vowels = "aeiou";
        String decimals  = "0123456789";
        String specialChars = "!@#$%^&*()";

        int vowelsCount = 0;
        int decimalsCount = 0;
        int consonentsCount = 0;
        int specialCharsCount = 0;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.contains(Character.toString(ch))){
                vowelsCount++;
            }else if(decimals.contains(Character.toString(ch))){
                decimalsCount++;
            }else if(specialChars.contains(Character.toString(ch))){
                specialCharsCount++;
            } else{
                consonentsCount++;
            }
        }
        System.out.println("Count of vowels :" +vowelsCount);
        System.out.println("Count of vowels :" +decimalsCount);
        System.out.println("Count of vowels :" +specialCharsCount);
        System.out.println("Count of vowels :" +consonentsCount);
    }
    public static void main(String[] args){
        String s = "aeioustrng123@#";
        System.out.println(solution(s));
    }
}
