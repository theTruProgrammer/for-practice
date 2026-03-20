
public class Main {
    public static void main(String[] args) {

        System.out.println(("STRING METHODS"));

        System.out.println("1.length()");
        //total count//
        String text = "positive vibes";
        System.out.println(("lenght " + text.length()));

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

        String text3 = " Trupti Meher ";
        System.out.println(text3.trim());

        String a = "I love";
        String b = "Java";
        System.out.println(a.concat(" ").concat(b));

        String[] fruits = {"banana", "apple", "chikoo"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        System.out.println();
        System.out.println("...................Array....................");
        String Colors = "red,blue,black,white,violet,green,yellow,pink,gray";
        String[] arrColors = Colors.split(",");

        System.out.println("...................Family Planning Exp......................");
        String familyMembers = ("abc,vbn");

        //create array of family members
        String[] arrfamilyMembers = familyMembers.split(",");
        System.out.println(arrfamilyMembers.length);

        //if family members length > 2 then "you need a child"
        //else "PLEASE STOP"
        if (arrfamilyMembers.length == 2) {
            System.out.println("need a child");
        } else if (arrfamilyMembers.length == 1) {
            System.out.println("get married");
        } else if (arrfamilyMembers.length == 3) {
            System.out.println("Please Stop");

        } else
            System.out.println("I dont know what to say");
            System.out.println(".......................................................");

            int moneyInWallet = 25;
            String grocerylist = ("Sugar, tea, salt, rice, bhendi, milk, tomato");
            String[] arrgrocerylist = grocerylist.split(",");

            if (moneyInWallet > 50) {
                System.out.println("buy first 3 items");
            } else if (moneyInWallet > 100) {
                System.out.println("buy 5 items");
            } else if (moneyInWallet > 150) {
                System.out.println("buy all items");
            } else if (moneyInWallet == 0) {
                System.out.println("cannot buy anything");
            }}}




