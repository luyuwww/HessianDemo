package cn.ly.services.i;

import cn.ly.pojo.Efile;
import cn.ly.pojo.Fwqpz;

public interface EfileService {

    public void addEfile(Efile efile);

    public Efile getEfile(String id, Fwqpz pzm);

    public Fwqpz getEfileMap();
}
