package com.vaadin.test;

public class ReverseWords {

    public static void main(String[] args) {
        char[] str = "Java is nice!".toCharArray();
        char[] goal = "nice! is Java".toCharArray();

        System.out.println("Original: '" + new String(str) + "'");

        reverse(str);

        boolean success = new String(str).equals(new String(goal));
        System.out.println("Reversed: '" + new String(str) + "'\n\nReverse "
                + (success ? "succeeded." : "failed!"));
    }

    private static void reverse(char[] s) {
    	String sentence = new String(s);
    	String[] word = sentence.split(" ");
    	
    	reorder(word, word.length-1, s, 0);

    }

	private static void reorder(String[] word, int i, char[] s, int pos) {
		if(i < 0) {
			return;			
		}
		System.arraycopy(word[i].toCharArray(), 0, s, pos, word[i].length());
		if (i > 0) {
			s[pos + word[i].length()] = ' ';
		}
		reorder(word, --i,s, pos + word[i+1].length()+1);
	}
}