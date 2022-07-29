import java.io.*;

public class make_csv {
    public static void main(String[] args) throws IOException{
//        try {
//            PrintWriter pw = new PrintWriter(new File("/home/druglord/AndroidStudioProjects/Tracker/app/src/androidTest/java/csv_output.txt"));
//            StringBuilder sb = new StringBuilder();
//            sb.append("First name");
//            sb.append("\tLast name");
//
//            pw.write(sb.toString());
//            pw.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//
//        }
        FileWriter fw = new FileWriter("/home/druglord/AndroidStudioProjects/Tracker/app/src/androidTest/java/csv_output.txt",true);
        PrintWriter out = new PrintWriter(fw);
        out.println("western");
        out.close();
    }
}
