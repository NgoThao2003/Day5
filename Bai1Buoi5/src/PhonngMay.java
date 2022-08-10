import java.util.Scanner;

public class PhonngMay {
    private static Scanner scanner = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x = new QuanLy();
    private May y = new May();

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May getY() {
        return y;
    }

    public void setY(May y) {
        this.y = y;
    }

    public void Input() {
        System.out.println("***Nhap thong tin phong may");
        System.out.print("Nhap ma phong: ");
        maPhong = scanner.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong = scanner.nextLine();
        System.out.print("Nhap dien tich: ");
        dienTich = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("***Nhap thong tin quan ly");
        x.Input();
        System.out.println("***Nhap thong tin may");
        y.Input();
    }

    public void Output() {
        System.out.println("***Thong tin phong may");
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("***Thong tin quan ly");
        x.Output();
        System.out.println("***Thong tin may");
        y.Output();
    }

    public static void main(String[] args) {
        PhonngMay a = new PhonngMay();
        a.Input();
        a.Output();
    }
}
