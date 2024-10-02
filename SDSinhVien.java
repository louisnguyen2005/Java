import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        System.out.println("nhap sinh vien: ");
        a.nhap();
        a.in();
        System.out.println("nhap diem va cac mon cua sinh vien: ");
        a.nhapDiem();
        a.in();
        System.out.println("xoa mon hoc: ");
        a.xoa("OOP");
        a.in();
        System.out.println("Dan ky lai mon OOP");
        a.dangKy("OOP", "A");
        a.in();
        SinhVien b = new SinhVien(a);
        System.out.println("Thong tin sinh vien B la: ");
        b.in();
        SinhVien ds[];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new SinhVien();
        }
        System.out.println("nhap danh sach sien vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println("nhap sinh vien thu " + (i + 1));
            ds[i].nhap();
            System.out.println("nhap Diem vien thu " + (i + 1));
            ds[i].nhapDiem();
        }
        System.out.println("danh sach sinh vien vua nhap la: ");
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
        System.out.println("danh sach sinh vien bi canh bao hoc vu: ");
        for(SinhVien sv : ds){
            if(sv.diemTB() < 1) System.out.println(sv);
        }
        System.out.println(" SX sinh vien theo ten: ");
        for(int i =0; i< n-1; i++){
            for(int j = i+1;j<n; j++){
                if(ds[i].layTen().compareTo(ds[j].layTen()) > 0){
                    SinhVien tmp == ds[i];
                    ds[i] = ds[j];
                ds[j] = tmp;                  }
            }
        }
        for(SinhVien sv : ds) System.out.println(sv);

    }
}
