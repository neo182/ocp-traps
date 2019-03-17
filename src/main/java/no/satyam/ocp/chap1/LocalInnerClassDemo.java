package no.satyam.ocp.chap1;

/**
 *
 * @author satyam
 */
public class LocalInnerClassDemo {

    //this is "effectively" final
    private int len = 5;

    public void calculate() {
        final int width = 10;
        
        //final class Inner is also allowed
        class Inner {
            //the method has access to all type of access modifier specified in this method
            void multiply() {
                System.out.println(len * width);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        new LocalInnerClassDemo().calculate();
    }
}
