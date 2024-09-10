package com.ucb.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowService {
    List<WorkFlow> list = new ArrayList<>();

    public List obtainList() {
        return this.list;
    }

    public void create(WorkFlow workflow) {
        list.add(workflow);
    }

}