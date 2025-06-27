public class PoisonMatango extends Matango {
  //コンストラクタ
  public poisonMatango(char suffix) {
    //親クラスのコンストラクタ呼び出し
    super(suffix);    
  }
  int poisonCount = 5;

  public void attack(Hero h) {
    //親クラスのattackメソッド呼び出し
    supper.attack(h);
    if (this.poisinCount > 0) {
      System.out.println("さらに胞子をばら撒いた");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ");
      this.poisonCount--;
    }
  }
}