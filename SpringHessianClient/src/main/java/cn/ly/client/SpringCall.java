package cn.ly.client;

import cn.ly.pojo.Efile;
import cn.ly.pojo.Fwqpz;
import cn.ly.services.i.EfileService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Set;

/**
 * Created by luyuwww on 2015-08-20.
 */
public class SpringCall {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("/remoting-client.xml");
            Fwqpz fwpz = new Fwqpz();
            fwpz.setPort(591);
            fwpz.setDataPath("c:/temp/sdfs/sdw/斯蒂芬莫");
            EfileService remote = (EfileService) context.getBean("efileServiceClent");
            Efile efile = remote.getEfile("this is test call", fwpz);
            System.out.println(efile.getFileName());
            Map<String, Fwqpz> map = efile.getFwqpzMap();
            Set<String> set = map.keySet();
            for (String key : set) {
                System.out.println(map.get(key).getDataPath());
            }
            System.out.println(efile.getMd5());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
