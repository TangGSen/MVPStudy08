package sen.com.mvpstudy08.example2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import sen.com.mvpstudy08.R;

public class MainActivity extends AppCompatActivity implements MainView {
    private MainPresenter mainPresenter;
    private TextView resluts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);
        resluts = (TextView) findViewById(R.id.resluts);

    }
    public void login(View view){
        mainPresenter.login("tjsen","http://baidu.com");
    }
    @Override
    public void onLogining() {
        resluts.setText("正在登陆");
    }

    @Override
    public void onLoginResult(String result) {
        resluts.setText(result);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.dettachView();
    }
}
