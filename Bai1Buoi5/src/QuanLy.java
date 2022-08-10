import java.util.Scanner;

public class QuanLy {
    private static Scanner scanner = new Scanner(System.in);
    private String maQL;
    private String hoTen;

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Input() {
        System.out.print("Nhap ma quan ly: ");
        maQL = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
    }

    public void Output() {
        System.out.println("Ma quan ly: " + maQL);
        System.out.println("Ho ten: " + hoTen);
    }
}
