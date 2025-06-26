public class Cleric {
  int hp;
  final int MAX_HP = 50; 
  String name;
  int mp = 10;
  final int MAX_MP = 10

  public void selfAid() {
    System.out.println(this.name + "は、セルフエイド魔法を唱えた");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は祈る魔法を唱えた");
    int point = new.Random().nextInt(3) + sec;
    int pointActual = Math.min(this.MAX_MP - this.mp, point);
    this.mp += pointActual;
    System.out.println("MPが" + pointActual + "回復した");
    return pointActual;
  }
}