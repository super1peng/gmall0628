package com.super1peng.gmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.super1peng.gmall.bean.BaseCatalog1;
import com.super1peng.gmall.bean.BaseCatalog2;
import com.super1peng.gmall.bean.BaseCatalog3;
import com.super1peng.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CataLogController {

    @Reference
    CatalogService cataLogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
        List<BaseCatalog1> baseCatalog1s = cataLogService.getCatalog1();
        return baseCatalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        List<BaseCatalog2> baseCatalog2s = cataLogService.getCatalog2(catalog1Id);
        return baseCatalog2s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        List<BaseCatalog3> baseCatalog3s = cataLogService.getCatalog3(catalog2Id);
        return baseCatalog3s;
    }

}
