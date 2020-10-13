package lt.verbus.dao;

import lt.verbus.logger.MockSession;
import lt.verbus.threads.ThreadedSave;
import lt.verbus.util.SessionFactoryUtil;

public class SaverDao {

    public SaverDao() {
    }

    public void save() {
        MockSession session = SessionFactoryUtil.getSession();
        Runnable sessionRunnable = () -> {
            synchronized (session){
                session.save();
            }
        };
        new Thread(sessionRunnable).start();
    }

    public void save2() {
        MockSession session = SessionFactoryUtil.getSession();
        new ThreadedSave(session).start();
    }

}
