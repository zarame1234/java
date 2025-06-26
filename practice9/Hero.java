public class Hero {
  int hp;
  String name;

  public Hero(String name) {
    this.hp = 100;
    this.name =  name;
  }

  public Hero() {
    this("ダミー");
  }
}