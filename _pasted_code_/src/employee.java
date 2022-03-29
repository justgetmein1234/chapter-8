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
