package com.jk.mapper;


import com.jk.model.Tree;
import com.jk.model.Vip;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VipMapper {


    List<Tree> queryTreeNode(Integer id);

    Long queryCount(Integer start, Integer pageSize);

    List<Vip> queryVip(Integer start, Integer pageSize);

    Vip findBootDialogById(String id);

    void save(Vip vip);

    void delOne(String id);

    void update(Vip vip);
}
