package dsa.strings;

/*
================================================================================
JAVA STRINGS - COMPLETE MASTER FILE
================================================================================

This single program demonstrates:
1. String creation
2. String pool vs heap
3. String immutability
4. String methods
5. StringBuilder
6. StringBuffer
7. String formatting
8. Regex
9. ASCII / Unicode
10. Searching
11. Splitting
12. Replacing
13. Comparison
14. Performance
15. Conversions
16. Character operations
17. Escape sequences
18. Advanced utilities

Compile:
javac StringMastery.java

Run:
java StringMastery
================================================================================
*/

import java.util.*;
import java.util.regex.*;

public class StringMastery {

    public static void main(String[] args) {

        System.out.println("============== STRING CREATION ==============");

        // String Literal (stored in String Pool)
        String s1 = "Hello";

        // Object creation (stored in heap)
        String s2 = new String("Hello");

        // Another literal
        String s3 = "Hello";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // == compares memory references
        System.out.println("s1 == s2 : " + (s1 == s2));

        // equals() compares actual content
        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        // s1 and s3 point to same pooled object
        System.out.println("s1 == s3 : " + (s1 == s3));



        System.out.println("\n============== IMMUTABILITY ==============");

        String immutable = "Java";

        immutable.concat(" Programming");

        // Original string unchanged
        System.out.println(immutable);

        // Must store returned value
        immutable = immutable.concat(" Programming");

        System.out.println(immutable);



        System.out.println("\n============== STRING METHODS ==============");

        String text = "  Java Programming Language  ";

        // length()
        System.out.println("Length: " + text.length());

        // trim()
        System.out.println("Trimmed: '" + text.trim() + "'");

        // toUpperCase()
        System.out.println(text.toUpperCase());

        // toLowerCase()
        System.out.println(text.toLowerCase());

        // charAt()
        System.out.println("Character at index 5: " + text.charAt(5));

        // substring(begin)
        System.out.println("Substring from 5: " + text.substring(5));

        // substring(begin, end)
        System.out.println("Substring(2,8): " + text.substring(2, 8));

        // contains()
        System.out.println(text.contains("Programming"));

        // startsWith()
        System.out.println(text.startsWith("  Ja"));

        // endsWith()
        System.out.println(text.endsWith("  "));

        // isEmpty()
        System.out.println("Empty? " + text.isEmpty());

        // repeat()
        System.out.println("Hi ".repeat(3));



        System.out.println("\n============== SEARCHING ==============");

        String searchText = "banana";

        // indexOf()
        System.out.println(searchText.indexOf('a'));

        // lastIndexOf()
        System.out.println(searchText.lastIndexOf('a'));

        // indexOf with starting index
        System.out.println(searchText.indexOf('a', 2));



        System.out.println("\n============== COMPARISON ==============");

        String a = "apple";
        String b = "APPLE";

        // equals()
        System.out.println(a.equals(b));

        // equalsIgnoreCase()
        System.out.println(a.equalsIgnoreCase(b));

        // compareTo()
        System.out.println(a.compareTo(b));

        // compareToIgnoreCase()
        System.out.println(a.compareToIgnoreCase(b));



        System.out.println("\n============== REPLACING ==============");

        String replaceText = "I like Java";

        // replace()
        System.out.println(replaceText.replace("Java", "Python"));

        // replaceAll() -> REGEX
        System.out.println(replaceText.replaceAll("[aeiou]", "*"));

        // replaceFirst()
        System.out.println("one two one".replaceFirst("one", "ONE"));



        System.out.println("\n============== SPLITTING ==============");

        String csv = "apple,banana,grape,mango";

        // split()
        String[] fruits = csv.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }



        System.out.println("\n============== JOINING ==============");

        String joined = String.join(" - ", fruits);

        System.out.println(joined);



        System.out.println("\n============== STRING TO OTHER TYPES ==============");

        String number = "100";

        // String -> int
        int num = Integer.parseInt(number);

        System.out.println(num + 50);

        // int -> String
        String numString = String.valueOf(999);

        System.out.println(numString);



        System.out.println("\n============== CHARACTER ARRAY ==============");

        String charsText = "HELLO";

        // toCharArray()
        char[] chars = charsText.toCharArray();

        for (char c : chars) {
            System.out.println(c);
        }



        System.out.println("\n============== ASCII / UNICODE ==============");

        char letter = 'A';

        int ascii = (int) letter;

        System.out.println("ASCII of A = " + ascii);

        // Unicode character
        char heart = '\u2665';

        System.out.println("Unicode Heart: " + heart);



        System.out.println("\n============== ESCAPE SEQUENCES ==============");

        System.out.println("Hello\nWorld");
        System.out.println("Tab\tSpace");
        System.out.println("Double Quote -> \"Java\"");
        System.out.println("Backslash -> \\");



