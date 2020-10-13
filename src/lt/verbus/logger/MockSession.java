package lt.verbus.logger;

public class MockSession {

    private int counter;
    private boolean isOpen = false;

    public MockSession() {
        counter = 0;
    }

    public void open(int duration){
        for (int i = 0; i < duration; i++) {
            System.out.println("[SESSION] Opening session... " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOpen = true;
        System.out.println("[SESSION] Session OPENED.");
    }

    public void save(){
        System.out.println("[SESSION] - - - saved");
    }

    public boolean isOpen(){
        return isOpen;
    }

}
