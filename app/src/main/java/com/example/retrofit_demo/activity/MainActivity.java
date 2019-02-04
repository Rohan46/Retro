package com.example.retrofit_demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.example.retrofit_demo.ApiInterface;
import com.example.retrofit_demo.R;
import com.example.retrofit_demo.model.Data;
import com.example.retrofit_demo.model.Result;
import com.example.retrofit_demo.web_service.ApiClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

/*    Spinner spinner;
    ArrayList<String> banknames;
    ApiInterface getData = ApiClient.getClient().create(ApiInterface.class);;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RelativeLayout main = findViewById(R.id.main);

        WebView web = new WebView(this);
        web.setVerticalScrollBarEnabled(false);
        web.setHorizontalScrollBarEnabled(false);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.getSettings().setJavaScriptEnabled(true);

        web.getSettings().setDomStorageEnabled(true);
        /*web.loadData("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>What Can JavaScript Do?</h2>\n" +
                "\n" +
                "<p id=\"demo\">JavaScript can change the style of an HTML element.</p>\n" +
                "\n" +
                "<button type=\"button\" onclick=\"document.getElementById('demo').style.fontSize='35px'\">Click Me!</button>\n" +
                "\n" +
                "</body>\n" +
                "</html>", "text/html", "UTF-8");*/
        /*String str = "<!DOCTYPE html><html lang=\"en\"><head><link href=\"http://ec2-52-15-233-207.us-east-2.compute.amazonaws.com/assets/vendors/base/vendors.bundle.css\" rel=\"stylesheet\" type=\"text/css\" /><link href=\"http://ec2-52-15-233-207.us-east-2.compute.amazonaws.com/assets/demo/demo12/base/style.bundle.css\" rel=\"stylesheet\" type=\"text/css\" /><link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\"><style type=\"text/css\">img{ max-width:100%;}b,strong{ font-weight:bold;font-size:20px;}p,p span,div,li,p *,div *,span{ font-size:18px !important; margin-top:0; padding-top:0}</style></head><body style=\"width:100%; padding:0; margin:0; overflow-y:auto; overflow-x:hidden; height:100%; background:#f8fbff; color:#244b82\"><p>By the end of this topic you will be able to ... <ul><li>  Say hello and practice greeting people.</li></ul><ul><li>Give personal information about yourself and others.</li></ul><ul><li>Identify the names of countries and their nationalities.</li></ul><p>  </p><ul><li>Ask and answer questions about yourself and others.</li></ul><p></p><p></p><p></p></p>  </body></html>";
        String s = "";
        try {
            s = URLEncoder.encode("<!DOCTYPE html><html lang=\\\"en\\\"><head><script src=\\\"https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js\\\"></script>\\r\\n\\t\\t\\t\\t<script>\\r\\n\\t\\t\\t\\t\\tWebFont.load({\\r\\n\\t\\t\\t\\t\\t\\t\\tgoogle: {\\r\\n\\t\\t\\t\\t\\t\\t\\t\\t\\\"families\\\": [\\\"Poppins:300,400,500,600,700\\\", \\\"Roboto:300,400,500,600,700\\\"]\\r\\n\\t\\t\\t\\t\\t\\t\\t}\\r\\n\\t\\t\\t\\t\\t\\t});\\r\\n\\t\\t\\t\\t</script><link href=\\\"http://ec2-52-15-233-207.us-east-2.compute.amazonaws.com/assets/vendors/base/vendors.bundle.css\\\" rel=\\\"stylesheet\\\" type=\\\"text/css\\\" /><link href=\\\"http://ec2-52-15-233-207.us-east-2.compute.amazonaws.com/assets/demo/demo12/base/style.bundle.css\\\" rel=\\\"stylesheet\\\" type=\\\"text/css\\\" /><link rel=\\\"stylesheet\\\" href=\\\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\\\"><style type=\\\"text/css\\\">img{ max-width:100%;}b,strong{ font-weight:bold;font-size:20px;}p,p span,div,li,p *,div *,span{ font-size:18px !important; margin-top:0; padding-top:0}</style></head><body style=\\\"width:100%; padding:0; margin:0; overflow-y:auto; overflow-x:hidden; height:100%; background:#f8fbff; color:#244b82\\\"><p>By the end of this topic you will be able to ...\\r\\n<ul><li>\\r\\nSay hello and practice greeting people.</li></ul><ul><li>Give personal information about yourself and others.</li></ul><ul><li>Identify the names of countries and their nationalities.</li></ul><p>\\r\\n</p><ul><li>Ask and answer questions about yourself and others.</li></ul><p></p><p></p><p></p></p>\\n</body></html>", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        web.loadData(s, "text/html", null);*/

//        web.loadUrl("file:///android_asset/sample.html");
        web.setWebViewClient(new WebViewClient());
        web.loadDataWithBaseURL("", "<!DOCTYPE html><html lang=\"en\"><head><script src=\"https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js\" type=\"text/javascript\"></script><script>WebFont.load({google:{\"families\": [\"Poppins:300,400,500,600,700\", \"Roboto:300,400,500,600,700\"]}});</script><link href=\"http://ec2-52-15-233-207.us-east-2.compute.amazonaws.com/assets/vendors/base/vendors.bundle.css\" rel=\"stylesheet\" type=\"text/css\" /><link href=\"http://ec2-52-15-233-207.us-east-2.compute.amazonaws.com/assets/demo/demo12/base/style.bundle.css\" rel=\"stylesheet\" type=\"text/css\" /><link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\"><style type=\"text/css\">img{ max-width:100%;}b,strong{ font-weight:bold;font-size:20px;}p,p span,div,li,p *,div *,span{ font-size:18px !important; margin-top:0; padding-top:0}</style></head><body style=\"width:100%; padding:0; margin:0; overflow-y:auto; overflow-x:hidden; height:100%; background:#f8fbff; color:#244b82\"><p>By the end of this topic you will be able to ...\n" +
                "    <ul><li>\n" +
                "    Say hello and practice greeting people.</li></ul><ul><li>Give personal information about yourself and others.</li></ul><ul><li>Identify the names of countries and their nationalities.</li></ul><p>\n" +
                "    </p><ul><li>Ask and answer questions about yourself and others.</li></ul><p></p><p></p><p></p></p>\n" +
                "    </body></html>", "text/html", "UTF-8", "");
//        web.loadDataWithBaseURL("", );
        main.removeAllViews();
        main.addView(web);

  /*      spinner = findViewById(R.id.bank_names);


        getNewData();*/

    }
/*
    private void getNewData() {


        Call<Data> call = getData.getbankData("bank");
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                if (response.body().getStatus()) {
                    List<Result> bankList = response.body().getResult();
                    if (bankList.size() != 0) {
                        banknames = new ArrayList<>();
                        for (int i = 0; i < bankList.size(); i++) {
                            Result result = bankList.get(i);
                            banknames.add(result.getListingName());
                        }
                        ArrayAdapter<String> spinner_Adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, banknames);
                        spinner_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner.setAdapter(spinner_Adapter);
                    }
                }
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });
    }*/
}
