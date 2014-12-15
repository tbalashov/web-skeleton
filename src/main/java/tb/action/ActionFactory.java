package tb.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private Map<String, Action> actions;

    public ActionFactory() {
        actions = new HashMap<>();

        // todo: load from config
        actions.put("GET/", new ShowPageAction("welcome"));
        actions.put("GET/login", new ShowPageAction("login"));
        actions.put("POST/login", new LoginAction());
        actions.put("GET/logout", new LogoutAction());
        actions.put("GET/home", new ShowPageAction("home"));
    }

    public Action getAction(String actionName) {
        return actions.get(actionName);
    }
}
