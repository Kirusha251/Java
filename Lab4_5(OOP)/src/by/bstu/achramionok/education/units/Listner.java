package by.bstu.achramionok.education.units;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Kirill on 15.09.2016.
 */
public class Listner extends Person{
    private int tuitionFee;
    public Listner(){

    }
    public Listner(String name, String surname, int age, int yearthOfbirth) {
        super(name, surname, age, yearthOfbirth);

    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public Listner(@JsonProperty("name")String name, @JsonProperty("surname")String surname, @JsonProperty("age")int age, @JsonProperty("yearthOfbirth")int yearthOfbirth, @JsonProperty("rating")int tuitionFee) {
        super(name,surname,age,yearthOfbirth);
        this.tuitionFee=tuitionFee;
    }
}

