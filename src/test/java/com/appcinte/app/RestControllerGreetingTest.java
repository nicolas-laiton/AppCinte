package com.appcinte.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.appcinte.app.restcontroller.RestControllerGreetings;
@RunWith(SpringRunner.class)
@WebMvcTest(RestControllerGreetings.class)
public class RestControllerGreetingTest {

	  @Autowired
	   private MockMvc mvc;

	   @MockBean
	   private RestControllerGreetings restControllerGreetings;

	@Test
	public void Greeting() {
		List<String> nombre = Collections.singletonList("Kevin");
		given(RestControllerGreetings.Greeting(nombre.get(0))).willReturn("Hola Kevin !");
		
	}
}
