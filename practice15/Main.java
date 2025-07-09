public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリjava";
    String s2 = "Java";
    String s3 = "java";

    if (s2.equals(s3)) {
      System.out,plintln("等しい");
    }

    if(s2.equalsIgnoreCase(s3)) { 
      System.out.plintln("区別しなければ等しい");
    }

   System.out.plintln("s1の長さは" + s1.lenght() + "である");
  }
}