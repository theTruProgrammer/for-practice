package java;

public class main {
    public static void main(String[] args) {
        int moneyInWallet = 25;
        String grocerylist = ("Sugar, tea, salt, rice, bhendi, milk, tomato");
        String[] arrgrocerylist = grocerylist.split(", ");
        System.out.println(arrgrocerylist.length);

        if (moneyInWallet > 150) {
            System.out.println("buy first 3 items");
        } else if (moneyInWallet > 100) {
            System.out.println("buy 5 items");
        } else if (moneyInWallet > 150) {
            System.out.println("buy all items");
        } else if (moneyInWallet == 0) {
            System.out.println("cannot buy anything");
        }
    }
}
