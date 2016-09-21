package by.bstu.achramionok.education.units;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Kirill on 15.09.2016.
 */
public class Student extends Person {
    private int rating;


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Student() {

    }

    public Student(String name, String surname, int age, int yearthOfbirth) {
        super(name, surname, age, yearthOfbirth);
        this.rating = rating;
    }






    @JsonCreator
    public Student(@JsonProperty("name")String name, @JsonProperty("surname")String surname, @JsonProperty("age")int age,@JsonProperty("yearthOfbirth")int yearthOfbirth,@JsonProperty("rating")int rating) {
        super(name,surname,age,yearthOfbirth);
        this.rating = rating;
    }
}
