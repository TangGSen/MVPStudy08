package sen.com.mvpstudy08.example4.framework.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import sen.com.mvpstudy08.example4.framework.presenter.MvpPresenter;
import sen.com.mvpstudy08.example4.framework.view.MvpView;

/**
 * Created by Administrator on 2017/8/21.
 */

public abstract class MvpActivity<V extends MvpView, P extends MvpPresenter<V>> extends AppCompatActivity {
    private V view;
    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null) {
            presenter = bindPresenter();
        }

        if (view == null) {
            view = bindView();
        }

        if (presenter != null && view != null) {
            presenter.attachView(view);
        }
    }

    protected abstract V bindView();

    //绑定Presenter
    protected abstract P bindPresenter();

    protected P getPresenter() {
        return presenter;
    }

    protected V getView() {
        return view;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.dettachView();
            presenter =null;
        }
    }
}
