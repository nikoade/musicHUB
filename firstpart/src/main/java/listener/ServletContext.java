package listener;
        import dao.AccountManager;
        import javax.servlet.ServletContextEvent;
        import javax.servlet.ServletContextListener;
        import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContext implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AccountManager accManager = AccountManager.getInstance();
        sce.getServletContext().setAttribute("accountManager", accManager);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {}
}
