package sen.com.mvpstudy08.example4.login;

import sen.com.mvpstudy08.example4.framework.view.MvpView;

/**
 * Created by Administrator on 2017/8/20.
 */

public interface MainView extends MvpView{
    void onLogining();

    void onLoginResult(String result);
}
