import java.util.Scanner;

public class Employee extends Staff implements ICalculator {
    Scanner sc = new Scanner(System.in);
    private int OT;
    public Employee(){

    }



    public void setOT() {
        System.out.print("nhap so gio lam them ");
        OT = sc.nextInt();

    }

    public int getOT() {

        return OT;
    }


    @Override
    public void calculateSalary (){
        int a = getSalaryrate()*wage + OT*OTrate;
        setLuongnv(a);
    }

    @Override
    public  String toString(){
   return (getId() +"\t"+ getName() +"\t " +getAge()+
           "\t" + getDateofbegin() +"\t" + getSalaryrate()+
        "\t"+ getDayoff() + "\t"+ getLuongnv ()+
            "\t " + getTenbophan() + "\t" + getIdbophan() );
    }

}