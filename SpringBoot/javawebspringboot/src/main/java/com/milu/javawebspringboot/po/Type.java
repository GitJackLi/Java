package com.milu.javawebspringboot.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther Jack
 * @Date 2020/7/27
 */
@Entity
@Table(name = "t_type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;

    @OneToMany(mappedBy = "type")
    private List<News> newsList =new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public Type() {
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", newsList=" + newsList +
                '}';
    }
}
