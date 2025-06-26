public class Hero {
  int hp;
  String name;

  public void attack() {}
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠った回復した！" );
  }
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
  }
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
  }
  public void run() {
    System.out.println(this.name + "は、逃げ出した");
  }

}