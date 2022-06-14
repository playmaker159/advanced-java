/* Read at own Risk! */
/* By Adithya Pai B */



/* 
Using the String( ) we can create a string object with following ways :

*******************************************************************************************
1) using byte[]

Eg:
    byte[] b= {65,66,67}
    String str = new String(b);

*******************************************************************************************
2) using char[]

Eg:
    char[] c= {'a','b','c'};
    String str = new String(c);

*******************************************************************************************
3) using StringBuffer

Eg:
    StringBuffer sb = new StringBuffer("abc");
    String str = new String(sb);

*******************************************************************************************
4) using StringBuilder

Eg:
    StringBuilder sb = new StringBuilder("abc");
    String str = new String(sb);

*******************************************************************************************
5) using String

Eg:
    String str = new String("abc");
    or
    String str = "abc";
    String s2 = new String(str);

*******************************************************************************************

6) using int[]

Eg:
    int[] a = {65,66,67};
    String str = new String(a,0,3);

*******************************************************************************************

*/











class mod3{


    /* using String function with byte */
    public static void stringWithBytes (){
        byte[] b = {65, 66, 67, 68, 69};
        String s = new String(b);
        System.out.println(s); // ABCDE
    }


    /* using String function with char */
    public static void stringWithChars (){
        char[] c = {'A', 'D', 'I','T', 'H'};
        String s = new String(c);
        System.out.println(s); // ADITH

        int startIndex = 0;
        int numberOfCharecters = 3;
        String s2 = new String(c, startIndex, numberOfCharecters);
        System.out.println(s2); // ADI
    }

    /* String as String  */
    public static void stringAsString (){
        String s = "ABCDE";
        String s2 = new String(s);
        System.out.println(s2); // ABCDE
    }

    /* String as StringBuffer */
    public static void stringAsStringBuffer (){
        StringBuffer sb = new StringBuffer("Hello");
        String s = new String(sb);
        System.out.println(s); // Hello
    }

    /* String as StringBuilder */
    public static void stringAsStringBuilder (){
        StringBuilder sb = new StringBuilder("World");
        String s = new String(sb);
        System.out.println(s); // Hello
    }

    /* String as int[] */
    public static void stringAsIntArray (){
        int[] i = {65, 66, 67, 68, 69};
        String s = new String(i,0,3);
        System.out.println(s); // ABC
    }


/* String Operations 
1) length()                 returns int
2) concat() and +           returns String
3) equals()                 returns boolean
4) compareTo()              returns int
5) compareToIgnoreCase()    returns int
6) indexOf()                returns int
7) lastIndexOf()            returns int
8) charAt()                 returns char    
9) getChars()               returns void
10) getBytes()              returns byte[]
11) toCharArray()           returns char[]
12) regionMatches()         returns boolean
13) startsWith()            returns boolean
14) endsWith()              returns boolean
15) substring()              returns String
16) toLowerCase()           returns String
17) toUpperCase()           returns String
18) trim()                  returns String

*/

    /* 1 Finding the length of string */
    public static void findTheLengthOfString (){
        String s = "India";
        int length = s.length();
        System.out.println(length); // 5
    }

    /* concatinating 2 strings  */
    public static void concatinatingTwoStrings (){

        /* using concat */
        String s1 = "Jai ";
        String s2 = "Hind";
        String s3 = s1.concat(s2);
        System.out.println(s3); // Jai Hind

        /* using + */
        String good = "Good ";
        String morning = "Morning";
        String s4 = good + morning;
        System.out.println(s4); // Good Morning
    }

    /* String Concatenation with Other Data Types */
    public static void stringConcatenationWithOtherDataTypes (){
        String s1 = "Hello ";
        int i = 10;
        double d = 10.5;
        String s2 = s1.concat(i + " " + d);
        System.out.println(s2); // Hello 10 10.5
    }

    /* Type converstions to string */
    public static void typeConversionsToString (){
      
        /* Java converts data into its string representation during concatenation by calling the function valueOf() which returns 
        the string value of the sent obj  */

        int i = 10;
        String s1 = "Hello ";
        char c = 'A';
        System.out.println(String.valueOf(i)); // 10
        System.out.println(String.valueOf(s1)); // Hello
        System.out.println(String.valueOf(c)); // A
    }


    /* Convert From Int to String  */
    public static void convertFromIntToString (){
        Integer i = 69; // Integer is a wrapper class for int
        System.out.println(i.toString()); // 69
    }



    /* charAt */

