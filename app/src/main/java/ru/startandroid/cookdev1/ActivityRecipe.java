package ru.startandroid.cookdev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityRecipe extends AppCompatActivity {
    TextView mText1;
    TextView mText2;
    TextView mText3;
    TextView mText4;
    TextView mText5;
    TextView mText6;
    TextView mText7;
    TextView mText8;
    TextView mText9;
    TextView mText10;
    TextView mText11;
    TextView mText12;
    TextView mText13;
    TextView mText14;

    ImageView mImage1;
    ImageView mImage2;
    ImageView mImage3;
    ImageView mImage4;
    ImageView mImage5;
    ImageView mImage6;
    ImageView mImage7;
    ImageView mImage8;
    ImageView mImage9;
    ImageView mImage10;
    ImageView mImage11;
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
       String mText1 = getIntent().getStringExtra("Название");
       String mText2 = getIntent().getStringExtra("Ингредиенты");
        ArrayList<Recipe> activityRecipes = new ArrayList<>();
        activityRecipes.add(new Recipe(R.drawable.shaurma, R.drawable.podnos, R.drawable.ovenrec3, R.drawable.fondev4, R.drawable.oven, R.drawable.zapekanka3, R.drawable.zapekanka1, R.drawable.zepekanka2, R.drawable.tvorog, R.drawable.terka, R.drawable.vodakipit,
                "ssss", "ssss", "aaaaaa", "wwww", "oooo", "jjjjj", "sss", "pppp", "mmmm", "zzz", "aqqaq"));
        WebView myWebView = new WebView(getApplicationContext());
        setContentView(myWebView);
        myWebView.loadUrl("https://be1.ru/html-redaktor-online/?data=0JZzQAdN5AUb93Age91XkrpLw4h2mIPr");
        myWebView.findViewById(R.id.webview);
        String unencodedHtml =
                "&lt;html&gt;&lt;body&gt;'%23' is the percent code for ‘#‘ &lt;/body&gt;&lt;/html&gt;";
        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(),
                Base64.NO_PADDING);
        myWebView.loadData(encodedHtml, "text/html", "base64");
    }
}
