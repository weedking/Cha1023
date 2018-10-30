package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pojo.definition.Animal;
import pojo.definition.Person;

@Component
public class BussinessPerson implements Person {
    @Autowired
    private Animal initDog = null;

    @Override
    public void service(){
        this.initDog.use();
    }

    @Override
    public void setAnimal(Animal animal){
        this.initDog = animal;
    }
}
