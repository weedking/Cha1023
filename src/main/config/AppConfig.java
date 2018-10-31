import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import pojo.*;
import pojo.definition.Person;

import javax.sql.DataSource;
import javax.xml.ws.Service;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"pojo.*"},lazyInit = true,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = UserService.class)})
public class AppConfig {
    @Bean
    public User initUser(){
        User user = new User();
//        user.setId((long) 88901);
//        user.setUserName("billy");
//        user.setNote("note_1");
        return user;
    }

    @Bean
    public BussinessPerson initBusinessPerson(){
        BussinessPerson bussinessPerson = new BussinessPerson();
        return bussinessPerson;
    }

    @Bean(name = "mydog")
    public Dog initDog(){
        Dog dog = new Dog();
        return dog;
    }

    @Bean
    public Cat initCat(){
        Cat cat = new Cat();
        return cat;
    }

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        Properties props = new Properties();
        props.setProperty("driver","com.mysql,jdbc.Driver");
        props.setProperty("url","jdbc:mysql://localhost:3306/Cha1023");
        props.setProperty("username","root");
        props.setProperty("password","a068558a");
        DataSource dataSource = null;
        try{
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }
}
