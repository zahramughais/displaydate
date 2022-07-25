package com.zahra.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {

	@RequestMapping("")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String datedisplay(Model model) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE, 'the' dd 'of' MMMM, yyyy");
        String stringDate = dateFormat.format(date);
		model.addAttribute("date", stringDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String timedisplay(Model model) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
        String stringTime = dateFormat.format(date);
		model.addAttribute("time", stringTime);
		return "time.jsp";
	}
}
