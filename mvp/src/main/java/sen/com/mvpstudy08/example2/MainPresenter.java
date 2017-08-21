package sen.com.mvpstudy08.example2;

import http.HttpUtils;

/**
 * Created by Administrator on 2017/8/20.
 */

public class MainPresenter {
    private MainView mainView;
    private MainMode mainMode;

    public MainPresenter() {

        mainMode = new MainMode();
    }

    public void login(String usrName, String url) {
        mainView.onLogining();
        mainMode.login(usrName, url, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                if (mainView != null) {
                    mainView.onLoginResult(result);
                }

            }
        });
    }

    public void attachView(MainView mainView) {
        this.mainView = mainView;
    }

    ;

    public void dettachView() {
        this.mainView = null;
    }
}
