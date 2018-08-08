package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoad;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoad = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg";
                wvMyPage.loadUrl(url);
                wvMyPage.getSettings().setJavaScriptEnabled(true);
                wvMyPage.getSettings().setAllowFileAccess(false);
                wvMyPage.getSettings().setBuiltInZoomControls(true);
            }
        });
    }
}
