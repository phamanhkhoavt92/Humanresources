import java.util.Scanner;

public class Department {
    private String tenbophan;
    private String idbophan;

    Scanner sc = new Scanner(System.in);
    public Department(){

    }

    public Department (String tenbophan, String idbophan) {
        this.tenbophan = tenbophan;
        this.idbophan = idbophan;


    }

    public void addemployee(){
        System.out.print("nhap Ten bo phan: ");
        tenbophan = sc.nextLine();

        System.out.print("nhap id bo phan: ");
        idbophan = sc.nextLine();


    }

    public String getIdbophan(){

        return idbophan;
    }
    public String getTenbophan(){

        return tenbophan;
    }




}
