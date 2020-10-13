package lt.verbus.util;

import lt.verbus.logger.MockSession;
import lt.verbus.threads.ThreadedOpenSession;

public class SessionFactoryUtil {

    private static MockSession session;

    public static MockSession getSession() {
        if (session == null) {
            session = new MockSession();

            Runnable sessionRunnable = () -> {
                synchronized (session){
                    session.open(5);
                }
            };

            if (!session.isOpen()) {
                new Thread(sessionRunnable).start();
            }
        }
        return session;
    }

    public static MockSession getSession2() {
        if (session == null) {
            session = new MockSession();

            if (!session.isOpen()) {
                new ThreadedOpenSession(session).start();
            }

        }
        return session;
    }


}
