import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCaculator", urlPatterns = "/cal")
public class ServletCaculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String op = request.getParameter("operator");
        int firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
        int secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
        Caculator calculator;

        if (op.equals("+")) {
            calculator = new Caculator(new AddOperand());
        } else {
            calculator = new Caculator(new SubOperand());
        }

        int result = calculator.execute(firstNumber, secondNumber);
        request.setAttribute("result", result);
        request.setAttribute("firstNumber", firstNumber);
        request.setAttribute("secondNumber", secondNumber);
        RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
        dis.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
