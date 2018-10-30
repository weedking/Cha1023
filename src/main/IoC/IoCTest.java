//import org.apache.log4j.Logger;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.BussinessPerson;
import pojo.User;
import pojo.definition.Person;

import java.util.logging.Logger;

public class IoCTest {
    private static Logger log = Logger.getLogger(IoCTest.class.toString());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = ctx.getBean(User.class);
//        log.info(String.valueOf(user.getNote()));
        Person person = ctx.getBean(BussinessPerson.class);
        person.service();
    }
}
