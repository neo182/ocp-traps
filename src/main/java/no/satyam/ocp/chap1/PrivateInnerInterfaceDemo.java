package no.satyam.ocp.chap1;

/**
 *
 * @author satyam
 */
public class PrivateInnerInterfaceDemo {
    protected interface Secret{
        void ssh();
    }
    
    public class DontTell implements Secret{
        @Override
        public void ssh(){
            System.out.println("Shh...");
        }
    }
    
    public void callDontTell(){
        DontTell dontTell = new DontTell();
        dontTell.ssh();
    }
    
    public static void main(String[] args) {
        new PrivateInnerInterfaceDemo().callDontTell();
        
    }
}
