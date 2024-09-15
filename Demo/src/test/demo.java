package test;

public class demo {



public static void main(String[] args) {
String sentence="Test processing is hard!";
int position = sentence.indexOf("hard");
System.out.println(sentence);
System.out.println("012345678901234567890123");
System.out.println("The word\"hard\" starts at index" + position);
sentence= sentence.substring(0,position)+"easy!";
sentence= sentence.toUpperCase();
System.out.println("The Changed string is:");
System.out.println(sentence);
}
}