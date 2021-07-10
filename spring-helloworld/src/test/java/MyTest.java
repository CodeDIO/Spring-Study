import it.xiaoyuan.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaoyuan.zhang
 * @date 2021/7/10 - 15:55
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象，固定格式
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
