package sen.com.mvpstudy08.example4.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import sen.com.mvpstudy08.R;
import sen.com.mvpstudy08.example4.framework.view.impl.MvpActivity;

public class MainActivity extends MvpActivity<MainView,MainPresenter> implements MainView {
    private TextView resluts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resluts = (TextView) findViewById(R.id.resluts);
        resluts.setText("exsampl4");

    }

    @Override
    protected MainView bindView() {
        return this;
    }

    @Override
    protected MainPresenter bindPresenter() {
        return new MainPresenter(this);
    }

    public void login(View view){
        getPresenter().login("tjsen","http://baidu.com");
    }
    @Override
    public void onLogining() {
        resluts.setText("正在登陆");
    }

    @Override
    public void onLoginResult(String result) {
        resluts.setText(result);
    }


}
