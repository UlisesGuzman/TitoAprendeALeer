package mx.edu.utng.titoaprendealeer;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Toshiba on 04/04/2017.
 */
public class Session {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context ctx;


    public Session(Context ctx){
        this.ctx = ctx;
        preferences = ctx.getSharedPreferences("loginMenuTito", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void setLoggedin(boolean loggedin){
        editor.putBoolean("loggedInmode",loggedin);
        editor.commit();
    }

    public boolean loggedin(){
        return preferences.getBoolean("loggedInmode", false);
    }

}