package no.satyam.ocp.chap1;

/**
 *
 * @author satyam
 */
public class CallingPrivateInnerInterface {
    PrivateInnerInterfaceDemo demo = new PrivateInnerInterfaceDemo();
    
    public void test(){
        PrivateInnerInterfaceDemo.DontTell donttell= demo.new DontTell();
        donttell.ssh();
        
    }
    
    public static void main(String[] args) {
        new CallingPrivateInnerInterface().test();
    }
}

