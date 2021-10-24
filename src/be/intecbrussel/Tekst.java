package be.intecbrussel;

import java.util.Locale;

public class Tekst {
    public static void main(String[] args) {

        String mesace="       I am today so angry";
        System.out.println(mesace);
        System.out.println(mesace.replace("a","s"));
        System.out.println(mesace.toUpperCase(Locale.ROOT));
        System.out.println("numberofcharacters:"+mesace.length());
        System.out.println("eleventhcharter:"+mesace.charAt(11));
        System.out.println(mesace.concat(". unfortunately!"));
       char [ ] chars = new char[11];
       mesace.getChars(2,13,chars,0);
        System.out.println(chars);
        System.out.println(mesace.indexOf("a"));

        System.out.println(mesace.replace(" ","-"));
        System.out.println(mesace.substring(4,9));
for ( String word: mesace.split(" ")){
    System.out.println( word);

    }
        System.out.println(mesace.toUpperCase(Locale.ROOT));
        System.out.println(mesace.toLowerCase(Locale.ROOT));
        System.out.println(mesace.trim());
    }}


