package cn.com.hwxt.ly.pojo;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by luyuwww on 2015-08-19.
 */
public class Fwqpz implements Serializable{

    public String getPzm() {
        return pzm;
    }

    public void setPzm(String pzm) {
        this.pzm = pzm;
    }

    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Map<String, Object> getMapping() {
        return mapping;
    }

    public void setMapping(Map<String, Object> mapping) {
        this.mapping = mapping;
    }

    private String pzm;
    private String dataPath;
    private Integer port;
    private Map<String , Object> mapping;
    private static final long serialVersionUID = 2091708553885622574L;
}
