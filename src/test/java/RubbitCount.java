import java.util.Observable;
import java.util.Observer;

/**
 * @Author kolly.li
 * @Date 2018/4/28
 * Modified Logs:
 * Created by kolly.li on 2018/4/28.
 */
public class RubbitCount {

    public static void main(String[] args) {
        // 面向对象设计思想----------
        Clock.getInstance().addObserver(new Rubbit(1));
        Clock.rabbitcount += 1;
        Clock.getInstance().run();

    }

}

// 周期对象,控制时间自动增长,被观察的对象
class Clock extends Observable {
    private static Clock clock;
    public static int rabbitcount = 0; // 现有兔子数量

    public static Clock getInstance() { // 单例模式,大家公用一个时间
        if (clock == null) {
            clock = new Clock();
        }
        return clock;
    }

    public void run() { // 时间开始走动
        for (int i = 1; i <= 20; i++) { // 20个月
            this.setChanged();
            this.notifyObservers(i); // 唤醒观察者
            System.out.println("面向对象思想:第" + i + "个月的兔子数量是:" + rabbitcount);
        }
    }
}

class Rubbit implements Observer { // 兔子(观察者:观察时间)
    int birthMoth;

    public Rubbit(int birthMoth) { // 初始化兔子的出生时间
        this.birthMoth = birthMoth;
    }

    public void update(Observable o, Object month) {
        Integer now = (Integer) month;
        if (now - birthMoth >= 2 && now - birthMoth <= 10) { // 如果兔子达到三岁就可以生出一对小兔子
            Clock.rabbitcount += 1; // 兔子的数量增加一对
            Clock.getInstance().addObserver(new Rubbit(now)); // 将小兔子变成观察者,并告诉它自己出生的时间
        }
        //if (now -birthMoth > 15){
        //    Clock.rabbitcount -= 1; // 兔子的数量减少一对
        //}
    }
}