package sen.com.mvpstudy08.example4.login;

import http.HttpTask;
import http.HttpUtils;
import sen.com.mvpstudy08.example4.framework.model.MvpModel;

/**
 * Created by Administrator on 2017/8/20.
 */

public class MainMode implements MvpModel {
   public  void login(String userName, String url, final HttpUtils.OnHttpResultListener listener){
       HttpTask httpTask = new HttpTask(new HttpUtils.OnHttpResultListener() {
           @Override
           public void onResult(String result) {
               listener.onResult(result);
           }


       });
       httpTask.execute(url,userName);
   }
}
