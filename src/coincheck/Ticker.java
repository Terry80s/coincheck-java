/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coincheck;

import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

/**
 *
 * @author Administrator
 */
public class Ticker {

    private CoinCheck client;

    public Ticker(CoinCheck client) {
        this.client = client;
    }

    /**
     * 各種最新情報を簡易に取得することができます。
     *
     * @param params
     * @throws java.lang.Exception
     *
     * @return JSONObject
     */
    public JSONObject all(Map<String, String> params) throws Exception {
        String response = this.client.sendGet("api/ticker", params);
        JSONObject jsonObj = new JSONObject(response);
        return jsonObj;
    }

}
