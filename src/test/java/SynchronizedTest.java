/**
 * @Author kolly.li
 * @Date 2018/5/15
 * Modified Logs:
 * Created by kolly.li on 2018/5/15.
 */
public class SynchronizedTest {
    public synchronized void test1() {
    }

    public void test2() {
        synchronized (this) {
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
