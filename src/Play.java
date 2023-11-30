import java.util.Scanner;

public class Play {


    public void menu() {
        System.out.println("\nWELCOME TO THE SHELOB'S LAIR......\n\n");
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.print("1-Play\n0-Exit\n\nOption:");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                game();
                break;
            case 0:
                System.out.println("BYEEEEEE");
                break;
            default:
                System.out.println("AHN???");
        }

    }

    public void game() {
        Scanner scanner = new Scanner(System.in);
        int option;
        Frodo frodo = new Frodo();
        Shelob shelob = new Shelob();

        System.out.println("\nFrodo was terrified, but he walked boldly toward the eyes, which retreated as he advanced.\n\n");
        do {
            System.out.print("1-Attack\n0-Exit\n\nOption:");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (frodo.getStunRounds() > 0) {
                        System.out.println("Frodo is stunned!");
                        shelob.attack(frodo);
                        frodo.setStunRounds(frodo.getStunRounds() - 1);
                    }
                    if (shelob.getStunRounds() > 0) {
                        System.out.println("Shelob is stunned!");
                        frodo.attack(shelob);
                        shelob.setStunRounds(shelob.getStunRounds() - 1);
                    }
                    if (shelob.getStunRounds() == 0 && frodo.getStunRounds() == 0) {
                        shelob.attack(frodo);
                        frodo.attack(shelob);
                    }
                    break;
                case 0:
                    System.out.println("BYEEEE");
                    break;
            }
            System.out.println("Frodo " + frodo.getHealth());
            System.out.println("Shelob " + shelob.getHealth());

        } while (option != 0 && !frodo.isDead() && !shelob.isDead());
    }

}
