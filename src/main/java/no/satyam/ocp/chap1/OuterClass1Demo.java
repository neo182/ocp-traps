package no.satyam.ocp.chap1;

/**
 *
 * @author satyam
 */
public class OuterClass1Demo {
    public static void main(String[] args) {
        System.out.println("Printing greetings from Outerclass");
        OuterClass1 clazz = new OuterClass1();
        clazz.callInner();
        
        System.out.println("Now printing greetings directly from innerclass");
        OuterClass1.Inner inner = clazz.new Inner();
        inner.printGreetings();
        System.out.println("Count : " + inner.count);
    }
}
