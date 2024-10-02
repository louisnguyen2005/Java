package buoi3;

import java.util.Scanner;

public class Gach {
    private String maSo;
    private String mau;
    private int soLuong;
    private int dai;
    private int ngang;
    private long gia;

    public Gach() {
        maSo = new String();
        mau = new String();
        soLuong = 0;
        dai = 0;
        ngang = 0;
        gia = 0;
    }

    public Gach(Gach G) {
        maSo = new String(G);
        mau = new String(G);
        soLuong = G.soLuong;
        dai = G.dai;
        ngang = G.ngang;
        gia = D.gia;
    }

    public void gan(Gach G) {
        for (int i = 0; i < soLuong; i++) {
            maSo[i] = new Gach();
            mau[i] = new Gach();
        }

        soLuong = G.soLuong;
        dai = G.dai;
        ngang = G.ngang;
        gia = D.gia;
    }

    public String laymaSo() {
        return this.maSo;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số: ");
        maSo = sc.nextLine();
        System.out.print("Nhập màu: ");
        mau = sc.nextLine();
        System.out.print("Nhập số lượng viên trong 1 hộp: ");
        soLuong = sc.nextInt();
        System.out.print("Nhập chiều dài viên gạch (cm): ");
        dai = sc.nextInt();
        System.out.print("Nhập chiều ngang viên gạch (cm): ");
        ngang = sc.nextInt();
        System.out.print("Nhập giá bán 1 hộp: ");
        gia = sc.nextLong();

    }

    public void in() {
        System.out.println("Ma so: " + maSo);
        System.out.println("Mau: " + mau);
        System.out.println("So luong vien trong hop: " + soLuong);
        System.out.println("Chieu dai vien gach: " + dai + " cm");
        System.out.println("Chieu ngang vien gach: " + ngang + " cm");
        System.out.println("Gia ban mot hop: " + gia + " VND");
    }

    public String toString(){
        String S = "Ma so: " + maSo;
        S+="Mau: " + mau;
        S+="So luong vien trong hop: " + soLuong;
        S+="Chieu dai vien gach: " + dai + " cm";
        S+="Chieu ngang vien gach: " + ngang + " cm"
        S+="Gia ban mot hop: " + gia + " VND"
        return S;
    }

    public float giaBanle() {
        return (float) (gia * 1.2 / soLuong);
    }

    public int dienTichToiDa() {
        return dai * ngang * soLuong;
    }

    public int soLuongHop(int D, int N) {
        int dienTichNen = D * N;
        int dienTichMotVien = dai * ngang;
        int soVienCan = (int) Math.ceil((double) dienTichNen / dienTichMotVien);
        return (int) Math.ceil((double) soVienCan / soLuong);
    }

    public float chiPhiLot(int D, int N) {
        return soLuongHop(D, N) * gia;
    }

    public float giaThanhTrenDienTich() {
        return (float) gia / dienTichToiDa();
    }

}
