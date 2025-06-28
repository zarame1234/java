public class Wizard {
  private int hp;
  private String name;
  private Wand wand;

  void heal (Hero h) {
    int basePoint = 10;
    int recovePoint = (int)(basePoint * this.wand.power);
    h.setHp(h.getHp() + recovePoint);
  } 

  publlic int getHp() {
    return this.hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }

  publlic String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

   publlic int getMp() {
    return this.mp;
  }
  public void setMp(int mp) {
    this.mp = mp;
  }

   publlic Wand getWand() {
    return this.wand;
  }
  public void setWand(Wand wand) {
    this.wand = wand;
  }
}