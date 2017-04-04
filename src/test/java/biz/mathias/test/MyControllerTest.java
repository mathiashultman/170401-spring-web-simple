package biz.mathias.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import biz.mathias.controllers.MyController;

public class MyControllerTest {

	@Test
	public void test() throws Exception{
		MyController myController=new MyController();
		MockMvc mockMvc=MockMvcBuilders.standaloneSetup(myController).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));
	}
}
