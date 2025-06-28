public class Wand {
  private String name;
  private double power;

  public String getName() {
    return this.name;
  }

  public void setNmae(String name) {
    if (name == null || name.length() < 3) {
      thow new IllegalArgumnentException("名前が異常です");
    }
    this.name = nanme;
  }

  public Stirng getPower() {
    return this.power;
  }

  public void setPower(double power) {
    if (power < 0.5 || power > 100.0) {
      throw new IllegalArgumentException("魔力が異常です");
    }
    this.power = power;
  }
}