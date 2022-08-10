public class KiemTraSNT {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
      return true;
    }
    public static boolean isPrime(long n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return true;
    }
    public static boolean isPrime(float n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return true;
    }
    public static boolean isPrime(double n){
        if(n<2){
            return false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Kieu int: ");
        System.out.println(isPrime(7));
        System.out.print("Kieu long: ");
        System.out.println(isPrime(10));
        System.out.print("Kieu float: ");
        System.out.println(isPrime(5));
        System.out.print("Kieu double: ");
        System.out.println(isPrime(12));

    }
}
