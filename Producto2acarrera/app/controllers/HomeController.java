package controllers;

import java.util.List;

import models.Cliente;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	List<Cliente> cliente = Cliente.listadoCliente();
    	cliente.get(2);
        return ok(views.html.index.render(Cliente.listadoCliente()));
    }

}
