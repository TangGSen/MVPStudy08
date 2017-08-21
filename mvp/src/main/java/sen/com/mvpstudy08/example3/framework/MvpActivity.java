package sen.com.mvpstudy08.example3.framework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/8/21.
 */

public abstract class MvpActivity<V extends IMvpView,P extends AbsMvpPresenter<V>> extends AppCompatActivity {
    private V view;
    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter ==null){
            presenter = bindPresenter();
        }

        if (view == null){
            view = bindView();
            presenter.attachView(view);
        }
    }

    protected abstract V bindView();

    //绑定Presenter
    protected abstract P bindPresenter();

    protected P getPresenter(){
        return presenter;
    }

    protected V getView(){
        return view;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.dettachView();
        }
    }
}
