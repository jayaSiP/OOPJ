interface emoployee_interface{
    void getDetails();
}
interface manager4 extends emoployee_interface{
    void getDeptDetails();
}
class head implements manager4{
   int emp_id=1,dept_id=11;
   String ename="Sumit",deptname="Software_Development";
    public void getDetails(){
        System.out.println("The employee id is:"+emp_id);
        System.out.println("The employee name is:"+ename);
    }
    public void getDeptDetails(){
        System.out.println("The department id is:"+dept_id);
        System.out.println("The department name is:"+deptname);
    }
}
class compute7{
    public static void main(String[] args) {
        head h1=new head();
        h1.getDetails();
        h1.getDeptDetails();
    }
}
