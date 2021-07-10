import bean.Student;
import bean.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaoyuan.zhang
 * @date 2021/7/10 - 17:16
 */
public class SpringDITest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
//        Student student = context.getBean("student", Student.class);
//        System.out.println(student.getName());
//        System.out.println(student.getTeacher());
//        System.out.println(student.getBooks());
//        System.out.println(student.getList());
//        System.out.println(student.getMap());
//        System.out.println(student.getSet());
        Teacher teacher2 = context.getBean("teacher2", Teacher.class);
        Teacher teacher3 = context.getBean("teacher2", Teacher.class);
        System.out.println(teacher2);
        System.out.println(teacher2==teacher3);
    }
}
