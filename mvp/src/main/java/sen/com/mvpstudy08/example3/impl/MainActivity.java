package sen.com.mvpstudy08.example3.impl;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import sen.com.mvpstudy08.R;
import sen.com.mvpstudy08.example3.framework.MvpActivity;

public class MainActivity extends MvpActivity<MainView,MainPresenter> implements MainView {
    private TextView resluts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resluts = (TextView) findViewById(R.id.resluts);
        resluts.setText("exsampl3");

    }

    @Override
    protected MainView bindView() {
        return this;
    }

    @Override
    protected MainPresenter bindPresenter() {
        return new MainPresenter();
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
