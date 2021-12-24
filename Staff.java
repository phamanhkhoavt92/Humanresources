import java.util.Scanner;

public abstract class Staff {
    private String id;
    private String name;
    private int  age;
    private int salaryrate;
    private String dateofbegin;
    private int dayoff;
    private int luongnv;
    private Department dept;
    Scanner sc = new Scanner(System.in);

    public Staff(){

    };


    public Staff(String id, String name, int age, int salaryrate, String dateofbegin, int dayoff, int luongnv, Department dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salaryrate = salaryrate;
        this.dateofbegin = dateofbegin;
        this.dayoff = dayoff;
        this.luongnv = luongnv;
        this.dept = dept;
    }

    public void setId() {
        System.out.print("nhap Ma nhan vien: ");
        id = sc.nextLine();

    }

    public String getId() {

        return id;
    }

    public void setName() {
        System.out.print("nhap Ten nhan vien: ");
        name = sc.nextLine();
    }

    public String getName() {

        return name;
    }

    public void setAge() {
        System.out.print("nhap tuoi nhan vien: ");
        age = sc.nextInt();

    }

    public int getAge() {

        return age;
    }
    public void setSalaryrate() {
        System.out.print("nhap he so luong nhan vien: ");
        salaryrate = sc.nextInt();
        sc.nextLine(); // de dien k tu \n

    }

    public int getSalaryrate() {

        return salaryrate;
    }

    public void setDateofbegin () {
        System.out.print("nhap ngay bat dau lam viec: ");
        this.dateofbegin = sc.nextLine();

    }

    public String getDateofbegin() {

        return dateofbegin;
    }

    public void setDayoff () {
        System.out.print("nhap ngay nghi phep: ");
         dayoff = sc.nextInt();
        sc.nextLine(); // de dien k tu \n
    }

    public int getDayoff() {

        return dayoff;
    }
    public void setLuongnv (int luongnv) {

        this.luongnv = luongnv;
    }

    public int getLuongnv() {

        return luongnv;
    }
    public void setDept () {

        dept = new Department();
        dept.addemployee();

    }

    public String getTenbophan() {

        return dept.getTenbophan();

    }
    public String getIdbophan() {

        return dept.getIdbophan();

    }

   }
