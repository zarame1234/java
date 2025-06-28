public class Main {
  public static void main(String[] args) {
    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();

    for (Character ch : c) {
      ch.hp += 50;
    }

    Monster[] m = new Monster[3];
    m[0] = new Slime();
    m[1] = new Goblin();
    m[2] = new DeathBat();
    
    for (Monster mon : m) {
      mon.run();
    }
      }
}