import java.io.*;

public class make_file {
    public static void main(String[] args) {
        try {
            String path = "/home/druglord/AndroidStudioProjects/Tracker/app/src/androidTest/java/";
            File myobj = new File(path+"students_info.csv");
            if(myobj.createNewFile()){
                System.out.println("File created successfully "+myobj.getName() + myobj.getAbsolutePath());
            }
            else
            {
                System.out.println("File exists");
            }
        }
        catch(IOException e){
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
