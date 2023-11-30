import java.util.Random;

public class Shelob extends Character {

    public Shelob() {
        super("Shelob", 20);
        this.setHealth(20000);
    }

    @Override
    public void attack(Character character) {
            Frodo frodo = (Frodo) character;
            int total;
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            if (randomNumber >= 30) {
                total = paralyzeCalculate(character);
                isParalyzed();
                System.out.println(getName() + " attacks " + frodo.getName() + " for " + total + " damage.");
            } else {
                total = hitCalculate();
                System.out.println(getName() + " attacks " + frodo.getName() + " for " + total + " damage.");
            }
            if (frodo.getMithrilCoat() > 0) {
                frodo.setMithrilCoat(frodo.getMithrilCoat() - total);
                System.out.println("Frodo's mithril coat damaged! " + frodo.getMithrilCoat());
                if (frodo.getMithrilCoat() <= 0) {
                    System.out.println("Frodo's mithril coat destroyed!");
                }
            } else {
                frodo.setHealth(frodo.getHealth() - total);
                System.out.println("Frodo damaged for " + frodo.getHealth());
            }
        }


    @Override
    public boolean isParalyzed() {
        Random random = new Random();
        int randomNumber = random.nextInt(50);
        return randomNumber >= 30;
    }

    public int paralyzeCalculate(Character character) {
        Random random = new Random();
        int stunTime=random.nextInt(3) + 1;
        int totalDamage = random.nextInt(100) * getDamage();
        System.out.println(getName() + " paralyzed Frodo.... dealt " + totalDamage + " damage!");
        System.out.println("Frodo is paralyzed for "+stunTime+" times!");
        character.setStunRounds(stunTime);
        return totalDamage;
    }

    @Override
    public int hitCalculate() {
        return new Random().nextInt(25) * getDamage();
    }
}

