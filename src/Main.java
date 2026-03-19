
public class Main {
    public static void main(String[] args) {

        System.out.println(("STRING METHODS"));

        System.out.println("1.length()");
        //total count//
        String text="positive vibes";
        System.out.println(("lenght "+text.length()));

        System.out.println("2.CharAt(int index)");
        //based on its position//
        System.out.println(text.charAt(1));
        System.out.println(text.charAt(5));

        System.out.println("3.Substring");
        //int start, int end//
        System.out.println(text.substring(1, 6));
        System.out.println(text.substring(2, 5));

        System.out.println("4.toUpperCase() and toLowerCase()");
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String text3=" Trupti Meher ";
        System.out.println(text3.trim());

        String a="I love";
        String b ="Java";
        System.out.println(a.concat(" ").concat(b));

        String[] fruits={"banana","apple","chikoo"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);


    }
}