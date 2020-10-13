package lt.verbus.threads;

import lt.verbus.logger.MockSession;

public class ThreadedOpenSession extends Thread{

    final MockSession session;

    public ThreadedOpenSession(MockSession session) {
        this.session = session;
    }

    @Override
    public void run(){
        synchronized (session){
            session.open(5);
        }
    }

}