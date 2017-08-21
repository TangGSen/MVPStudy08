package sen.com.mvpstudy08.example01.login;

import http.HttpUtils;

/**
 * Created by Administrator on 2017/8/20.
 */

public class MainPresenter {
    private MainView mainView;
    private MainMode mainMode;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        mainMode = new MainMode();
    }

    public void login(String usrName,String url){
        mainView.onLogining();
        mainMode.login(usrName, url, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                mainView.onLoginResult(result);
            }
        });
    }
}
