public abstract class TangibleAsset extends {
  String color;
  String isbn;
  
  public TangibleAsset(String name, int price, Stirng color, String isbn) { 
    super(name, price);
    this.color = color;
  }

  public abstract String getColor() {
    return this.color;
  }
}
