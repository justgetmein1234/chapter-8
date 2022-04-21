import java.io.File;
import java.util.Scanner;

public class MyFile {

public static void main(String[] args) {

File file;
String name;
Scanner input = new Scanner(System.in);

System.out.print("Enter the file name: ");
name = input.nextLine();   
file = new File(name);

if(file.exists()){
   System.out.println("File exists");
}
else{
System.out.println("File does not exist");
}

}

}