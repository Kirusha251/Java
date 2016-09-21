package by.bstu.achramionok.education.units;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
 /**
 * Created by Kirill on 15.09.2016.
 */
@JsonTypeInfo(use = Id.NAME,
                include = JsonTypeInfo.As.PROPERTY,
                property = "type")
@JsonSubTypes({
        @Type(value = Listner.class),
        @Type(value = Student.class),

})
public abstract class Person {
    private String name;
    private String surname;
    private int age;
    private int yearthOfbirth;

    public Person() {
    }

    public Person(String name, String surname, int age, int yearthOfbirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.yearthOfbirth = yearthOfbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearthOfbirth() {
        return yearthOfbirth;
    }

    public void setYearthOfbirth(int yearthOfbirth) {
        this.yearthOfbirth = yearthOfbirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
