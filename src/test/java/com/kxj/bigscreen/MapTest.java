package com.kxj.bigscreen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Acthor Tao.Lee @date 2021/10/20 14:09
 * @Description
 */
public class MapTest {
    public static void main(String[] args) {

/*        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "hello");
        map.put("2", "world");
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list.add(map);
        System.out.println(list);
        for (Map<String, String> m : list) {
            for (String k : m.keySet()) {
                //System.out.println(k + " : " + m.get(k));
            }
        }*/

/*        List<String> a = new ArrayList<String>();
        a.add("table");
        a.add("table_name");
        HashMap<String,List<String>> b =new HashMap<String,List<String>>();
        b.put("table",a);
        List<String> c = b.get("id2");*/
        Map map=new HashMap<String,String>();
        map.put("table","k_tb");
        Map map1=new HashMap<String,String>();
        map1.put("table_name","测试表名");
        List list=new ArrayList();
        list.add(map);
        list.add(map1);
        HashMap<String,List<String>> b =new HashMap<String,List<String>>();
        b.put("id2",list);
        System.out.println(b);
    }
}
