package package2;

public class Reverseeachcharacterinastring 
{

	public static void main(String[] args)
	{
	
	{
    String str = "Java Programming";
   
    String[] s = str.split(" ");//java
    // programming
    String revString = "";
    
    for(int i = 0; i < s.length; i++) {
        String word = s[i];
        String revWord = "";
        System.out.println(word);

        for(int j = word.length() - 1; j >= 0; j--) {
             revWord = revWord + word.charAt(j);
             
        }
        revString = revString + revWord + " "; 
        
        
        
}

    System.out.println(revString);
}
	}
	}

	
		