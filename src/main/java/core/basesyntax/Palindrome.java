package core.basesyntax;

public class Palindrome {

    public boolean isPalindrome(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z0-9]", "");
        StringBuilder newText = new StringBuilder(text);
        newText.reverse();
        return newText.toString().equals(text);
    }
}
