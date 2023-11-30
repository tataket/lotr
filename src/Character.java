abstract class Character {

    private int health;
    private int damage;
    private String name;
    private int stunRounds;

    public Character(String name, int damage) {
        this.health = 10000;
        this.damage = damage;
        this.name = name;
        this.stunRounds = 0;
    }

    public boolean isDead(){
        return getHealth() <= 0;
    }

    abstract void attack(Character character);
    public int hitCalculate() {
        return 0;
    }

    public boolean isParalyzed() {
        return false;
    }

    public int getStunRounds() {
        return stunRounds;
    }

    public void setStunRounds(int stunRounds) {
        this.stunRounds = stunRounds;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
