/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coincheck;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) throws Exception {
        CoinCheck client = new CoinCheck("oyme8ECw_YZxEb2M", "WDCxxHJ4EHZZg8zLFvlwYsEj6p6hSANT");
        Map<String, String> params = new HashMap<>();
        JSONObject response = client.account().info(params);
        List<NameValuePair> bankAccount = new ArrayList<>();
        bankAccount.add(new BasicNameValuePair("bank_name", "aaabbb"));
        bankAccount.add(new BasicNameValuePair("branch_name", "bbbbbb"));
        bankAccount.add(new BasicNameValuePair("bank_account_type", "futsu"));
        bankAccount.add(new BasicNameValuePair("number", "1234567"));
        bankAccount.add(new BasicNameValuePair("name", "カタカナ")); 
        
        client.bankAccount().create(bankAccount);
        client.bankAccount().all(params);
    }
}
