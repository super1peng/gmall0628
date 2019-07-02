package com.super1peng.gmall.service;

import com.super1peng.gmall.bean.BaseAttrInfo;

import java.util.List;

public interface AttrService {

    void saveAttr(BaseAttrInfo baseAttrInfo);

    List<BaseAttrInfo> getAttrList(String catalog3Id);

}
