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
public class Send {

    private CoinCheck client;

    public Send(CoinCheck client) {
        this.client = client;
    }

    /**
     * Sending Bitcoin to specified Bitcoin addres.
     *
     * @param params
     * @throws java.lang.Exception
     *
     * @return JSONObject
     */
    public JSONObject create(List<NameValuePair> params) throws Exception {
        String response = this.client.sendPost("api/send_money", params);
        JSONObject jsonObj = new JSONObject(response);
        return jsonObj;
    }

    /**
     * You Get Send history
     *
     * @param params
     * @throws java.lang.Exception
     *
     * @return JSONObject
     */
    public JSONObject all(Map<String, String> params) throws Exception {
        String response = this.client.sendGet("api/send_money", params);
        JSONObject jsonObj = new JSONObject(response);
        return jsonObj;
    }

}
