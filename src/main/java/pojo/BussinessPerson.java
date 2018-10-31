package pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pojo.definition.Animal;
import pojo.definition.Person;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BussinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {


    private Animal animal1 = null;



    @Override
    public void service(){
        this.animal1.use();
    }

    @Override
    @Autowired
    @Qualifier("mydog")
    public void setAnimal(Animal animal){
        System.out.println("延迟依赖注入");
        this.animal1 = animal;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("["+this.getClass().getSimpleName()+"]调用BeanNameAware的setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory){
        System.out.println("["+this.getClass().getSimpleName()+"]调用BeanFactory的setBeanFactory");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        System.out.println("["+this.getClass().getSimpleName()+"]调用ApplicationContex的setApplicationContext");
    }

    public void afterPropertiesSet() throws Exception{
        System.out.println("["+this.getClass().getSimpleName()+"]调用InitializingBean的afterPropertiesSet");
    }

    @PostConstruct
    public void init(){
        System.out.println("["+this.getClass().getSimpleName()+"]注解@PostConstruct定义的自定义初始化方法");
    }

    @PreDestroy
    public void destroy1(){
        System.out.println("["+this.getClass().getSimpleName()+"]注解@PreDestroy定义的自定义销毁方法");
    }

    @Override
    public void destroy() throws Exception{
        System.out.println("["+this.getClass().getSimpleName()+"]DisposableBean方法");
    }
}






