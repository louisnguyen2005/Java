package buoi3;

import java.util.Scanner;

public class SDGach {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so loai gach: ");
        n = sc.nextInt();
        Gach[] dsGach = new Gach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho loai gach thu " + (i + 1) + ":");
            dsGach[i] = new Gach();
            dsGach[i].nhap();
        }

        System.out.println("\nThông tin các loại gạch:");
        for (Gach gach : dsGach) {
            gach.in();
            System.out.println();
        }

        Gach gachChiPhiThapNhat = dsGach[0];
        for (int i = 1; i < n; i++) {
            if (dsGach[i].giaThanhTrenDienTich() < gachChiPhiThapNhat.giaThanhTrenDienTich()) {
                gachChiPhiThapNhat = dsGach[i];
            }
        }

        System.out.println("Loại gạch có chi phí lót thấp nhất:");
        gachChiPhiThapNhat.in();

        int chieuNgangNen = 8;
        int chieuDaiNen = 20;
        System.out.println("\nChi phí lót nền 8m x 20m cho từng loại gạch:");
        for (Gach gach : dsGach) {
            float chiPhi = gach.chiPhiLot(chieuNgangNen, chieuDaiNen);
            System.out.println("Mã số: " + gach.laymaSo() + " - Chi phí: " + chiPhi + " VND");
        }
    }
}