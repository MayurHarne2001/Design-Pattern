public class Main {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOs("Android").setRam(16).getPhone();
        System.out.println(p);
    }
}