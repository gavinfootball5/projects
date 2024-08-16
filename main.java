import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner in = new scanner(System.in);
Random rand = new Random();
    //vari

    String[] enemies = {"skeleton", "warriror", "Zombie"};
    int maxEnemyHealth = 75;
    int enemyAttackDamage = 25;


    int health = 100;
    int attackDamage = 50;
    int bumHealthPots = 3;
    int healthPotionHealAmount = 30;
    int healthPotionDropChance = 50;


    boolean running = true;

    System.out.println("welcome to the dungeon");
GAME:
while (running) {
   System.out.println("---------------");
  int enemyHealth = rand.nextInt(maxEnemyHealth);

  String enemy = enemies[rand.nextInt(enemies.length)];
System.out.println("\t# " + ememy + "appeared #\n");
while (enemyHealth > 0) {
  System.out.println("/tYour HP: " + health);
  System.out.println("\t" + enemy +"HP: " +" enemyHealth);
  System.out.println("\n\tWhat would you like to do?");
  System.out.println("\t1. Attack");
  System.out.println("\t2. Drink potion");
  System.out.println("\t3. run");

  String input = in.nextLine();

}


     
      }
}
