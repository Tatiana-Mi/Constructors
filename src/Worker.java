public class Worker {
    private String workerName;
    private String workerLastName;
    private int salary;

    public Worker(String workerName, String workerLastName, int salary) {
        this.workerName = workerName;
        this.workerLastName = workerLastName;
        this.salary = salary;
    }
    public Worker(){}

    public String getWorkerName () {
        return workerName;
    }

    public String getWorkerLastName () {
        return workerLastName;
    }

    public int getSalary () {
        return salary;
    }

    public void setWorkerName(String workerName){
        this.workerName = workerName;
    }
    public void setWorkerLastName (String workerLastName){
        this.workerLastName = workerLastName;
    }
    public void setSalary ( int salary){
        this.salary = salary;
    }
    public void printWorkerName(){
        System.out.println("The name of this worker is " + workerName + " " + workerLastName + " and his salary is " +
                salary);
    }

}

