package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/fileUploadSerlvlet")
public class fileUploadSerlvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("title:" + title + ", content: " + content);
//		
//		new MultipartRequest(request, "", 0, "", new DefaultFileRenamePolicy());

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");	
		String saveDir = "upload";
		saveDir = getServletContext().getRealPath(saveDir);
		int maxSize = 1024 * 1024 * 10;
		String encoding = "UTP-8";
		// multipart 요청.
		// request, 저장위치, 최대사이즈, 인코딩, 리네임정책(서버에 똑같은 이름으 ㅣ파일이 있으면 업로드한 이름으 ㅣ파일을 새로 지정해줌)
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		title = multi.getParameter("title");
		content= multi.getParameter("content");
		String profile = multi.getOriginalFileName("profile");
		String fileName=multi.getFilesystemName("profile");
		System.out.println("title1 : " + title + ",cocten:" + content + ", profile" + profile + ", fileName :" + fileName );
	}

}
