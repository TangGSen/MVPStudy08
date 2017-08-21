package sen.com.mvpstudy08.example4.login;

import android.content.Context;

import http.HttpUtils;
import sen.com.mvpstudy08.example4.framework.presenter.MvpBasePresenter;

/**
 * Created by Administrator on 2017/8/20.
 */

public class MainPresenter extends MvpBasePresenter<MainView> {
    private MainMode mainMode;

    public MainPresenter(Context context) {
        super(context);
        mainMode = new MainMode();
    }

    public void login(String usrName, String url) {
        if (isAttachView())
            getView().onLogining();
        mainMode.login(usrName, url, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                getView().onLoginResult(result);

            }
        });
    }


}
