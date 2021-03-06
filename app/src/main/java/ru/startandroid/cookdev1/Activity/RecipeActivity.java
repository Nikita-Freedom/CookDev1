package ru.startandroid.cookdev1.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ru.startandroid.cookdev1.API.APIConfig;
import ru.startandroid.cookdev1.R;

public class RecipeActivity extends AppCompatActivity {
    public final static String RECIPE_URL = "recipe_url";

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        webView = findViewById(R.id.web_view);

        String recipeUrl = APIConfig.API_HOST_HTML + getIntent().getStringExtra(RECIPE_URL);

        webView.loadUrl(recipeUrl);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

    }

}
