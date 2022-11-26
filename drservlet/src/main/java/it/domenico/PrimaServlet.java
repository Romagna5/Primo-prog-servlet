package it.domenico;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<html>\r\n"
        		+ "    <head>\r\n"
        		+ "        <title>Portfolio</title>\r\n"
        		+ "    </head>\r\n"
        		+ "    <body>\r\n"
        		+ "        <center>\r\n"
        		+ "            <table>\r\n"
        		+ "                <tr>\r\n"
        		+ "                    <th>\r\n"
        		+ "                        <h1>Benvenuti</h1>\r\n"
        		+ "                    </th>\r\n"
        		+ "                </tr>\r\n"
        		+ "                <tr>\r\n"
        		+ "                    <td>\r\n"
        		+ "                        <center>\r\n"
        		+ "                            <a href=\"\">HOME |</a>\r\n"
        		+ "                            <a href=\"\">CHI SONO |</a>\r\n"
        		+ "                            <a href=\"\">SERVIZI |</a>\r\n"
        		+ "                            <a href=\"\">CONTATTI</a>\r\n"
        		+ "                        </center>\r\n"
        		+ "                    </td>\r\n"
        		+ "                </tr>\r\n"
        		+ "                <tr>\r\n"
        		+ "                    <td>\r\n"
        		+ "                        <center>\r\n"
        		+ "                            Se cercate un programmatore siete nel posto giusto.<br>\r\n"
        		+ "                            <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGg0PHcJdQg-OQbAfUs_cVJfaHy5HYcdsD4A&usqp=CAU\" width=500px>\r\n"
        		+ "                        </center>\r\n"
        		+ "                    </td>\r\n"
        		+ "                </tr>\r\n"
        		+ "                <tr>\r\n"
        		+ "                    <td>\r\n"
        		+ "                        <center>\r\n"
        		+ "                            COPYRIGHT 2022-2025 BY DOMENICO ROMAGNA\r\n"
        		+ "                        </center>\r\n"
        		+ "                    </td>\r\n"
        		+ "                </tr>\r\n"
        		+ "            </table>\r\n"
        		+ "        </center>\r\n"
        		+ "    </body>\r\n"
        		+ "</html>");		 
        w.flush();
        w.close();
    }
	
	
}
