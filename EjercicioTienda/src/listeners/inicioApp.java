package listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Hashtable;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class inicioApp
 *
 */
@WebListener
public class inicioApp implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public inicioApp() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	ServletContext contexto=arg0.getServletContext();
		File f = new File(arg0.getServletContext().getRealPath("")+"usuarios.dat");
		
			try {
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
				Hashtable<String, String> aux;
				
					aux = (Hashtable<String, String>) ois.readObject();
				
				contexto.setAttribute("tabla", aux);
				System.out.println("objeto subido");
				
				
				

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Clase no encontrada");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error E/S");
			}
    }
	
}
