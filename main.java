import java.util.Random;
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
Random rand = new Random();
    //vari

    String[] enemies = {"Skeleton", "Warrior", "Zombie"};
    int maxEnemyHealth = 75;
    int enemyAttackDamage = 25;


    int health = 100;
    int attackDamage = 50;
    int numHealthPotions = 3;
    int healthPotionHealAmount = 30;
    int healthPotionDropChance = 50;


    boolean running = true;

    System.out.println("welcome to the dungeon");
GAME:
while (running) {
   System.out.println("---------------");
  int enemyHealth = rand.nextInt(maxEnemyHealth);

  String enemy = enemies[rand.nextInt(enemies.length)];
System.out.println("\t# " + enemy + " has appeared #\n");
while (enemyHealth > 0) {
  System.out.println("\t Your HP: " + health);
  System.out.println("\t" + enemy +" HP: " + enemyHealth);
  System.out.println("\n\tWhat would you like to do?");
  System.out.println("\t1. Attack");
  System.out.println("\t2. Drink potion");
  System.out.println("\t3. run");

  String input = in.nextLine();
if( input.equals("1")){
    int damageDealt = rand.nextInt ( attackDamage);
    int damageTaken = rand.nextInt ( enemyAttackDamage);
    
    enemyHealth -= damageDealt;
    health -= damageTaken;
    
    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage");
     System.out.println("\t> YOu take " + damageTaken);
     
     if( health < 1 ){
         System.out.println( "you have died");
         break;
     }
}
else if ( input.equals("2")){
    if (numHealthPotions >0){
        health += healthPotionHealAmount;
        numHealthPotions--;
        System.out.println("\t> You drink a health potion" + healthPotionHealAmount);
        System.out.println("\t You now have " + health +"HP");
    }
}
else if ( input.equals("3")){
    
}
else {



      }
}}}}
