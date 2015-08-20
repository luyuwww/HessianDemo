package cn.ly.client;

import cn.ly.pojo.Efile;
import cn.ly.pojo.Fwqpz;
import cn.ly.services.i.EfileService;
import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;

/**
 * Created by luyuwww on 2015-08-19.
 */
public class CallHessianServlet {
    //调用hessian自己的servlet的方法
    public static void main(String[] args) {
        String url="http://localhost/SpringmvcHessian/hs/efService.hs";
        HessianProxyFactory factory=new HessianProxyFactory();
        factory.setOverloadEnabled(true);
        try {
            Fwqpz fwpz = new Fwqpz();
            fwpz.setPort(591);
            fwpz.setDataPath("c:/temp/sdfs/sdw/斯蒂芬莫");
            EfileService remote =(EfileService) factory.create(EfileService.class, url);
            Efile efile = remote.getEfile("this is test call" , fwpz);
            System.out.println(efile.getFileName());
            Map<String, Fwqpz> map = efile.getFwqpzMap();
            Set<String> set = map.keySet();
            for (String key : set) {
                System.out.println(map.get(key).getDataPath());
            }
            System.out.println(efile.getMd5());
//            System.out.println(say.getStudent("luyu", "你比的大学"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
