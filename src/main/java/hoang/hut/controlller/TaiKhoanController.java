package hoang.hut.controlller;

import hoang.hut.entities.*;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/taikhoan")
public class TaiKhoanController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap mm) {
		mm.put("tk", new TaiKhoan());
		return "taikhoan/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute(value = "tk") TaiKhoan tk1, ModelMap mm,
			HttpSession session) {
		if (tk1.getUsername().equals("triphan")
				&& tk1.getPassword().equals("123")) {
			session.setAttribute("username", tk1.getUsername());
			return "taikhoan/welcome";
		} else {
			mm.put("message", "Tai khoan khong hop le<br>");
			return "taikhoan/login";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:login";
	}

}
