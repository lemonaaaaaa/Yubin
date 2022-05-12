package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.vo.BookVO;



public class RemoveBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("result/removeOutput.jsp").forward(request, response);
		
		if (BookVO.isEmpty()) {
			request.setAttribute("error", "모든 항목을 입력하세요!");
			request.getRequestDispatcher("memberView/memberDelete.jsp").forward(request, response);
		}
		

	}

}
