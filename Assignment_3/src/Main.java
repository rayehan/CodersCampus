import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    //split the string "String[] userInfo= fileLine.split(",");"
    public static void main(String[] args) {
        ArrayList<User> userArrayList = new ArrayList<User>();
        try {
            File data = new File("data.txt");
            Scanner dataFile = new Scanner(data);

            while (dataFile.hasNextLine()){
                String dataFileData = dataFile.nextLine();
                String[] userInfo = dataFileData.split(",");
                User user = new User(userInfo[0], userInfo[1], userInfo[2]); // uppercase "User" is the object and the lower case "user" is the instance typ or the object type
                userArrayList.add(user);
//                ArrayList<User> userArrayList = new ArrayList<User>();
//                System.out.println(dataFileData);
                System.out.println(Arrays.toString(userInfo));
            }
            dataFile.close();
            System.out.println(userArrayList.toString());
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!: " + e.getMessage());
        }

        Scanner userScanner = new Scanner(System.in);
        System.out.println("Please enter your user name: ");
        String userName = (userScanner.nextLine()).toLowerCase();
        System.out.println("Please enter your password: ");
        String userPasswd = userScanner.nextLine();
        int loginAttempts = 0;
        while (loginAttempts < 5){
            for (int i = 0; i < userArrayList.size(); i++){
                String tempPassword = (userArrayList.get(i)).getPassWord();
                String tempUserName = ((userArrayList.get(i)).getuserName()).toLowerCase();
            };
            loginAttempts +=1;
        }

//        User user = new User("John", "John Doe", "jd123");

//        System.out.println(user.getuserName());
//        System.out.println(user.getname());
//        System.out.println(user.getPassWord());
    }
}
