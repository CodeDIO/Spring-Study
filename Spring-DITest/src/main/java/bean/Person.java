package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author xiaoyuan.zhang
 * @date 2021/7/10 - 18:30
 */
@Component
public class Person {
    @Autowired
//    @Qualifier(value = "cat111")
    private Cat cat;
    @Autowired
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public Person() {
    }

    public Person(Cat cat, Dog dog) {

        this.cat = cat;
        this.dog = dog;
    }
}
