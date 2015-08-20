package cn.com.hwxt.ly.pojo;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by luyuwww on 2015-08-19.
 */
public class Efile implements Serializable {
    private static final long serialVersionUID = 8824334653712012069L;

    private Fwqpz pzm ;
    private Map<String , Fwqpz> fwqpzMap;
    private String fileName;
    private String title;
    private String md5;

    public Fwqpz getPzm() {
        return pzm;
    }

    public void setPzm(Fwqpz pzm) {
        this.pzm = pzm;
    }

    public Map<String, Fwqpz> getFwqpzMap() {
        return fwqpzMap;
    }

    public void setFwqpzMap(Map<String, Fwqpz> fwqpzMap) {
        this.fwqpzMap = fwqpzMap;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
