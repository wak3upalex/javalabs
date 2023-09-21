public class AnnotatedMethods {
    public void publicMethod1(String message) {System.out.println("publicMethod1: " + message);}
    public void publicMethod2(String message) {System.out.println("publicMethod2: " + message);}
    @Repeat(2)
    protected void protectedMethod1(int number) {System.out.println("protectedMethod1: " + number);}
    protected void protectedMethod2(int number) {System.out.println("protectedMethod2: " + number);}

    @Repeat(4)
    private void privateMethod1(double value) {System.out.println("privateMethod1: " + value);}
    private void privateMethod2(double value) {System.out.println("privateMethod2: " + value);}
}
