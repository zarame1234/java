public class Dancer entends Character {
  public void dance() {
    System.out.println(this.name + "は踊り出した");
  }

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に３ポイントの攻撃");
    m.hp -= 3;
  }
}