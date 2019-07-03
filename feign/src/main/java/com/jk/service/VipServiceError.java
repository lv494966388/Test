package com.jk.service;


import com.jk.model.Tree;
import com.jk.model.Vip;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/error")
@Component
public class VipServiceError implements  VipServiceFeign {

    private static final String GET_NEWS_FLAG = "网络异常";


    @Override
    public String getNews() {
        return GET_NEWS_FLAG;
    }

    @Override
    public List<Tree> queryTreeNode(Integer id) {
        return null;
    }

    @Override
    public HashMap<String, Object> findBootstrap(Integer start, Integer pageSize) {
        return null;
    }

    @Override
    public Vip findBootDialogById(String id) {
        return null;
    }

    @Override
    public void save(Vip vip) {

    }

    @Override
    public void delOne(String id) {

    }

    @Override
    public void update(Vip vip) {

    }
}
