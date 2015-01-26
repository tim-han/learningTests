package com.springapp.mvc;

import com.springapp.mvc.domain.TestObject;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.util.MatcherAssertionErrors.assertThat;

/**
 * Created by han on 2015-01-07.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration("/spring/applicationContext.xml")
public class LearningTest {

    @Test
    public void testJackson() throws Exception {
        List<TestObject> testObjects = new ArrayList<TestObject>();

        TestObject testObject1 = new TestObject(1,"name1","첫번째");
        TestObject testObject2 = new TestObject(2,"name2","두번째");
        TestObject testObject3 = new TestObject(3,"name3","세번째");
        TestObject testObject4 = new TestObject(4,"name4","네번째");
        TestObject testObject5 = new TestObject(5,"name5","다섯번째");
        TestObject testObject6 = new TestObject(6,"name6","여섯번째");
        TestObject testObject7 = new TestObject(7,"name7","일곱번째");
        TestObject testObject8 = new TestObject(8,"name8","여덟번째");
        TestObject testObject9 = new TestObject(9,"name9","아홉번째");
        TestObject testObject10 = new TestObject(10,"name10","열번째");

        testObjects.add(testObject1);
        testObjects.add(testObject2);
        testObjects.add(testObject3);
        testObjects.add(testObject4);
        testObjects.add(testObject5);
        testObjects.add(testObject6);
        testObjects.add(testObject7);
        testObjects.add(testObject8);
        testObjects.add(testObject9);
        testObjects.add(testObject10);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(testObjects);

        String expect = "[{\"id\":1,\"name\":\"name1\",\"comment\":\"첫번째\"},{\"id\":2,\"name\":\"name2\",\"comment\":\"두번째\"},{\"id\":3,\"name\":\"name3\",\"comment\":\"세번째\"},{\"id\":4,\"name\":\"name4\",\"comment\":\"네번째\"},{\"id\":5,\"name\":\"name5\",\"comment\":\"다섯번째\"},{\"id\":6,\"name\":\"name6\",\"comment\":\"여섯번째\"},{\"id\":7,\"name\":\"name7\",\"comment\":\"일곱번째\"},{\"id\":8,\"name\":\"name8\",\"comment\":\"여덟번째\"},{\"id\":9,\"name\":\"name9\",\"comment\":\"아홉번째\"},{\"id\":10,\"name\":\"name10\",\"comment\":\"열번째\"}]";

        assertThat(jsonStr,is(expect));
    }
}
