 
package com;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CalculatorServlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
int result = 0;
try {
String number1 = req.getParameter("num1");
String number2 = req.getParameter("num2");
String operator = req.getParameter("op");
int x = Integer.parseInt(number1);
int y = Integer.parseInt(number2);
if(operator.equals("+")) {
result = x + y;
}
else if(operator .equals("-")) {
result = x - y;
}
else if(operator.equals("*")) {
result = x * y;
}
else if(operator.equals("/")) {
result = x/y;
}
PrintWriter p = res.getWriter();
p.println("<h1> Result= "+result);
}
catch(Exception e) {}
}
}
 