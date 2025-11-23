// Count Vowels and Consonants: Input: 'hello' | Output: Vowels: 2, Consonants: 3
    
public class VowelsAndConsonants {
    public static void main(String[] args) throws Exception {
    String str="hello";
    int vowels=0;
    int consonants =0;
    for(int i=0;i<str.length();i++){
        char ch=str.toLowerCase().charAt(i);
        if( ch == 'a'| ch=='e'| ch=='i'| ch=='o'| ch=='u')
        vowels++;
        else
        consonants++;
    }
    System.out.println("vowels:"+vowels); 
    System.out.println("consonants:"+ consonants);
    }
}