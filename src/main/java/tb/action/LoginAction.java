package tb.action;

import tb.dao.DaoFactory;
import tb.dao.UserDao;
import tb.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction implements Action {

    private ActionResult home = new ActionResult("home", true);
    private ActionResult loginAgain = new ActionResult("login");

    @Override
    public ActionResult execute(HttpServletRequest req, HttpServletResponse resp) {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        //todo: use service instead dao
        UserDao userDao = DaoFactory.getInstance().getUserDao();

        //todo: use salted hash instead password
        User user = userDao.findByCredentials(login, password);

        if (user != null) {
            req.getSession().setAttribute("user", user);
            return home;
        } else {
            req.setAttribute("loginError", "login or password incorrect");
            return loginAgain;
        }

    }
}
