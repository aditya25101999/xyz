public class chap8_employee_details {
     static class Employee{  //mereko yahan pr static kyun lagana pda mereko koi idea nhi hai

        int age;
        int salary;
        String name;


        public int getsalary(){

            return (salary);
        }
        public String getname(){
            return name;
        }
        public int getage(){
            return age;
        }
        public void setname(String x){
            name= x;

        }
    }
    public static void main(String[] args) {
        Employee aditya= new Employee();
        String updatename;
        aditya.age= 15;
        aditya.salary=40000;
        System.out.println("the salary of aditya is "+ aditya.getsalary());

        aditya.setname("aditya kashyap");
        System.out.println(aditya.getname());
        System.out.println("the age of aditya is " +aditya.getage());
    }
}
