package com.magicwindow.deeplink.task;

import cn.salesuite.saf.http.rest.RestClient;
import cn.salesuite.saf.http.rest.UrlBuilder;
import cn.salesuite.saf.rxjava.RxAsyncTask;

/**
 * 请求网络的Task
 * Created by Tony Shen on 16/3/29.
 */
public class NetTask extends RxAsyncTask {

    private static final String HOST = "http://121.40.195.177/list/";
    private String path;

    public NetTask(String path) {
        this.path = path;
    }

    /**
     * 返回网络请求的response
     * @return
     */
    public String onExecute() {

        UrlBuilder builder = new UrlBuilder(HOST + path);
        String urlString = builder.buildUrl();

        return RestClient.get(urlString).body();
    }
}