        System.out.println("\n============== STRINGBUILDER ==============");

        // Mutable string
        StringBuilder sb = new StringBuilder("Java");

        // append()
        sb.append(" Programming");

        System.out.println(sb);

        // insert()
        sb.insert(5, "Amazing ");

        System.out.println(sb);

        // replace()
        sb.replace(5, 12, "Super");

        System.out.println(sb);

        // delete()
        sb.delete(5, 11);

        System.out.println(sb);

        // reverse()
        sb.reverse();

        System.out.println(sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // length()
        System.out.println("Length: " + sb.length());



        System.out.println("\n============== STRINGBUFFER ==============");

        // Thread-safe mutable string
        StringBuffer buffer = new StringBuffer("Hello");

        buffer.append(" World");

        System.out.println(buffer);



        System.out.println("\n============== REGEX ==============");

        String regexText = "My phone number is 9876543210";

        // Find 10-digit number
        Pattern pattern = Pattern.compile("\\d{10}");

        Matcher matcher = pattern.matcher(regexText);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }



        System.out.println("\n============== STRING FORMATTING ==============");

        String formatted = String.format(
                "Name: %s | Age: %d | Salary: %.2f",
                "John",
                25,
                55000.456
        );

        System.out.println(formatted);



        System.out.println("\n============== NULL VS EMPTY VS BLANK ==============");

        String empty = "";
        String blank = "   ";
        String nullString = null;

        System.out.println(empty.isEmpty());

        // isBlank() -> Java 11+
        System.out.println(blank.isBlank());

        System.out.println(nullString == null);



        System.out.println("\n============== ADVANCED METHODS ==============");

        String advanced = "java";

        // lines() -> Java 11+
        String multiLine = "One\nTwo\nThree";

        multiLine.lines().forEach(System.out::println);

        // indent() -> Java 12+
        System.out.println(advanced.indent(5));

        // strip()
        System.out.println("   Java   ".strip());

        // stripLeading()
        System.out.println("   Java".stripLeading());

        // stripTrailing()
        System.out.println("Java   ".stripTrailing());



        System.out.println("\n============== PALINDROME CHECK ==============");

        String palindrome = "madam";

        String reversed = new StringBuilder(palindrome)
                .reverse()
                .toString();

        if (palindrome.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }



        System.out.println("\n============== ANAGRAM CHECK ==============");

        String word1 = "listen";
        String word2 = "silent";

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));



        System.out.println("\n============== STRING PERFORMANCE TEST ==============");

        long start1 = System.currentTimeMillis();

        String slow = "";

        for (int i = 0; i < 10000; i++) {
            slow += i;
        }

        long end1 = System.currentTimeMillis();

        System.out.println("String Time: " + (end1 - start1) + " ms");



        long start2 = System.currentTimeMillis();

        StringBuilder fast = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            fast.append(i);
        }

        long end2 = System.currentTimeMillis();

        System.out.println("StringBuilder Time: " + (end2 - start2) + " ms");



        System.out.println("\n============== INTERN METHOD ==============");

        String heapString = new String("Java");

        // intern() moves/refers to pool object
        String pooled = heapString.intern();

        System.out.println(pooled == "Java");



        System.out.println("\n============== STRING TOKENIZER ==============");

        StringTokenizer tokenizer =
                new StringTokenizer("Java Python C++ JavaScript");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }



        System.out.println("\n============== FREQUENCY COUNTER ==============");

        String freqText = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : freqText.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);



        System.out.println("\n============== STRING REVERSAL ==============");

        String original = "Developer";

        StringBuilder reverse = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {

            reverse.append(original.charAt(i));
        }

        System.out.println(reverse);



        System.out.println("\n============== REMOVE DUPLICATES ==============");

        String duplicate = "programming";

        Set<Character> set = new LinkedHashSet<>();

        for (char c : duplicate.toCharArray()) {
            set.add(c);
        }

        for (char c : set) {
            System.out.print(c);
        }

        System.out.println();



        System.out.println("\n============== WORD COUNT ==============");

        String sentence =
                "Java is powerful and widely used";

        String[] words = sentence.split("\\s+");

        System.out.println("Words: " + words.length);



        System.out.println("\n============== FINAL NOTES ==============");

        System.out.println("""
KEY TAKEAWAYS:

1. String is IMMUTABLE
2. StringBuilder is FAST and MUTABLE
3. StringBuffer is THREAD SAFE
4. equals() compares values
5. == compares references
6. replaceAll() uses REGEX
7. String Pool optimizes memory
8. substring() creates new strings
9. Regex is extremely powerful
10. String manipulation is core to Java interviews

""");
    }
}
