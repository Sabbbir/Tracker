import java.io.*;
import java.util.Scanner;

public class write_append {

    public static void main(String[] args) throws IOException {

        String path = "/home/druglord/AndroidStudioProjects/Tracker/app/src/androidTest/java/";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        FileWriter fw = new FileWriter(path+"write_append.txt",true);
        PrintWriter out = new PrintWriter(fw);
        out.println(str);
        out.close();
    }
}
