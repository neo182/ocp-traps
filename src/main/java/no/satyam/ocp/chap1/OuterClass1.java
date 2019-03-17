package no.satyam.ocp.chap1;

/**
 *
 * @author satyam
 */
public class OuterClass1 {

    private String greetings = "Hi";

    protected class Inner {

        protected int count ;

        public void printGreetings() {
            System.out.println(greetings);
        }
    }
    
    public void callInner(){
        Inner inner = new Inner();
        inner.printGreetings();
    }
    
    public static void main(String[] args) {
        OuterClass1 clazz = new OuterClass1();
        clazz.callInner();
    }
}
