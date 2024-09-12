package PhanSo;

import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        System.out.print("Phân số a: ");
        a.in();
        System.out.print("Phân số b: ");
        b.in();

        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        System.out.println("Nhập giá trị cho phân số x:");
        x.nhap();
        System.out.println("Nhập giá trị cho phân số y:");
        y.nhap();

        System.out.print("Nghịch đảo của phân số x: ");
        PhanSo xNghichDao = x.giaTriNghichDao();
        xNghichDao.in();

        PhanSo tongXY = x.cong(y);
        System.out.print("Tổng của x và y: ");
        tongXY.in();

        System.out.print("Nhập số lượng phân số n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PhanSo[] danhSachPhanSo = new PhanSo[n];
        for (int i = 0; i < n; i++) {
            danhSachPhanSo[i] = new PhanSo();
            System.out.println("Nhập phân số thứ " + (i + 1) + ":");
            danhSachPhanSo[i].nhap();
        }

        PhanSo tong = new PhanSo(0, 1);
        for (PhanSo ps : danhSachPhanSo) {
            tong = tong.cong(ps);
        }
        System.out.print("Tổng của n phân số: ");
        tong.in();

        PhanSo max = danhSachPhanSo[0];
        for (PhanSo ps : danhSachPhanSo) {
            if (ps.lonHon(max)) {
                max = ps;
            }
        }
        System.out.print("Phân số lớn nhất: ");
        max.in();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (danhSachPhanSo[i].giaTriThuc() > danhSachPhanSo[j].giaTriThuc()) {
                    PhanSo temp = danhSachPhanSo[i];
                    danhSachPhanSo[i] = danhSachPhanSo[j];
                    danhSachPhanSo[j] = temp;
                }
            }
        }

        System.out.println("Danh sách phân số sau khi sắp xếp:");
        for (PhanSo ps : danhSachPhanSo) {
            ps.in();
        }
    }
}
