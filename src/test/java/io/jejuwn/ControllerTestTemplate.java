package io.jejuwn;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import io.jejuwn.controller.AddressController;
import io.jejuwn.mapper.AddressMapper;
import io.jejuwn.service.AddressServiceImpl;
import lombok.extern.log4j.Log4j2;

@AutoConfigureMockMvc
//@ContextConfiguration
@WebMvcTest(AddressController.class)
@Log4j2
//@AutoConfigureMybatis
@Import({AddressServiceImpl.class})
public class ControllerTestTemplate {
	
	//@Test
	void contextLoads() {
	}
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	void testGetList() throws Exception{
		getList();
	}
	
	void getList() throws Exception{
		MvcResult result = mvc.perform(MockMvcRequestBuilders
				.get("/address/list")
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
		
		String resultController = result.getResponse().getContentAsString();
		assertNotNull(resultController);
		log.info(resultController);
	}

}
