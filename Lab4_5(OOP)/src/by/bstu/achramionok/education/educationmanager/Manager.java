package by.bstu.achramionok.education.educationmanager;

import by.bstu.achramionok.education.staff.Staff;
import by.bstu.achramionok.education.units.Listner;
import by.bstu.achramionok.education.units.Person;
import by.bstu.achramionok.education.units.Student;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import jdk.nashorn.api.scripting.JSObject;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Kirill on 15.09.2016.
 */
public class Manager {

    public Staff createGroupFromFile(Staff someGroup, int maxStudent, int maxListner,String fileName){
        ObjectMapper mapper = new ObjectMapper();
        Staff dataStorage;
        int smax=0;
        int lmax=0;
        try {
            BufferedReader bufRead = new BufferedReader(new FileReader(fileName));
            FileReader read = new FileReader("src/values/information.json");
            String str=bufRead.readLine();
            dataStorage = mapper.readValue(str,Staff.class);
            for (Person member:dataStorage.getStudList()) {
                if(member.getClass()== Student.class && smax!=maxStudent){
                    someGroup.add(member);
                    smax++;
                }
                if(member.getClass()== Listner.class && lmax!=maxListner){
                    someGroup.add(member);
                    lmax++;
                }

            }

        }
        catch (IOException e){
        }
        catch (FileSystemNotFoundException e){

        }


       return someGroup;
    }
    public Staff createGroupFromStaff(Staff someGroup, int maxStudent,int maxListner){
        int smax=0;
        int lmax=0;
        Staff buffGr = new Staff();
        for (Person member:someGroup.getStudList()) {
            if(member.getClass()== Student.class && smax!=maxStudent){
                buffGr.add(member);
                smax++;
            }
            if(member.getClass()== Listner.class && lmax!=maxListner){
                buffGr.add(member);
                lmax++;
            }

        }
        return buffGr;
    }
    public int sumRanges(Staff course){
        int summ=0;
        for (Person member:course.getStudList()
             ) {
            if(member.getClass()==Student.class){
                summ+=((Student)member).getRating();
            }
        }

        return summ;
    }
    public int sumFee(Staff course){
        int summ=0;
        for (Person member:course.getStudList()
                ) {
            if(member.getClass()==Listner.class){
                summ+=((Listner)member).getTuitionFee();
            }
        }

        return summ;
    }
    public Staff sort(String param, Staff course){
        switch (param){
            case "name":{
                Collections.sort(course.getStudList(), new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });

            }break;
            case "age":{
                Collections.sort(course.getStudList(), new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return Integer.compare(o1.getAge(),o2.getAge());
                    }
                });
            }break;
            case "surname":{
                Collections.sort(course.getStudList(), new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getSurname().compareTo(o2.getSurname());
                    }
                });

            }break;
            case "yearOfBirth":{
                Collections.sort(course.getStudList(), new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return Integer.compare(o1.getYearthOfbirth(),o2.getYearthOfbirth());
                    }
                });

            }break;
            case "raiting":{
                Collections.sort(course.getStudList(), new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return Integer.compare(((Student)o1).getRating(),((Student)o2).getRating());
                    }
                });

            }break;
        }
        return course;
    }
    public Staff topThreeStudents(Staff course){
        course = sort("rating",course);
        Staff topthree = new Staff();
        ArrayList<Person> p = new ArrayList<>(course.getStudList().subList(0,2)) ;
        topthree.setStudList(p);
        return topthree;
    }
}
