package exceptions;

public class ExceptionHandling {
    public ExceptionHandling() {};

    public void testMethod(int i, int j) {
        try {
            int result = i / (j - 2);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
