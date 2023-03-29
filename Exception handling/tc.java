public class tc {
    public static void main(String[] args) {
        int[] arr = new int[4];

        try {
            arr[5] = 10;
        } catch(Exception e) {
            System.out.println("something happ...");
        }
    }
}
