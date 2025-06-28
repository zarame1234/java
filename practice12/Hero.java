public class Hero extends character {
  public void attack(Monster m) {
    System.out.println(this.name + "の攻撃");
    m.hp -= 10;
  }
}