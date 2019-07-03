package com.jk.service;

import com.jk.model.Tree;
import com.jk.model.Vip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;

public interface VipService {

    @GetMapping("getNews")
    public String getNews();



    @PostMapping ("getTree/{id}")
    List<Tree> queryTreeNode(@PathVariable(value = "id") Integer id);



    @GetMapping("findBootstrap/{start}/{pageSize}")
    HashMap<String, Object> findBootstrap(@PathVariable(value = "start")Integer start, @PathVariable(value = "pageSize")Integer pageSize);


    @GetMapping("findBootstrap/{id}")
    Vip findBootDialogById(@PathVariable(value = "id")String id);


    @PostMapping ("save")
    void save(Vip vip);


    @GetMapping("delete/{id}")

    void delOne(@PathVariable(value = "id")String id);


    @PostMapping ("update")
    void update(Vip vip);
}
