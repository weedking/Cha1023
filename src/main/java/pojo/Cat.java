package pojo;

import pojo.definition.Animal;

public class Cat implements Animal{
    @Override
    public void use(){
        System.out.println("猫["+Cat.class.getSimpleName()+"]是抓老鼠的。");
    }
}
