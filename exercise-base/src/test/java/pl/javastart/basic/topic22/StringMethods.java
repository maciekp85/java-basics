package pl.javastart.basic.topic22;

/**
 * Created by nishi on 2017-03-21.
 */
public class StringMethods {

  public static void main(String[] args) {
    String words = " One two three four five six seven ";
    String sub1 = words.substring( 2, 7 );
    String sub2 = words.replaceAll( "two", "hehe" );
    String sub3 = words.trim();
    char charat = words.charAt( 2 );
    int length = words.length();
    String wordToUpperCase = words.toUpperCase();
    String wordToLowerCase = words.toLowerCase();
    String[] split = words.split( " " );

    System.out.println(words);
    System.out.println("words.substring( 2, 7 )");
    System.out.println(sub1);
    System.out.println("words.replaceAll( \"two\", \"hehe\" )");
    System.out.println(sub2);
    System.out.println("words.trim()");
    System.out.println(sub3);
    System.out.println("words.charAt( 2 )");
    System.out.println(charat);
    System.out.println("words.length()");
    System.out.println(length);
    System.out.println("words.toUpperCase()");
    System.out.println(wordToUpperCase);
    System.out.println("words.toLowerCase()");
    System.out.println(wordToLowerCase);
    System.out.println("words.split( \" \" )");
    System.out.println("split.length = " + split.length);
    System.out.println("split[0]" + split[0]);
    System.out.println("split[1]" + split[1]);
    System.out.println("split[2]" + split[2]);
    System.out.println("split[3]" + split[3]);
    System.out.println("split[4]" + split[4]);
    System.out.println("split[5]" + split[5]);
    System.out.println("split[6]" + split[6]);
    System.out.println("split[7]" + split[7]);
  }
}
