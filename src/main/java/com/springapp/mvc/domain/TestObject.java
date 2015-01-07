package com.springapp.mvc.domain;

/**
 * Created by han on 2015-01-07.
 */


public class TestObject {

    private Integer id;
    private String name;
    private String comment;

    public TestObject(Integer id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
