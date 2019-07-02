package com.super1peng.gmall.service;

import com.super1peng.gmall.bean.BaseCatalog1;
import com.super1peng.gmall.bean.BaseCatalog2;
import com.super1peng.gmall.bean.BaseCatalog3;

import java.util.List;

public interface CatalogService {

    // 创建 获取一级分类的方法
    List<BaseCatalog1> getCatalog1();

    // 根据一级分类得到二级分类
    List<BaseCatalog2> getCatalog2(String catalog1Id);

    // 根据二级分类得到三级分类
    List<BaseCatalog3> getCatalog3(String catalog2Id);
}
