import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {

    //split the string "String[] userInfo= fileLine.split(",");"
    public static void main(String[] args) {
        try {
            File data = new File("data.txt");
            Scanner dataFile = new Scanner(data);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!: " + e.getMessage());
        }
        User user = new User("John", "John Doe", "jd123");

        System.out.println(user.getuserName());
        System.out.println(user.getname());
        System.out.println(user.getPassWord());
    }
}
