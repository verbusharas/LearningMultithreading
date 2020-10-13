package lt.verbus.threads;

import lt.verbus.logger.MockSession;

public class ThreadedSave extends Thread{

    final MockSession session;

    public ThreadedSave(MockSession session) {
        this.session = session;
    }

    @Override
    public void run(){
        synchronized (session){
            session.save();
        }
    }

}
