package sen.com.mvpstudy08.example3.impl;

import http.HttpUtils;
import sen.com.mvpstudy08.example3.framework.AbsMvpPresenter;

/**
 * Created by Administrator on 2017/8/20.
 */

public class MainPresenter extends AbsMvpPresenter<MainView> {
    private MainMode mainMode;

    public MainPresenter() {

        mainMode = new MainMode();
    }

    public void login(String usrName, String url) {
        if (getView()!=null)
        getView().onLogining();
        mainMode.login(usrName, url, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                    if (getView()!=null)
                        getView().onLoginResult(result);

            }
        });
    }


}
