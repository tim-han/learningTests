package com.springapp.mvc;

import com.springapp.mvc.domain.TestObject;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by han on 2015-01-07.
 */


@Controller
public class JsonController {

    @RequestMapping(value = "/test/json",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getJsonStr() throws IOException {
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

        return jsonStr;
    }

}
