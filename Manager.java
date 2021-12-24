import java.util.Scanner;

public class Manager extends Staff implements ICalculator{
    Scanner sc = new Scanner(System.in);
    private String position;
    private int luongtrachnhiem;

    public Manager (){

    }



    public void setPosition () {
        System.out.print("nhap vi tri lam viec \"Business Leader\" hay \"Project Leader\" hay \"Technical leader\": ");
        this.position = sc.nextLine();

        if (position.compareToIgnoreCase("Business Leader") == 0) {
            this.luongtrachnhiem = businessleader;


            if (position.compareToIgnoreCase("Project Leader") == 0) {
                this.luongtrachnhiem = projectleader;

            }
        }
        else
            this.luongtrachnhiem = technicalleader;
    }

    public String getPosition(){

        return position;
    }



    @Override
    public void calculateSalary (){

        setLuongnv(getSalaryrate()*salarymanager + luongtrachnhiem);
    }

    @Override
    public String toString(){

       return getId() +"\t"+ getName() +"\t" +getAge()
                 + "\t" + getDateofbegin() + "\t" + getSalaryrate()+
                 "\t"+ getDayoff() + "\t"+ getLuongnv()+
                "\t" + getTenbophan() + "\t" + getIdbophan() +"\t" + getPosition() ;
    }



}
