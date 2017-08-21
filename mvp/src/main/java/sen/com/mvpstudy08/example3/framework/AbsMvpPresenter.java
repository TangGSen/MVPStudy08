package sen.com.mvpstudy08.example3.framework;

/**
 * Created by Administrator on 2017/8/20.
 */

public abstract class AbsMvpPresenter<V extends IMvpView> {
    private V view;

    /**
     * 绑定view
     * @param view
     */
    public void attachView(V view) {
        this.view = view;
    }

    public void dettachView(){
        this.view = null;
    }

    public V getView(){
        return view;
    }
}
