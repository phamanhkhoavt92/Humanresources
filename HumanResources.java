/* Project 3: Human Resources
    Name: Pham Anh Khoa
    Student ID:FX11006

*/

import java.util.ArrayList;
import java.util.Scanner;

public class HumanResources {
    public static final ArrayList<Staff> danhsach = new ArrayList<Staff>(); // Khoi tao danh sach nhan vien
    public static final Scanner sc = new Scanner(System.in);

    public static void danhsachphongban() {
        System.out.print("nhap so luong nhan vien: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n]; // khai bao nhan vien

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            System.out.println("nhap thong tin nhan vien thu: " + (i + 1));
            employees[i].setId();
            employees[i].setName();
            employees[i].setAge();
            employees[i].setSalaryrate();
            employees[i].setDateofbegin();
            employees[i].setDayoff();
            employees[i].setOT();
            employees[i].setDept();
            employees[i].calculateSalary();
            System.out.println("");

            danhsach.add(employees[i]);  // add vao danh sach nhan vien

        }

        System.out.print("nhap so luong quan ly: ");
        int m = sc.nextInt();
        Manager[] managers = new Manager[m]; // khai bao quan ly

        for (int i = 0; i < m; i++) {
            System.out.println("nhap thong tin nhan vien quan ly thu: " + (i + 1));
            managers[i] = new Manager();
            managers[i].setId();
            managers[i].setName();
            managers[i].setAge();
            managers[i].setSalaryrate();
            managers[i].setDateofbegin();
            managers[i].setDayoff();
            managers[i].setPosition();
            managers[i].setDept();
            managers[i].calculateSalary();

            danhsach.add(managers[i]);// add vao danh sach nhan vien
        }

    }

    public static void timkiemnhanvien() {
        boolean timthay = false;
        sc.nextLine(); // chong troi khi nhap timkiem
        System.out.print("tim kiem nhan vien bang \"ma nhan vien\" hay bang \"ten nhan vien?\": ");

        String timkiem = sc.nextLine();
        while (timkiem.compareToIgnoreCase("ma nhan vien") != 0 && timkiem.compareToIgnoreCase("ten nhan vien") != 0) {
            System.out.print("nhap lai - \"ma nhan vien\" hay bang \"ten nhan vien?\": ");
            timkiem = sc.nextLine();
        }

        if (timkiem.compareToIgnoreCase("ma nhan vien") == 0) {
            System.out.println("vui Long nhap ma nhan vien:");
            String matimkiem = sc.nextLine();

            for (int i = 0; i < danhsach.size(); i++) {
                if (matimkiem.equals(danhsach.get(i).getId())) {
                    System.out.println(danhsach.get(i).toString());
                    timthay = true;
                }
            }
            if (!timthay) {
                System.out.println("khong co nhan vien nay trong danh sach");
            }
        }

        if (timkiem.compareToIgnoreCase("ten nhan vien") == 0) {
            System.out.println("vui Long nhap ten nhan vien:");
            String tentimkiem = sc.nextLine();

            for (int i = 0; i < danhsach.size(); i++) {
                if (tentimkiem.equals(danhsach.get(i).getName())) {
                    System.out.println(danhsach.get(i).toString());
                    timthay = true;
                }
            }
            if (!timthay) {
                System.out.println("khong co nhan vien nay trong danh sach");
            }
        }

    }

    public static void sapxep() {
        ArrayList<Staff> dstrunggian = new ArrayList<Staff>();
        dstrunggian.add(0, danhsach.get(0));
        for (int i = 0; i < danhsach.size() - 1; i++) {
            for (int j = i + 1; j < danhsach.size(); j++)
                if (danhsach.get(i).getLuongnv() < danhsach.get(j).getLuongnv()) { //so sanh luong i va i +1
                    dstrunggian.set(0, danhsach.get(j)); // neu i+1 co luong lon hon, gan trung gian  = so lon
                    danhsach.set(j, danhsach.get(i)); // gan vi tri so lon = so nho
                    danhsach.set(i, dstrunggian.get(0)); // doi vi tri nho = so lon
                }
        }
        System.out.println("In bang luong theo thu tu lon den nho");
        System.out.println("Ma NV"+ "\t" +"Ten" + "\t" +"tuoi" + "\t" +   "ngay lam viec"+ "\t" +   "Hs Luong"+ "\t" +"dayoff"+
                "\t" + "Luongnv"+ "\t" +"Department" + "\t" + "deptid" +"\t" + "Position");
        for (int i = 0; i < danhsach.size(); i++) {
            System.out.println(danhsach.get(i).toString());

        }
    }


