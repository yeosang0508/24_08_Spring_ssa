
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MemberService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Member;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserMemberController {

	@Autowired
	private Rq rq;

	@Autowired
	private MemberService memberService;

	

	@RequestMapping("/user/member/join")
	public String showJoin(HttpServletRequest req) {

		return "/user/member/join";
	}

	@RequestMapping("/user/member/doJoin")
	@ResponseBody
	public String doJoin(HttpServletRequest req, String loginId, String loginPw, String name, String nickname,
			String cellphoneNum, String email) {

		if (Ut.isEmptyOrNull(loginId)) {
			return Ut.jsHistoryBack("F-1", "loginId 입력 x");
		}
		if (Ut.isEmptyOrNull(loginPw)) {
			return Ut.jsHistoryBack("F-2", "loginPw 입력 x");
		}
		if (Ut.isEmptyOrNull(name)) {
			return Ut.jsHistoryBack("F-3", "name 입력 x");
		}
		if (Ut.isEmptyOrNull(nickname)) {
			return Ut.jsHistoryBack("F-4", "nickname 입력 x");
		}
		if (Ut.isEmptyOrNull(cellphoneNum)) {
			return Ut.jsHistoryBack("F-5", "cellphoneNum 입력 x");
		}
		if (Ut.isEmptyOrNull(email)) {
			return Ut.jsHistoryBack("F-6", "email 입력 x");
		}

		ResultData joinRd = memberService.join(loginId, loginPw, name, nickname, cellphoneNum, email);

		if (joinRd.isFail()) {
			return Ut.jsHistoryBack(joinRd.getResultCode(), joinRd.getMsg());
		}

		Member member = memberService.getMemberById((int) joinRd.getData1());

		return Ut.jsReplace(joinRd.getResultCode(), joinRd.getMsg(), "../home/main");
	}

}
