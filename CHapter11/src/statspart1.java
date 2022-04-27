

public class Stats {
    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
   
        Student[] student = new Student[0];
        String name = "";
        double score = 0.0;
        File textFile = new File("test1.dat");
        FileReader in;
        BufferedReader readFile;
        String Name, Score;
        int i = 0;
        try{
          in = new FileReader(textFile);
          readFile = new BufferedReader(in);
          
          while((Name = readFile.readLine() ! = null) && (Score = readFile.readLine() ! = null)){
            name = Name;
            score = Double.parseDouble(Score);
            student = Arrays.copyOf(student, student.length+1);
           
            student[i] = new Student(name, score);
            i++;
          }
          readFile.close();
          in.close();
          
          
          display(student);
          lowest(student);
          highest(student);
          average(student);
        }
        catch(FileNotFoundException e){
          System.out.println("File not found!");
        }
        
    }
  
    public static void display(Student student[]){
      System.out.println("The student and their scores are: ");
      for(int i=0; i<student.length; i++){
        System.out.println("Name: " + student[i].name + " , Score: " + student[i].score);
      }
    }

    public static void lowest(Student student[]){
    
      double minScore = student[0].score;
      String name = student[0].name;
      for(int i=1; i<student.length; i++){
        
        if(minScore > student[i].score){
        
          minScore = student[i].score;
          name = student[i].name;
        }
      }
      System.out.println("Lowest score: " + minScore + " , Student Name: " + name);
    }
    
    public static void highest(Student student[]){
     
      double maxScore = student[0].score;
      String name = student[0].name;
      for(int i=1; i<student.length; i++){
  
        if(maxScore < student[i].score){
         
          maxScore = student[i].score;
          name = student[i].name;
        }
      }
      System.out.println("Highest score: " + maxScore + " , Student Name: " + name);
    }
   
    public static void average(Student student[]){
      double avg = 0.0, sum = 0.0 ;
      for(int i=0; i<student.length; i++){
    
          sum = sum + student[i].score;
      }
     
      avg = sum / student.length;
      System.out.println("Average score: " + avg);
    }
}

class Student {
  String name;
  double score;
  Student(String n, double s){
    name = n;
    score = s;
  }
}
