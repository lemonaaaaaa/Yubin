package co.dev.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemeberListJson implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("test/json;charset=UTF-8");

		boolean isMulti = ServletFileUpload.isMultipartContent(request);
		
		if(isMulti) { //멀티파트 요청
			
			String id = request.getParameter("id");
			String ps = request.getParameter("passwd");
			String nm = request.getParameter("name");
			String em = request.getParameter("email");
			String pf = request.getFilesystemName("profile"); //이 저장위치에 업로드
		
		}else { //key = value&key1=value1..
		
			
		
			
		}
		
		
	}
	
	
}
		MemberService service = new MemberService();
		List<MemberVO> list = service.memberList();

		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
	}
 //i have to be look like to writing something 
	//and i'm so angry now actually. so so angry.
	//I noghchytoda jigyum what professor doing now and i feel confuse
	//suifal
}
