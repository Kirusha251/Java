package by.bstu.achramionok.education.organizations;

/**
 * Created by Kirill on 17.09.2016.
 */
public enum Organazations {
    OGB("ООО Агенты Габена", 250.5 );



    private final String fullName;   // in fullname
    private final double fullPay; // in fullPay

    Organazations(String fullName, double fullPay) {
        this.fullName = fullName;
        this.fullPay = fullPay;
    }
}