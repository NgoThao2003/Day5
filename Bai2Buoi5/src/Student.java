import java.util.Scanner;

public class Student {
    private static Scanner scanner = new Scanner(System.in);
    private static int tg = 1;
    private int id;
    private String name;
    private int age;
    private static int n;
    private Address address = new Address();

    public Student() {
        id = tg++;
    }

    public void Input() {
        scanner.nextLine();
        System.out.print("Nhap name: ");
        name = scanner.nextLine();
        System.out.print("Nhap age: ");
        age = scanner.nextInt();
        address.Input();
    }

    public void Output() {
        System.out.print("\nid: " + id);
        System.out.print("\nName: " + name);
        System.out.print("\nAge: " + age);
        address.Output();
    }

    public static void main(String[] args) {
        System.out.print("Nhap so luong sinh vien: ");
        n = scanner.nextInt();

        Student a[] = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien: " + (i + 1));
            a[i].Input();
        }

        int x;
        do{
            System.out.print("Moi ban nhap lua chon: ");
            x = scanner.nextInt();
        }while(x<=0 || x>=5);
        switch (x) {
            case 1:
                for (int i = 0; i < n; i++) {
                    System.out.print("\nXuat thong tin sinh vien: " + (i + 1));
                    a[i].Output();
                }
                break;

            case 2:
                System.out.print("Nhap id can tim: ");
                int y;
                y = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    if(a[i].id==y){
                        System.out.print("Thong tin sinh vien co id ban tim");
                        a[i].Output();
                    }
                }
                break;

            case 3:
                for(int i=0; i<n; i++){
                    if(a[i].address.getProvince().equals("Thanh Hoa")){
                        a[i].address.setProvince("Hai Phong") ;
                        a[i].Output();
                    }
                }
                break;
            case 4:
                int z;
                System.out.print("Nhap id can xoa: ");
                z = scanner.nextInt();
                for(int i=z-1; i<n-1; i++){
                    a[i]=a[i+1];
                    i--;
                    n--;
                    break;
                }
                for(int i=0; i<n; i++){
                    a[i].Output();
                }
                Student b[] = new Student[n-1];
                break;
        }
    }
}
