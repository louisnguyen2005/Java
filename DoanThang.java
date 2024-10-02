package buoi3;

import java.util.Scanner;

public class DoanThang {
    private Diem d1, d2;

    public DoanThang() {
        d1 = new Diem();
        d2 = new Diem();
    }

    public DoanThang(Diem d11, Diem d22) {
        d1 = d11;
        d2 = d22;
    }

    public DoanThang(int ax, int ay, int bx, int by) {
        d1 = new Diem(ax, bx);
        d2 = new Diem(ay, by);
    }

    public void nhapDoanThang() {
        System.out.println("nhap toa doa diem dau tien:");
        d1.nhap();
        System.out.println("nhap toa do diem tiep theo:");
        d2.nhap();

    }

    public void inDoanThang() {
        System.out.print("Toa do cua diem d1 la: ");
        d1.in();
        System.out.println();
        System.out.println("Toa do cua diem d2 la: ");
        d2.in();
    }

    public void tinhTienDiem(int dx, int dy) {
        d1.tinhtien(dx, dy);
        d2.tinhtien(dx, dy);
    }

    public float doDaiDoanThang() {
        return d1.distanceAB(d2);
    }

    public double gocTrucHoanh() {
        int dx = d2.layX() - d1.layX();
        int dy = d2.layY() - d1.layY();
        return Math.atan2(dy, dx) * (180 / Math.PI);
    }

    public double gocTrucTung() {
        int dx = d2.layX() - d1.layX();
        int dy = d2.layY() - d1.layY();
        return Math.atan2(dx, dy) * (180 / Math.PI);
    }

}
