package com.springapp.mvc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.util.MatcherAssertionErrors.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"/spring/mvc-dispatcher-servlet.xml","/spring/testContext.xml"})
public class WebTests {
    private MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void getJsonStringIncludeKoreanFromRequestBody() throws Exception {

        String expect = "[{\"id\":1,\"name\":\"name1\",\"comment\":\"첫번째\"},{\"id\":2,\"name\":\"name2\",\"comment\":\"두번째\"},{\"id\":3,\"name\":\"name3\",\"comment\":\"세번째\"},{\"id\":4,\"name\":\"name4\",\"comment\":\"네번째\"},{\"id\":5,\"name\":\"name5\",\"comment\":\"다섯번째\"},{\"id\":6,\"name\":\"name6\",\"comment\":\"여섯번째\"},{\"id\":7,\"name\":\"name7\",\"comment\":\"일곱번째\"},{\"id\":8,\"name\":\"name8\",\"comment\":\"여덟번째\"},{\"id\":9,\"name\":\"name9\",\"comment\":\"아홉번째\"},{\"id\":10,\"name\":\"name10\",\"comment\":\"열번째\"}]";

        MvcResult result = mockMvc.perform(get("/test/json"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();

        String content = result.getResponse().getContentAsString();

        assertThat(content, is(expect));
    }
}