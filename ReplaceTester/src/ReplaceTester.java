public class ReplaceTester {

	public static void main(String[] args) {
		String word = "Mississippi";
		System.out.println(word);
		System.out.println("Expect M!$$!$$!pp!");
		word = word.replace("i", "!");
		word = word.replace("s", "$");
		System.out.println(word);
	}
}