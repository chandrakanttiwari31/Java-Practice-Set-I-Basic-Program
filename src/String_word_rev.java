
public class String_word_rev {
	
	
	public static void main(String[] args) 
    { 
        String s[] = "i like this program very much".split(" "); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
       System.out.println("Reversed String:");
       System.out.println(ans);
    }

}
