package lt.verbus;

import lt.verbus.dao.SaverDao;

class Main {
    public static void main(String[] args) throws InterruptedException {
        SaverDao dao = new SaverDao();
        dao.save2();
        System.out.println("Do GUI stuff");
    }
}
