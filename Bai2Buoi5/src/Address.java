import java.util.Scanner;

public class Address {
    private static int temp =1;
    private int id;
    private static Scanner scanner = new Scanner(System.in);
    private String district;
    private String province;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Address(){
        id = temp++;
    }
    public void Input(){
        System.out.print("Nhap district: ");
        district = scanner.nextLine();
        System.out.print("Nhap province: ");
        province = scanner.nextLine();
    }
    public void Output(){
        System.out.println("\nId = "+id);
        System.out.println("District: "+ district);
        System.out.println("Province: "+province);
    }
}
