package sg.edu.rp.c346.id22013179.mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView webViewMyPage;
    Button buttonLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLoad = findViewById(R.id.buttonLoad);
        webViewMyPage = findViewById(R.id.webViewMyPage);
        webViewMyPage.setWebViewClient(new WebViewClient());

        buttonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg/soi/home";
                webViewMyPage.loadUrl(url);
            }
        });

    }
}