    public static void charat (){
        String s = "Hello";
        char c = s.charAt(0);
        System.out.println(c); // H

        /* or */


        System.out.println("ADI".charAt(2)); // I
    }


    /* getChars: spilts the string into charecters with params */

    public static void getChars (){
        String s = "India";
        char[] c = new char[s.length()];
        /* s.getChars(int startIndex, int lengthOfString, char[] charecterObject, int Target ) */
        s.getChars(0, s.length(), c, 0);
        System.out.println(c); // I n d i a
        s.getChars(1, s.length(), c, 1);
        System.out.println(c); // n d i a
    }

    /* getBytes( ): Splits the string into bytes */

    public static void getBytes (){
        String s = "India";
        byte[] b = new byte[s.length()];
        s.getBytes(0, s.length(), b, 0);
        System.out.println(b); // [73, 110, 105, 100, 97]
    }

    /* toCharArray(): splits the string into charecter array */


    public static void toCharArray (){
        String s = "India";
        char[] c = s.toCharArray();
        System.out.println(c); // [I, n, d, i, a]
    }



/*  String Comparison: */


    /* equals():  returns true or false */
    public static void equals (){
        String s1 = "India";
        String s2 = "India";
        boolean b = s1.equals(s2);
        System.out.println(b); // true
    }

    /* compareTo(): returns 0, -1, 1 */
    public static void compareTo (){
        String s1 = "India";
        String s2 = "India";
        int i = s1.compareTo(s2);
        System.out.println(i); // 0
        String s3 = "China";
        int j = s1.compareTo(s3);
        System.out.println(j); // -1
    }

/* regionMatches( ): compares a region */
 
    public static void regionMatches (){
        String s1 = "ABCD";
        String s2 = "ABCDE";
        /* indexOfS1 , Strings2, indexOfS2, numberofCharecters */
        boolean b = s1.regionMatches(0, s2, 0, 3);
        System.out.println(b); //  true  (ABC == ABC)
        b = s1.regionMatches(0, s2, 0, 5);
        System.out.println(b); // false (ABCD != ABCDE)
    }


    /* Starts with */

    public static void startswith (){
        String s1 = "ABCD";
        String s2 = "ABCDE";
        boolean b = s1.startsWith("ABC");
        System.out.println(b); // true
        b = s1.startsWith("KI");
        System.out.println(b); // false

        /* or */

        System.out.println("India".startsWith("In")); // true   
        System.out.println("India".startsWith("ZP")); // False
    }

    /* ends with */

    public static void endswith (){
        String s1 = "ABCD";
        String s2 = "ABCDE";
        boolean b = s1.endsWith("D");
        System.out.println(b); // true
        b = s1.endsWith("Z");
        System.out.println(b); // false

        /* or */

        System.out.println("India".endsWith("ia")); // true   
        System.out.println("India".endsWith("ZP")); // False
    }



/* equals and === */
 
    public static void equalsAndStrictEquals (){
        String s1 = "India";
        String s2 = "India";
        boolean b = s1.equals(s2);
        System.out.println(b); // true
        b = s1 == "China";
        System.out.println(b); // False
    }


    /* indexOf */

    public static void indexOf (){
        String s1 = "India";
        int i = s1.indexOf("i");
        System.out.println(i); // 1
        i = s1.indexOf("i", 2);
        System.out.println(i); // 3
        i = s1.indexOf("i", 4);
        System.out.println(i); // -1

        /* lastIndexof */

        i = s1.lastIndexOf("i");
        System.out.println(i); // 3
        i = s1.lastIndexOf("i", 2);
        System.out.println(i); // 1
        i = s1.lastIndexOf("i", 4);
        System.out.println(i); // 3


    }

    /* substring */

    public static void substring (){
        String s1 = "India";
        String s2 = s1.substring(0, 3);
        System.out.println(s2); // Ind
        s2 = s1.substring(3);
        System.out.println(s2); // ia
    }

    /* replace */

    public static void replace (){
        String s1 = "India";
        String s2 = s1.replace('i', 'I');
        System.out.println(s2); // IndIa
    }


    /* trim */

    public static void trim (){
        String s1 = "         India         ";
        System.out.println(s1); //         India 
        System.out.println(s1.trim()); //India
    }





    public static void main(String[] args){
        String s = new String("Hello");  // s is a reference to a String object 
       /* System.out.println(s);
         stringWithBytes();
        stringWithChars();
        stringAsString();
        stringAsStringBuffer();
        stringAsStringBuilder();
        stringAsIntArray();
        findTheLengthOfString(); */
        startswith();



    }

   
}