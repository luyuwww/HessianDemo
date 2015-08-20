package cn.com.hwxt.ly.service.i;

import cn.com.hwxt.ly.pojo.Efile;
import cn.com.hwxt.ly.pojo.Fwqpz;

/**
 * Created by luyuwww on 2015-08-19.
 */
public interface EfileService {
    public void addEfile(Efile efile);

    public Efile getEfile(String id , Fwqpz pzm);

    public Fwqpz getEfileMap();
}
