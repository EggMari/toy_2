package com.eggmari.toy.service;


import com.eggmari.toy.dto.OilPriceDto;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
@Component
public class OilPriceService {
    private final String siteUrl = "http://www.opinet.co.kr/api/avgSidoPrice.do";
    private final String oilAuthCode = "F958210319";
    private final String prodcd = "D047";


    public JSONObject getOilPrice() throws ParseException {
        BufferedReader br = null;
        String returnText = "";
        String jsonData = "";
        try {
            URL url = null;
            HttpURLConnection conn = null;
            StringBuffer sb = null;

            url = new URL(siteUrl + "?out=json" + "&code=" + oilAuthCode + "&prodcd=" + prodcd);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestMethod("GET");
            conn.connect();

            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

            sb = new StringBuffer();

            while ((jsonData = br.readLine()) != null) {
                sb.append(jsonData);
            }

            returnText = sb.toString();
            System.out.println(returnText);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        JSONParser jsonParse = new JSONParser();
        JSONObject jsonobj = (JSONObject) jsonParse.parse(returnText);

        return jsonobj;
    }

    public void savePrices(JSONObject json){
        JSONParser jsonParser = new JSONParser();

        JSONObject json_getResult = (JSONObject) json.get("RESULT");
        JSONArray  json_getOIL = (JSONArray) json_getResult.get("OIL");
/**
 *  private int oil_idx;
 *     @Column(length = 20, nullable = false)
 *     private String oil_kind;
 *     @Column(length = 20, nullable = false)
 *     private double oil_price;
 *     @Column(length = 20, nullable = false)
 *     private double oil_price_Increase;
 *     @Column(length = 20, nullable = false)
 *     private String sale_area;
 *
 */
        for(int a = 0; a < json_getOIL.size(); a++){
            JSONObject oil = (JSONObject) json_getOIL.get(a);
            String sale_area = (String)oil.get("SIDONM");
            String oil_kind = (String)oil.get("PRODCD");
            Double oil_price = (Double)oil.get("PRICE");
            Double oil_price_Increase = (Double)oil.get("DIFF");

        }

    }



}
