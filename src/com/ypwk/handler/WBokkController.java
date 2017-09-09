package com.ypwk.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ypwk.service.WbokkService;
import com.ypwk.util.SignUtil;

@Controller
@RequestMapping(value="/wbokk")
public class WBokkController {

	@Autowired
	WbokkService wbokkService;
	@RequestMapping(method = RequestMethod.GET)
	public void getBokkFromWeixin(HttpServletRequest request, HttpServletResponse resp) {

		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");

		PrintWriter out = null;
		try {
			out = resp.getWriter();
			if (SignUtil.checkSignature(signature, timestamp, nonce)) {
				out.print(echostr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
			out = null;
		}
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void postBokkFromWeixin(HttpServletRequest request, HttpServletResponse resp) {
		try {  
            request.setCharacterEncoding("UTF-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
		resp.setCharacterEncoding("UTF-8");
		String respMessage = wbokkService.processRequest(request);  
		// 响应消息  
        PrintWriter out = null;  
        try {  
            out = resp.getWriter();  
            out.print(respMessage);  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            out.close();  
            out = null;  
        }  
	}
}
