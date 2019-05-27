package in.januprasad.libs;

import android.app.Activity;
import android.widget.TextView;

/**
 * Created by Januprasad K on 27/5/19.
 */
public class Logger {
    private TextView textView;

    private Logger(TextView textView) {
        this.textView = textView;
    }

    public static Logger init(TextView textView){
        textView.setText("");
        return  new Logger(textView);
    }

   public void  log(String s){
       textView.append(s);
       textView.append("\n");
    }
}
