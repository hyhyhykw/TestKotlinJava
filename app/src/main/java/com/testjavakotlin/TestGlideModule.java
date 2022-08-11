package com.testjavakotlin;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.AppGlideModule;

import java.io.InputStream;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import okhttp3.OkHttpClient;

/**
 * Created time : 2019/3/5 8:45 AM.
 *
 * @author HY
 */
@GlideModule
public final class TestGlideModule extends AppGlideModule {

    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {

        OkHttpUrlLoader.Factory factory = new OkHttpUrlLoader.Factory(new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .proxy(Proxy.NO_PROXY)
                .build());

        registry.replace(GlideUrl.class,
                InputStream.class,
                factory);
    }

    @Override
    public boolean isManifestParsingEnabled() {
        // 不使用 Manifest 中的 GlideModule
        return false;
    }
}
