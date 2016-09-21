package by.bstu.achramionok.education.main;

import by.bstu.achramionok.education.educationmanager.Manager;
import by.bstu.achramionok.education.organizations.Organazations;
import by.bstu.achramionok.education.staff.Staff;
import by.bstu.achramionok.education.units.Listner;
import by.bstu.achramionok.education.units.Person;
import by.bstu.achramionok.education.units.Student;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import jdk.internal.org.objectweb.asm.TypeReference;
import jdk.nashorn.api.scripting.JSObject;
import jdk.nashorn.internal.parser.TokenType;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.ObjectMapper;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Kirill on 15.09.2016.
 */
public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Manager manager = new Manager();
        Staff group = new Staff();
        Staff group1 = new Staff();
        group = manager.createGroupFromFile(group,2,1,"src/values/information.json");
        group1 = manager.createGroupFromStaff(group,2,1);
        Listner listner = new Listner("Кирилл","Ахраменок",19,1997);
        Student strudent = new Student("Владислав", "Князев", 21, 1995);
        Staff container = new Staff();
        container.setStudList(group.getStudList());
        container.add(strudent);
        container.add(listner);
        log.info(Integer.toString(manager.sumFee(container)));
        log.info(Integer.toString(manager.sumRanges(container)));

    }
}
