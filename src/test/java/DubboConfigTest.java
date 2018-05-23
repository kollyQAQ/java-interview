import com.kolly.dubbo.proxy.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author kolly
 * @Date 2018/4/12.li
 * Modified Logs:
 * Created by kolly.li on 2018/4/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/kolly-consumer.xml")
public class DubboConfigTest {

    @Autowired
    private MenuService menuService;

    @Test
    public void test(){
        System.out.println(menuService);
        System.out.println(menuService.getClass().getName());
        menuService.sayHello();
    }

}
