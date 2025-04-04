public class StringManipulation2 {
    public static void main(String[] args) {
        // substring()
        String phrase = "Programming in Java";
        String word1 = phrase.substring(5);
        String word2 = phrase.substring(0,11);
        
        System.out.println("Word 1 is : " + word1);
        System.out.println("Word 2 is : " + word2);

        // replace() 
        String phrase2 = "The quick brown fox";
        String newPhrase2 = phrase2.replace('o','a');
        System.out.println("Orginal Phrase : " + phrase2);
        System.out.println("New Phrase : " + newPhrase2);
        
    }   

}
