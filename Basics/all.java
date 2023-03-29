public class all {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;
        
        int result = c-b*a/c+a-b; //The compiler go from left to right it will find * and / first and first these operation will get executed//
        System.out.println(result);
    }
    
}
