package cn.com.hwxt.ly.service.impl;

import cn.com.hwxt.ly.pojo.Efile;
import cn.com.hwxt.ly.pojo.Fwqpz;
import cn.com.hwxt.ly.service.i.EfileService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luyuwww on 2015-08-19.
 */
public class EfileServiceImpl implements EfileService {
    public void addEfile(Efile efile) {
        System.out.println(efile.getFileName());
        System.out.println("保存成功");
    }

    public Efile getEfile(String id, Fwqpz pzm) {
        Map<String , Fwqpz> pzmMap = new HashMap<String, Fwqpz>();
        Fwqpz pzmObj = new Fwqpz();
        pzmObj.setDataPath("d:/data");
        pzmObj.setPort(21);
        Fwqpz pzmObj1 = new Fwqpz();
        pzmObj1.setDataPath("d:/degital");
        pzmObj1.setPort(2561);
        pzmMap.put("data", pzmObj);
        pzmMap.put("degital" , pzmObj1);
        Efile efile = new Efile();
        efile.setFileName(id);
        efile.setFwqpzMap(pzmMap);
        efile.setMd5("*/5-554-*4-5*4-4-4");
        return efile;
    }

    public Fwqpz getEfileMap() {
        Fwqpz pzmObj = new Fwqpz();
        pzmObj.setDataPath("d:/data");
        pzmObj.setPort(21);
        return pzmObj;
    }
}
