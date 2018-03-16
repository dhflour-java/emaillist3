package kr.co.dhflour.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.dhflour.emaillist.dao.EmailListDao;
import kr.co.dhflour.emaillist.vo.EmailListVo;

@Controller
public class EmailListController {
	
	@Autowired
	private EmailListDao emailListDao;
	
	@RequestMapping( "/list" )
	public String list(Model model) {
		
		List<EmailListVo> list = emailListDao.fetchList();
		model.addAttribute( "list", list );
		
		return "/WEB-INF/views/list.jsp";
	}
}
