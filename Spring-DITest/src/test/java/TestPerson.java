import bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaoyuan.zhang
 * @date 2021/7/10 - 18:32
 */
public class TestPerson {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dogcat.xml");
        Person person = context.getBean("person",Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }

}
