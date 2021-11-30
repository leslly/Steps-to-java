 public class TestRectangle {
    public static void main(String[] args){
        Rectangle x = new Rectangle();

        x.length = 5;
        x.breath =6;

        int r = x.area();
        int e = x.perimeter();

        System.out.println("The area =" + r);
        System.out.println("The perimeter =" + e);
    }
}
