import java.util.List;
import org.sql2o.*;

public class Stylist {
    private int id;
    private String name;
    private String gender;
    private String contact;

    public Stylist(String name, String gender, String contact) {
        this.name = name.toUpperCase();
        this.gender = gender;
        this.contact = contact;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
}