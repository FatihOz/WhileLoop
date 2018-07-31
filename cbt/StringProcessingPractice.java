package cbt;

public class StringProcessingPractice {
 public static void main(String[] args) {
	 String Word = "My older aunt's name is Nesrin";
	 int position = Word.indexOf("Nesrin");
	 System.out.println(Word);
	 System.out.println("012345678901234567890123456789");
	System.out.println("The word \"Nesrin\" start at index " + position);
	Word = Word.substring(0, position) + "Nuran";
	Word = Word.toUpperCase();
	System.out.println(Word);
	
} 
}