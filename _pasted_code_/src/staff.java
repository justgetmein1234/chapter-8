public class person {

    private String name, address, phone, email;
    
    public person(){
    }
    
    public person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getEmail(){
        return phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "\n" + name;
    }
}
public class student extends person{

    private final String CLASS_STATUS;
    
    public student(String CLASS_STATUS){
        this.CLASS_STATUS =CLASS_STATUS;
    }
    public String getClassStatus(){
        return CLASS_STATUS;
    }
}
public class employee extends person{
    private String office,salary;
    private MyDate DATE_HIRED;
    
    public employee(){
    }
    
    public employee(String office, String salary, MyDate DATE_HIRED){
        this.office = office;
        this.salary = salary;
        this.DATE_HIRED = DATE_HIRED;
    }
    public String office(){
        return office;
    }
    
    public void setOffice(String office){
        this.office = office;
    }
    
     public String getSalary(){
        return salary;
    }
    
    public void setSalary(String salary){
        this.salary = salary;
    }
    
    public MyDate getMyDate(){
        return DATE_HIRED;
    }
}
public class MyDate{
    private int month, day, year;

    public MyDate(int month, int day, int year){
        this.day = day;
        this.month =month;
        this.year = year;   
    }
}
public class faculty extends employee {
    private String office_hours, rank;
    public faculty(){
    }
    
    public faculty(String office_hours, String rank){
        this.office_hours = office_hours;
        this.rank = rank;
    }
    public String getOfficeHours(){
        return office_hours;
    }
    
    public void setOfficeHours(String office_hours){
        this.office_hours = office_hours;
    }
    
     public String getRank(){
        return rank;
    }
    
    public void setRank(String rank){
        this.rank = rank;
    }
}
public class staff extends employee{
    private String title;

    public staff(){
    }
    
    public staff(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
    this.title =title;
    }
}