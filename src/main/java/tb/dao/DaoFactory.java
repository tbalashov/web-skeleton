package tb.dao;

//todo: make it interface instead class
public class DaoFactory {
    private static DaoFactory instance = new DaoFactory();
    private UserDao userDao = new UserDao();

    public static DaoFactory getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