    public static void main(String[] args) {

        System.out.print("nhap so luong nhan vien: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n]; // khai bao nhan vien

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            System.out.println("nhap thong tin nhan vien thu: " + (i + 1));
            employees[i].setId();
            employees[i].setName();
            employees[i].setAge();
            employees[i].setSalaryrate();
            employees[i].setDateofbegin();
            employees[i].setDayoff();
            employees[i].setOT();
            employees[i].setDept();
            employees[i].calculateSalary();
            System.out.println("");
            danhsach.add(employees[i]);  // add vao danh sach nhan vien

        }

        System.out.print("nhap so luong quan ly: ");
        int m = sc.nextInt();
        Manager[] managers = new Manager[m]; // khai bao quan ly

        for (int i = 0; i < m; i++) {
            System.out.println("nhap thong tin nhan vien quan ly thu: " + (i + 1));
            managers[i] = new Manager();
            managers[i].setId();
            managers[i].setName();
            managers[i].setAge();
            managers[i].setSalaryrate();
            managers[i].setDateofbegin();
            managers[i].setDayoff();
            managers[i].setPosition();
            managers[i].setDept();
            managers[i].calculateSalary();
            danhsach.add(managers[i]);// add vao danh sach nhan vien
        }


        //tao danh sach cac phong ban
        String[] danhsachdept = new String[danhsach.size()];
        for (int i = 0; i < danhsach.size(); i++) {
            danhsachdept[i] = (danhsach.get(i)).getTenbophan();
        }
        String[] trunggian = new String[danhsach.size()]; // khai bao mang trung gian
        boolean timthay;
        int count = 1;
        trunggian[0] = danhsachdept[0]; // gia su gia tri dau tien trung gian = danh sach
        for (int i = 0; i < danhsach.size(); i++) {
            timthay = false;                  // khai bao tim thay la false
            for (int j = 0; j < count; j++) {
                if (trunggian[j].equalsIgnoreCase(danhsachdept[i])) {   // so sanh trung gian va mang danh sach
                    timthay = true;
                    break;
                }
            }
            if (!timthay) { // neu gia tri trong danh sach khac voi mang trung gian
                trunggian[count] = danhsachdept[i]; // dua gia tri danh sach sang mang trung gian
                count++; // tang dem len 1
            }
        }
        danhsachdept = new String[count]; // khai bao lai kich thuoc mang danh sach phong ban
        for (int i = 0; i < count; i++) { // chuyen lai mang danh sach phong ban
            danhsachdept[i] = trunggian[i];
        }

        System.out.println("");

        // Bao Cao
        System.out.print("Ban co muon bao cao khong? 1.yes  2. no ");
        String traloi1 = sc.next();

        while (traloi1.equals("Yes") || traloi1.equals("YES")  || traloi1.equals("1") || traloi1.equals("co")  || traloi1.equals("CO") ) {

            System.out.println("lua chon cac bao cao sau: ");
            System.out.println("1. Hien thi nhan vien hien co trong cong ty");
            System.out.println("2. Hien thi cac bo phan trong cong ty");
            System.out.println("3. Hien thi nhan vien theo tung bo phan");
            System.out.println("4. Them nhan vien moi vao cong ty");
            System.out.println("5. Tim kiem nhan vien theo ten hoac theo ma nhan vien");
            System.out.println("6. Hien thi bang luong cua toan cong ty theo thu tu giam dan");
            System.out.print("Ban lua chon bao cao: ");

            int traloi = sc.nextInt();


            while (traloi <= 0 || traloi >= 7) {
                System.out.print("vui long nhap lai yeu cau bao cao: ");
                traloi = sc.nextInt();
            }

                switch (traloi) {
                    case 1:

                        System.out.println("Ma NV"+ "\t" +"Ten" + "\t" +"tuoi" + "\t" +   "ngay lam viec"+ "\t" +   "Hs Luong"+ "\t" +"dayoff"+
                                "\t" + "Luongnv"+ "\t" +"Department" + "\t" + "deptid" +"\t" + "Position");
                        for (int i = 0; i < danhsach.size(); i++) {
                            System.out.println(danhsach.get(i).toString());

                        }
                        break;

                    case 2:

                        //in ket qua
                        System.out.println("danh sach phong ban la: ");
                        for (int i = 0; i < danhsachdept.length; i++) {
                            System.out.print(danhsachdept[i] + " ");

                        }
                        System.out.println();
                        break;

                    case 3:

                        for (int i = 0; i < danhsachdept.length; i++) {
                            System.out.println("Nhan vien thuoc phong " + danhsachdept[i]);
                            System.out.println("Ma NV"+ "\t" +"Ten" + "\t" +"tuoi" + "\t" +   "ngay lam viec"+ "\t" + "Hs Luong"+ "\t" +"dayoff"+
                                    "\t" + "Luongnv"+ "\t" +"Department" + "\t" + "deptid" +"\t" + "Position");
                            for (int j = 0; j < danhsach.size(); j++) {
                                if (danhsachdept[i].equals(danhsach.get(j).getTenbophan())) {

                                    System.out.println(danhsach.get(j).toString());
                                }
                            }

                        }
                        break;

                    case 4:
                        danhsachphongban();
                        break;

                    case 5:

                        timkiemnhanvien();

                        break;


                    case 6:
                        sapxep();

                        break;


                }



            System.out.println("Ban co muon bao cao nua khong? 1.Yes  2.No ");
            traloi1 = sc.next();


        }


    }
}
