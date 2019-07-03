package com.jk.service;

import com.jk.mapper.VipMapper;
import com.jk.model.Tree;
import com.jk.model.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class VipServiceImpl  implements VipService {

    @Autowired
    private VipMapper vipMapper;




    @Override

    public String getNews() {


        return "到地方了";
    }

    @Override
    @PostMapping("getTree/{id}")
    public List<Tree> queryTreeNode(@PathVariable(value = "id") Integer id) {
        return vipMapper.queryTreeNode(id);
    }

    @Override
    @GetMapping("findBootstrap/{start}/{pageSize}")
    public HashMap<String, Object> findBootstrap(@PathVariable(value = "start")Integer start, @PathVariable(value = "pageSize")Integer pageSize) {
        HashMap<String,Object> mapp = new HashMap<String,Object>();

        Long total = vipMapper.queryCount( start,  pageSize);


        List<Vip> list = vipMapper.queryVip( start,  pageSize );

        mapp.put("rows",list);
        mapp.put("total",total);

        return  mapp;
    }

    @Override

    @GetMapping("findBootstrap/{id}")
    public Vip findBootDialogById(@PathVariable(value = "id")String id) {

        return vipMapper.findBootDialogById(id);
    }

    @Override
    @PostMapping ("save")
    public void save(@RequestBody Vip vip) {
        vipMapper.save(vip);

    }

    @Override
    @GetMapping("delete/{id}")
    public void delOne(String id) {

        vipMapper.delOne(id);
    }

    @Override
    @PostMapping("update")
    public void update(@RequestBody Vip vip) {

        vipMapper.update(vip);

    }
}
