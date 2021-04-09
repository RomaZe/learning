public class Main {
    public static void main(String[] args) {
        Records rc1 = new Records();
        Records rc2 = new Records();

        System.out.println("Compare two Record objects: " + rc1.equals(rc2));

        Records rc3 = new Records("ABCDE");
        Records rc4 = new Records("ABCDE");
        System.out.println("Compare two Record objects with the same fields: " + rc3.equals(rc4));
        System.out.println("Compare two Record objects by the field: " + rc3.equals(rc4));
    }


}
