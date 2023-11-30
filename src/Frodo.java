import java.util.Random;

public class Frodo extends Character {

    private int mithrilCoat;

    public Frodo() {
        super("Frodo", 10);
        this.mithrilCoat = 5000;
    }

    @Override
    public void attack(Character character) {
        Random random = new Random();
        int damage=(random.nextInt(4) * 100) / 2;
        int randomNumber = random.nextInt(100);
        if (randomNumber >= 90) {
            int stunTime = earendillAttack(character);
            if (damage == 0) {
                System.out.println(getName() + " failled to attack " + character.getName() + ", " + damage + " damage..!");
            } else {
                character.setHealth(character.getHealth() - damage);
                character.setStunRounds(stunTime);
                System.out.println(this.getName() + " stunned " + character.getName() + " for " + character.getStunRounds() + " times!" +
                        " He damaged " + character.getName() + " for " + damage + " damage!");
                System.out.println("It will shine even brighter when night falls around you. May this light " +
                        "illuminate the dark places you go through, when all other lights go out.....");
            }
        } else {
            damage = stingSwordAttack();
            if (damage == 0) {
                System.out.println(getName() + " failled to attack " + character.getName() + ", " + damage + " damage..!");
            } else {
                character.setHealth(character.getHealth() - damage);
                System.out.println(this.getName() + " damaged " + character.getName() + " for " + damage + "  damage!");
            }
        }
    }


    public int earendillAttack(Character character) {
        Random random = new Random();
        int stunTime = random.nextInt(3) + 1;
        character.setStunRounds(stunTime);
        System.out.println("Shelob is paralyzed for " + stunTime + " times!");
        return stunTime;
    }

    public int stingSwordAttack() {
        Random random = new Random();
        return (random.nextInt(3)) * 100;
    }

    public int getMithrilCoat() {
        return mithrilCoat;
    }

    public void setMithrilCoat(int mithrilCoat) {
        this.mithrilCoat = mithrilCoat;
    }

}
