package web;

import model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SelectBeer", value= {"/SelectBeer.do"})
public class BeerSelect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String c = req.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        //out.println("Beer Selection Advice<br>");
        //Iterator it = result.iterator();
        //while(it.hasNext()) {
        //out.print("<br>try: " + it.next());

        req.setAttribute("styles", result);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        //Use the request dispatcher to ask the Container to crank up the JSP, sending it the request and response.
        view.forward(req, resp);
    }
}
