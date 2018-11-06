package eu.nabord.webdaydream;

import android.service.dreams.DreamService;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TvDreamService extends DreamService {
    private WebView myWebView;

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();

        // Allow user touch
        // setInteractive(true);

        // Hide system UI
        setFullscreen(true);

        myWebView = new WebView(this);
        setContentView(myWebView);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onDreamingStarted() {
        myWebView.loadUrl("https://www.google.fr");
    }
}