package com.first.begin.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class MemberControllerTests {
	
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMCV;
	
	@Before
	public void setup() {
		this.mockMCV = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
	public void testList() throws Exception{
		System.out.println(mockMCV.perform(MockMvcRequestBuilders.get("member/list"))
				.andReturn().getModelAndView().getModelMap());
	}
}
