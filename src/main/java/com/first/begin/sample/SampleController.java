package com.first.begin.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
//	'/sample.bgn' URL을 요청받으면 sample.jsp를 보여준다

	@RequestMapping("/sample.bgn")
	public String sampleView() {
		return "sample";
	}
}
