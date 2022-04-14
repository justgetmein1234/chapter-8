import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class roasters {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		String fileName = null;
		int numStudents;
		String firstName;
		String lastName;
		StuName[] writeStudents = null;
		StuName[] readStudents = null;
		File file = null;
		FileOutputStream out = null;
		ObjectOutputStream writeStu = null;
		FileInputStream in = null;
		ObjectInputStream readStu = null;

		
		System.out.print("Enter file name: ");
		fileName = scanner.nextLine();
		file = new File(fileName);

		System.out.print("Enter number of students: ");
		numStudents = scanner.nextInt();
		writeStudents = new StuName[numStudents];

		scanner.nextLine();

		for (int i = 1; i <= numStudents; i++) {

			System.out.print("\nEnter first name of student " + i + ": ");
			firstName = scanner.nextLine();

			System.out.print("Enter last name of student " + i + ": ");
			lastName = scanner.nextLine();

			writeStudents[i - 1] = new StuName(firstName, lastName);

		}

		
		try {

			out = new FileOutputStream(file);
			writeStu = new ObjectOutputStream(out);

			writeStu.writeObject(writeStudents);
			writeStu.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Problem with input/output.");
		}

	

		try {
			in = new FileInputStream(file);
			readStu = new ObjectInputStream(in);

			readStudents = (StuName[]) readStu.readObject();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Problem with input/output.");
		} catch (ClassNotFoundException e) {
			System.out.println("Class could not be found to cast object.");
		}
		
		
		
		System.out.println("\nList of students is");
		for(StuName s : readStudents) {
			System.out.println(s);
		}
		
		scanner.close();

	}

}