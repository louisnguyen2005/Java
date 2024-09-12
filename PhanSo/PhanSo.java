package PhanSo;

import java.util.Scanner;

public class PhanSo {
    private int tu, mau;

    public PhanSo() {
        mau = 1;
        tu = 0;
    }

    public PhanSo(int a1, int b1) {
        tu = a1;
        if (mau != 0) {
            mau = a1;
        } else {
            throw new IllegalArgumentException("Mẫu số không được bằng 0.");
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so");
        tu = sc.nextInt();
        do {
            System.out.println("nhap mau so: ");
            mau = sc.nextInt();
        } while (mau == 0);

    }

    public void in() {
        if (tu == 0) {
            System.out.println(0);
        } else if (mau == 1) {
            System.out.println(tu);
        } else if (mau == -1) {
            System.out.println(-tu);
        } else {
            System.out.println(tu + "/" + mau);
        }
    }

    public void nghichDao() {
        if (tu != 0) {
            int temp = tu;
            tu = mau;
            mau = temp;
        } else {
            System.out.println("Không thể nghịch đảo phân số có tử số bằng 0.");
        }
    }

    public PhanSo giaTriNghichDao() {
        if (tu == 0) {
            throw new ArithmeticException("Không thể nghịch đảo phân số có tử số bằng 0.");
        }
        return new PhanSo(mau, tu);
    }

    public double giaTriThuc() {
        return (double) tu / mau;
    }

    public boolean lonHon(PhanSo a) {
        return this.giaTriThuc() > a.giaTriThuc();
    }

    public PhanSo cong(PhanSo a) {
        int tuMoi = tu * a.mau + a.tu * mau;
        int mauMoi = mau * a.mau;
        return new PhanSo(tuMoi, mauMoi);
    }

    public PhanSo tru(PhanSo a) {
        int tuMoi = this.tu * a.mau - a.tu * this.mau;
        int mauMoi = this.mau * a.mau;
        return new PhanSo(tuMoi, mauMoi);
    }

    public PhanSo nhan(PhanSo a) {
        int tuMoi = this.tu * a.tu;
        int mauMoi = this.mau * a.mau;
        return new PhanSo(tuMoi, mauMoi);
    }

    public PhanSo chia(PhanSo a) {
        if (a.tu == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0.");
        }
        return new PhanSo(this.tu * a.mau, this.mau * a.tu);
    }

    public PhanSo cong(int a) {
        return new PhanSo(this.tu + a * this.mau, this.mau);
    }

    public PhanSo tru(int a) {
        return new PhanSo(this.tu - a * this.mau, this.mau);
    }

    public PhanSo nhan(int a) {
        return new PhanSo(this.tu * a, this.mau);
    }

    public PhanSo chia(int a) {
        if (a == 0) {
            throw new ArithmeticException("Không thể chia cho 0.");
        }
        return new PhanSo(this.tu, this.mau * a);
    }

}
