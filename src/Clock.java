
public class Clock {

    public static void main(String[] args) {
        int seconds = getSeconds(18, 32, 47);
        System.out.println(seconds + "秒");
    }

    public static int getSeconds(int time, int minute, int second ) {
        int times = time * 60 * 60;
        int minutes = minute * 60;
        int seconts = times + minutes + second;
        return seconts;
    }

}
