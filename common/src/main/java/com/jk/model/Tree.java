package com.jk.model;



import java.io.Serializable;
import java.util.List;


public class Tree implements Serializable {

    private static final long serialVersionUID = 22L;


    private Integer id;

    private String text;

    private Integer pid;

    private String url;


    //异步树状态字段
    private String state;

    /**
     * 子节点集合
     */
    private List nodes;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List getNodes() {
        return nodes;
    }

    public void setNodes(List nodes) {
        this.nodes = nodes;
    }
}
