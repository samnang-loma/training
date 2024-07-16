package abstr;

abstract class Bank{
    abstract void transferAmount();

    void checkBank(){
        System.out.println("The displayed amount");
    }
}

class ABABank extends Bank{
    @Override
    void transferAmount() {
        System.out.println("The method transfers the amount from ABA bank");
    }

    @Override
    void checkBank() {
        System.out.println("The check balance from ABA bank");
    }
}
public class Main {
    public static void main(String[] args) {
        ABABank abaBank = new ABABank();
        abaBank.transferAmount();
        abaBank.checkBank();
    }
}
