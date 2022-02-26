package com.tc.sp.domain;

import java.util.List;
import java.util.Map;

public class Domain {
    private int id;

    private String title;

    private List<String> list;

    private Map<Integer, String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public Domain() {
    }

    public Domain(String title) {
        System.out.println("constructor set");
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("setTitle set");
        this.title = title;
    }
}
