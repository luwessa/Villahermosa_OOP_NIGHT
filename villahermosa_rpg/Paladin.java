
package villahermosa_rpg;


public class Paladin extends Swordsman{
    private boolean hasResurrected;
    private int health, damage, shield;
    public Paladin(int health, int damage, int shield) {
        super(health, damage, shield);
        this.health = health;
        this.damage = damage;
        this.shield = shield;
        hasResurrected = false;
    }
    @Override public void receiveDamage(int damage){
       
       if ((damage % 2) == 0){
           damage /= 2;
           damage -= shield;
           health -= damage;
           if (health <= 0){
               resurrect();
           }
           
       }
    }
       public void resurrect(){
        if (hasResurrected == false){
            hasResurrected = true;
            health = 100;
        }
    }
       
     //methods
    @Override
       int getHealth(){
        return health;
    }
    @Override
    int getDamage(){
        return damage;
    }
    @Override
    int getShield(){
        return shield;
    }
       
       
    }
    

