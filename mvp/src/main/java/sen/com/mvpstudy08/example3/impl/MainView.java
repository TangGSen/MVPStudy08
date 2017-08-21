package sen.com.mvpstudy08.example3.impl;

import sen.com.mvpstudy08.example3.framework.IMvpView;

/**
 * Created by Administrator on 2017/8/20.
 */

public interface MainView extends IMvpView {
    void onLogining();

    void onLoginResult(String result);
}
