public class StringManipulation {

    public static void main(String[] args) {

        String str = "The rains have started here";
        String str1 = "The Rains have started here";

        System.out.println(str.length());

        System.out.println(str.charAt(5)); // charcter at index 5

        System.out.println(str.indexOf('a')); // first occurence of char 'a'

        System.out.println(str.indexOf('e', str.indexOf('e') + 1)); // second occurence of char 'e'

        System.out.println(str.lastIndexOf('e'));

        System.out.println(str.indexOf("have"));

        System.out.println(str.indexOf("hello"));

        System.out.println(str.equals(str1));

        // Comparison
        System.out.println(str.equalsIgnoreCase(str1));

        // Substring
        System.out.println(str.substring(0, 9));

        // trim
        String s = "    Hello world    ";
        System.out.println(s.trim());

        System.out.println(s.replace(" ", "")); // removing splaces using replace

        // example
        String date = "19-07-1999";
        System.out.println(date.replace('-', '/'));

        // Split method
        String data = "Hello_world_java";
        String value[] = data.split("_");
        for (String values : value) {
            System.out.println(values);
        }

        // StringBuffer
        StringBuffer sb = new StringBuffer("Helloworld");
        System.out.println(sb.reverse());

        // concat
        String ss = "name";
        System.out.println(ss.concat("s")); // adding char to the end but in the string format

        String a = "Hello";
        String b = "World";
        int c = 34;
        int d = 96;
        System.out.println(a + b); // String+String
        System.out.println(a + b + c + d); // String+Numbers
        System.out.println(c + d + a + b); // numbers(sum) + to the string
        System.out.println(a + b + (c + d)); // sum and stringadded
        System.out.println(a + d + b + c);

    }
}