package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sampleTest")
public class SampleTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SampleTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/sample.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 文字化けしないように文字コードを設定。
		String param = request.getParameter("param"); // JSPのname属性を設定した入力値を取得する。;;
		request.setAttribute("param", param); // JSPに渡すためにparamという変数に設定する
		request.getRequestDispatcher("/WEB-INF/view/sample.jsp").forward(request, response);
	}

}
