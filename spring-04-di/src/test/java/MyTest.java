import com.yyx.pojo.Student;
import com.yyx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        student.show();
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}
