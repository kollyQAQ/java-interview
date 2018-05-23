/**
 * Created by kolly on 2017/10/29.
 */
public class Main {

    public static void main(String[] args) {
        Class<Main> mainClass = Main.class;
        System.out.println(int.class);
        System.out.println((new int[3][4][5][6][7][8][9]).getClass().getName());
    }

}
