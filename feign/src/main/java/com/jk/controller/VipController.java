package com.jk.controller;



import com.jk.model.Tree;
import com.jk.model.Vip;
import com.jk.service.VipServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController

public class VipController {

    @Autowired
    private VipServiceFeign vipServiceFeign;

    @RequestMapping("findBootstrap")
    @ResponseBody
    public HashMap<String, Object> findBootstrap(Integer start, Integer pageSize){
        HashMap<String, Object> map =vipServiceFeign.findBootstrap(start,pageSize);
        return map;
    }

    //打开新增弹框 或者 修改回显
    @RequestMapping("findBootDialogById/{id}")

    public ModelAndView findBootDialogById(@PathVariable String id, ModelMap modelMap){
        Vip vip = vipServiceFeign.findBootDialogById(id);
        ModelAndView mv = new ModelAndView("bootStarpDialog");
        mv.addObject(vip);

        System.out.println("将主分支合并到dev");
        return mv;
    }

    @RequestMapping("save")
    public void save(Vip vip){
        vipServiceFeign.save(vip);

    }

    @RequestMapping("update")
    public void update(Vip vip){
        vipServiceFeign.update(vip);

    }


    @RequestMapping("delete")
    @ResponseBody
    public void deleteGname(@RequestParam(value="ids")String ids){
        String[] idss = ids.split(",");
        for (String id : idss) {
            vipServiceFeign.delOne(id);

        }

    }





    //测试框架
    @GetMapping("getNews")
    public String getNews(){
        return vipServiceFeign.getNews();
    }



    //同步树
    @RequestMapping("getTree")
    @ResponseBody
    public List<Tree> getTree(){
        Integer id = 666;
        List<Tree>  treeNode = treeNode(id);
        return treeNode;
    }

    private List<Tree> treeNode(Integer id) {
        //根据id查询子节点
        List<Tree>  treeList = vipServiceFeign.queryTreeNode(id);
        //for循环得到每一个id值  作为下一次查询pid的条件
        for (Tree treeBean : treeList) {
            Integer id2 = treeBean.getId();
            List<Tree> treeNode = treeNode(id2);
            treeBean.setNodes(treeNode);
        }
        return treeList;
    }



}
