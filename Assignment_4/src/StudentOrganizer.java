import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentOrganizer{
    public static List<String[]> readCSV(String filePath){
        List <String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader((new FileReader((filePath))))){
            String line;
            while ((line = br.readLine()) !=null){
                String[] values = line.split((","));
                data.add(values);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        List<String[]> studentList = readCSV("C:\\Users\\Rayeh\\Documents\\CodersCampus\\Assignment_4\\src\\student-master-list.csv");
        List<String[]> compsciList = new ArrayList<>();
        List<String[]> statList = new ArrayList<>();
        List<String[]> apmathList = new ArrayList<>();
        //System.out.println(studentList);
        for ( int i = 1; i < studentList.size(); i++){
            String[] studentRecord = studentList.get(i);
            String courseWithNumber = (studentRecord)[2];
            String course = (courseWithNumber.split(" "))[0];
            if (course.equals("COMPSCI")){
                compsciList.add(studentRecord);
            }
            //System.out.println(course);
            if (course.equals("STAT")) {
                statList.add(studentRecord);
            }
            if (course.equals("APMTH")){
                apmathList.add(studentRecord);
            }
            //System.out.println(Arrays.toString(studentList.get(i)));
        }
        for (int i = 0; i < compsciList.size(); i ++){
            System.out.println(Arrays.toString(compsciList.get(i)));
        }
        System.out.println("-------- ");

        for (int i = 0; i < statList.size(); i ++){
            System.out.println(Arrays.toString(statList.get(i)));

        }
        System.out.println("-------- ");
        for (int i = 0; i < apmathList.size(); i ++){
            System.out.println(Arrays.toString(apmathList.get(i)));

        }
        System.out.println("------ ");

    }
}
