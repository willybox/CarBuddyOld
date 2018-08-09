package fr.carbuddyweb.servlet;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;

import fr.carbuddy.bean.Driver;
import util.library.add.on.date.AddOnDate;

public class ProfileDriverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException{
    	Driver d = new Driver();
    	d.setFirstname("Harold");
    	d.setName("FEVE");
    	
        DateTime dt = new DateTime(1990, 8, 9, 0, 0);
        d.setBirthday(dt.toDate());
        
        request.setAttribute("driverAge", AddOnDate.getAge(d.getBirthday()));

    	request.setAttribute( "driver", d );
    	Locale locale = new Locale("fr", "FR");
    	ResourceBundle rb = ResourceBundle.getBundle("resources.msg", locale);
    	request.setAttribute("title1", rb.getString("title1"));
    	
		this
			.getServletContext()
			.getRequestDispatcher("/WEB-INF/ProfileDriver.jsp")
			.forward(request, response);
    }

}
