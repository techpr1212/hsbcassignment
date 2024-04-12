import java.io.*;
import java.util.Scanner;

public class readToWrite {
  public static void main(String[]args) throws IOException {

    String inputFilePath = args[0];
    String outputFilePath = args[1];
    File file = new File(inputFilePath);
    FileWriter fw = new FileWriter(outputFilePath);
    Scanner sc = new Scanner(file);
    StringBuilder builder = new StringBuilder();
    while (sc.hasNextLine()){
      builder.append(sc.nextLine());
    }
    readToWrite rw = new readToWrite();
    String reversedString = rw.reverse(builder);
    fw.write(reversedString);
    fw.close();


}

   String reverse(StringBuilder builder){
     return builder.reverse().toString();
   }
}
