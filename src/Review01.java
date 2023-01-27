
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int i = tax(price);
        int total = price + i;
        System.out.println
            (price + "円の商品の税込価格は" + total + "円(消費税は" + i + "円)です。" );
    }

    public static int tax(int price) {
        int rate = 10;
        int i = price * rate / 100;
        return i;
    }

}
