package ControlStructuresAndLoops;

public class SwitchExample {
    public static void main(String[] args) {
        char animal = 'c';
            switch (animal) {
                case 'c':
                case 's':
                    System.out.println("domestic animal");
                    break;
                case 'S':
                    System.out.println("wild animal");
                    break;
                default:
                    System.out.println("unknown animal");
                    break;

        }
    }
}
