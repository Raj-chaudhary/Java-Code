public class TypeCasting {
    public static void main(String[] args) {
        float a = 25.12f;
        // int b = a;
        int b = (int) a; // lossy conversion
        System.out.println(b);
    }
}
