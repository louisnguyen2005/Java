package buoi3;

import java.util.Scanner;

public class SinhVien {
    private String maSo;
    private String hoTen;
    private Date ngaySinh;
    private int n, max;
    private String[] mon;
    private String[] diem;

    public SinhVien() {
        maSo = new String();
        hoTen = new String();
        n = 0;
        max = 60;
        ngaySinh = new Date();
        mon = new String();
        diem = new String();
        for (int i = 0; i < n; i++) {
            mon[i] = new String();
            diem[i] = new String();
        }
    }

    public SinhVien(SinhVien sv) {
        maSo = new String(sv.maSo);
        hoTen = new String(sv.hoTen);
        n = sv.n;
        max = sv.max;
        ngaySinh = new Date(sv.ngaySinh);
        mon = new String[max];
        diem = new String[max];
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay thang nam sinh: ");
        ngaySinh.nhap();
        System.out.println("nhap ho ten: ");
        hoTen = sc.nextLine();
        sc.nextLine();
        System.out.println("nhap ma so sin vien: ");
        maSo = sc.nextLine();
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hoc phan cua sinh vien: ");
        n = sc.nextInt();
        if (n >= max) {
            n = max;
        }
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("nhap hoc phan thu" + i + ":");
            mon[i] = sc.nextLine();
            System.out.print("Nhập điểm học phần (A, B+, B, ...): ");
            diem[i] = sc.nextLine();

        }
    }

    public void in() {
        System.out.println("[" + maSo + "," + hoTen + "," + ngaySinh);
        System.out.println("Danh sach cac mon hoc la: ");
        for (int i = 0; i < n; i++) {
            System.out.println("mon hoc thu :" + i + 1 + ":" + mon[i]);
            System.out.println("Diem cua mon hoc thu :" + i + 1 + ":" + diem[i]);

        }
        System.out.println("]");
    }

    public String toString() {
        Srting S = ("[" + maSo + "," + hoTen + "," + ngaySinh);
        S += ("Danh sach cac mon hoc la: ");
        for (int i = 0; i < n; i++) {
            S += ("mon hoc thu :" + i + 1 + ":" + mon[i]);
            S += ("Diem cua mon hoc thu :" + i + 1 + ":" + diem[i]);

        }
        S += ("]");
        return S;
    }

    public float diemTB() {
        float diemtb = 0.0f;
        for (int i = 0; i < n; i++) {
            if (diem[i].equal("A"))
                diemtb = 4.0f;
            else if (diem[i].equal("B+"))
                diemtb = 3.5f;
            else if (diem[i].equal("B"))
                diemtb = 3.0f;
            else if (diem[i].equal("C+"))
                diemtb = 2.5f;
            else if (diem[i].equal("C"))
                diemtb = 2.0f;
            else if (diem[i].equal("D"))
                diemtb = 1.5f;
            else
                diemtb = 2.0f;

        }
        return diemtb / n;
    }

    public void dangKy(String m, String d) {
        if (n < max) {
            mon[n] = new String(m);
            diem[n] = new String(d);
            n++;
        } else
            System.out.println("full array");
    }

    public void xoa(String m) {
        int i;
        for (i = 0; i < n; i++) {
            if ((mon[i].equals(m)))
                break;
            if (i < n) {
                for (int j = i; j < n - 1; j++) {
                    mon[j] = mon[j + 1];
                    diem[j] = diem[j + 1];
                }
            }
            n--;
        }
    }

    public String layTen() {
        hoTen = hoTen.trim();
        return hoTen.substring(hoTen.lastIndexOf(" ") + 1);
    }

}
