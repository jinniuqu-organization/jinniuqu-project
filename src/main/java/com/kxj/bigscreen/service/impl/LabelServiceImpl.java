package com.kxj.bigscreen.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.kxj.bigscreen.dao.CollectDao;
import com.kxj.bigscreen.dao.LabelDao;
import com.kxj.bigscreen.dao.OperationDao;
import com.kxj.bigscreen.dao.QualityDao;
import com.kxj.bigscreen.entity.*;
import com.kxj.bigscreen.model.*;
import com.kxj.bigscreen.service.CollectService;
import com.kxj.bigscreen.service.LabelService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.*;

/**
 * @Author: wangxiaogang
 * @Date: 2019/12/26 15:39
 * @Version 1.0
 */
@Service
@Slf4j
public class LabelServiceImpl implements LabelService {


    @Resource
    private LabelDao labelDao;

    @Override
    public DataservPersonGzdz gzdz(DataservPersonGzdz gz) {

        DataservPersonGzdz data = labelDao.gzdz(gz);
        try {
            if(data != null){
                String address = data.getRegAddress();
                LatLng data1 = getLatLng(address);
                data.setLat(data1.getLat());
                data.setLng(data1.getLng());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }


    @Override
    public DataservPersonHjdz hjdz(DataservPersonHjdz hj) {

        DataservPersonHjdz data = labelDao.hjdz(hj);
        try {
            if(data != null){
                String address = data.getRprAddress();
                LatLng data1 = getLatLng(address);
                data.setLat(data1.getLat());
                data.setLng(data1.getLng());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }


    @Override
    public DataservPersonJzdz jzdz(DataservPersonJzdz jz) {

        DataservPersonJzdz data = labelDao.jzdz(jz);
        try {
            if (data != null) {
                String address = data.getPresentAddress();
                LatLng data1 = getLatLng(address);
                data.setLat(data1.getLat());
                data.setLng(data1.getLng());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }


    @Override
    public DataservPersonalLabel label(DataservPersonalLabel la) {
        DataservPersonalLabel data = labelDao.label(la);
        return data;
    }


    @Override
    public List<DataservRelationChain> chain(DataservRelationChain ch) {
        List<DataservRelationChain> data = labelDao.chain(ch);
        return data;
    }


    @Override
    public DataservRelationLabel rela(DataservRelationLabel re) {
        DataservRelationLabel data = labelDao.rela(re);
        return data;
    }

    @Override
    public List<DataservNewsRecommend> news(DataservNewsRecommend news) {
        List<DataservNewsRecommend> data = labelDao.news(news);
        return data;
    }

    @Override
    public List<DataservPersonalLabel> chainLabel(DataservPersonalLabel la) {
        List<DataservPersonalLabel> data = labelDao.chainLabel(la);
        return data;
    }


    @Override
    public List<DataservPersonalLabel> chainLabel1(DataservPersonalLabel la) {
        List<DataservPersonalLabel> data = labelDao.chainLabel1(la);
        return data;
    }


    @Override
    public AuthReault auth(String idCard) {

        AuthReault data = new AuthReault();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        //获取加密后的身份证号码
        HttpPost httpPost = new HttpPost("https://www.xichengjiayuan.com/xclife/v1/face/data/encode");
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
        httpPost.setHeader("Accept", "application/json");
        //form-data 传参数据
        HashMap<String, String> params = new HashMap<>();
        params.put("content", idCard);
        params.put("encodeKey", "k9M7YWLsi0WC09XR");

        Iterator<Map.Entry<String, String>> it = params.entrySet().iterator();
        List<NameValuePair> param = new ArrayList<NameValuePair>();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue());
            param.add(pair);
        }
        log.info("##############调用结果" + param);
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(param, "utf-8"));
            CloseableHttpResponse response = null;
            response = httpclient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = response.getEntity();
                String respContent = EntityUtils.toString(httpEntity);
                //身份证加密后的结果
                JSONObject result0 = JSONObject.parseObject(respContent);
                String idcard = result0.getString("data");
                log.info("##############调用结果" + respContent);
                log.info("##############调用结果" + idcard);

                //获取加密后的身份证号码 获取绿吗
                CloseableHttpClient httpclient1 = HttpClients.createDefault();
                HttpPost httpPost1 = new HttpPost("https://www.xichengjiayuan.com/xclife/v1/face/auth");
                httpPost1.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
                httpPost1.setHeader("Accept", "application/json");
                httpPost1.setHeader("token", "d8ff7d40c1778ab7b20c054299e9c99");
                //form-data 传参数据
                HashMap<String, String> param2 = new HashMap<>();
                param2.put("id", "2");
                param2.put("coName", "xczg");
                param2.put("idCard", idcard);
                Iterator<Map.Entry<String, String>> it1 = param2.entrySet().iterator();
                List<NameValuePair> param3 = new ArrayList<NameValuePair>();

                while (it1.hasNext()) {
                    Map.Entry<String, String> entry = it1.next();
                    NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue());
                    param3.add(pair);
                }
                log.info("##############调用结果" + param3);


                try {
                    httpPost1.setEntity(new UrlEncodedFormEntity(param3, "utf-8"));
                    CloseableHttpResponse response1 = null;
                    response1 = httpclient1.execute(httpPost1);
                    if (response1.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                        HttpEntity httpEntity1 = response1.getEntity();
                        String respContent1 = EntityUtils.toString(httpEntity1);
                        JSONObject result1 = JSONObject.parseObject(respContent1);
                        int colorCode = Integer.parseInt(result1.getString("colorCode"));
                        int healthCode = Integer.parseInt(result1.getString("healthCode"));
                        int isResident = Integer.parseInt(result1.getString("isResident"));

                        data.setColorCode(colorCode);
                        data.setHealthCode(healthCode);
                        data.setIsResident(isResident);

                        log.info("##############调用结果" + respContent1);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return data;
    }

    /**
     * 根据详细地址获取经纬度
     *
     * @param address
     * @return
     */
    private LatLng getLatLng(String address) {
        String key = "28p5tDC3LXnPkZYzj2ozbvvSPHYWTRH5";
        log.info("#####################" + address);
        String api_url0 = "http://api.map.baidu.com/geocoding/v3/?";
        String url0 = api_url0 + "address=" + address + "&output=json&ak=" + key;
        System.out.println("请求api：" + url0);
        JSONObject result0 = null;
        LatLng data1 = new LatLng();
        try {
            HttpClient client = HttpClients.createDefault();
            //发送get请求
            String apiUrl = URLDecoder.decode(url0, "UTF-8");
            HttpGet request = new HttpGet(apiUrl);
            HttpResponse response = client.execute(request);
            //接收返回数据
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String strResult = EntityUtils.toString(response.getEntity());
                result0 = JSONObject.parseObject(strResult);
                log.info("########################" + result0);
                //纬度
                BigDecimal lat = result0.getJSONObject("result").getJSONObject("location").getBigDecimal("lat");
                //经度
                BigDecimal lng = result0.getJSONObject("result").getJSONObject("location").getBigDecimal("lng");
                data1.setLat(String.valueOf(lat));
                data1.setLng(String.valueOf(lng));
            } else {
                System.out.println("get请求失败：" + url0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return data1;
    }
}
