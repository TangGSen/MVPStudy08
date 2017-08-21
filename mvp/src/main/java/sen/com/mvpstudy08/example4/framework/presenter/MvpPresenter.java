package sen.com.mvpstudy08.example4.framework.presenter;

import sen.com.mvpstudy08.example4.framework.view.MvpView;

/**
 * Created by Administrator on 2017/8/21.
 * Presenter 抽象接口
 */

public interface MvpPresenter<V extends MvpView> {
    //绑定View
    void attachView(V view);

    //解绑View
    void dettachView();
}
