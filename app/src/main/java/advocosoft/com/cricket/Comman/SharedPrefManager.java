package advocosoft.com.cricket.Comman;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SharedPrefManager {

    private static final String SHARE_PREF_NAME = "fcmsharedprefdemo";
    private static final String KEY_ACCESS_TOKEN = "fcmtoken";
    private static String islagChange;

    private static Context mCtx;
    private static SharedPrefManager mInstance;
    public static SharedPreferences sp;
    private SharedPrefManager(Context context) {
        mCtx = context;
        sp = mCtx.getSharedPreferences("Crickaina", Context.MODE_PRIVATE);
    }
    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null)
            mInstance = new SharedPrefManager(context);
        return mInstance;
    }
    public static void setClickITem(Context ctx,String type, Boolean value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(type, value);
        editor.commit();
    }
    public static Boolean getClickITemc(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        Boolean e = sp.getBoolean(type, false);
        return e;
    }
    public static void setUserID(Context ctx,String type, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(type, value);
        editor.commit();
    }
    public static String getUserID(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String e = sp.getString(type, "");
        return e;
    }
    public static void setIDPassPort(Context ctx,String type, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(type, value);
        editor.commit();
    }
    public static String getIDPassPort(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String e = sp.getString(type, "");
        return e;
    }

    public static void setUserName(Context ctx,String type, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(type, value);
        editor.commit();
    }
    public static String getUserName(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String e = sp.getString(type, "");
        return e;
    }
    public static void setAccessToken(Context ctx,String type, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(type, value);
        editor.commit();
    }
    public static String getAccessToken(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String e = sp.getString(type, "");
        return e;
    }
    public static void setMobile(Context ctx,String type, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(type, value);
        editor.commit();
    }
    public static String getMobile(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String e = sp.getString(type, "");
        return e;
    }

    public static void setUserEmail(Context ctx,String type, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(type, value);
        editor.commit();
    }
    public static String getUserEmail(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String e = sp.getString(type, "");
        return e;
    }

    public static void setLoanType(Context ctx,String type, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(type, value);
        editor.commit();
    }
    public static String getLoanType(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        String e = sp.getString(type, "");
        return e;
    }


    public String getRegPeopleId() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("reg_people_id", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getString("key_reg_people_id", "");
    }

    //Store Otp Regestration as User, Agent and Owner.
    public boolean storeRegPeopleOtp(Integer otp) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("reg_people_otp", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putInt("key_reg_people_otp", otp);
        editor.commit();
        return true;
    }

    public Integer getRegPeopleOtp() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("reg_people_otp", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getInt("key_reg_people_otp", 0);
    }
    //Store Access Token Regestration as User, Agent and Owner.
    public boolean storeAccessToken(String access_token) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("reg_access_token", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putString("key_reg_access_token", access_token);
        editor.commit();
        return true;
    }
    public String getAccessToken() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("reg_access_token", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getString("key_reg_access_token", "");
    }
    public boolean storeFbAccessToken(String access_token) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("reg_fb_access_token", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putString("key_fb_reg_access_token", access_token);
        editor.commit();
        return true;
    }

    public String getFbAccessToken() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("reg_fb_access_token", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getString("key_fb_reg_access_token", "");
    }
    public static void showMessage(Context ctx, String msg) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }
    public static void showMessageOtp(Context ctx, String msg) {
        Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show();
    }
    public void hideSoftKeyBoard(Activity activity) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);

            //check if no view has focus.
            View v = activity.getCurrentFocus();
            if (v == null)
                return;
            inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void storeIsLoggedIn(Boolean isLoggedIn) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putBoolean("key", isLoggedIn);
        editor.commit();
    }

    public boolean getIsLoggedIn(boolean default_value) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("login", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getBoolean("key", default_value);
    }

    public void storeIsChecked(Context ctx,String type ,Boolean isLoggedIn) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(type, isLoggedIn);
        editor.commit();
//        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("ischecked", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
//        editor.putBoolean("key", isLoggedIn);
//        editor.commit();
    }

    public boolean getIsChecked(Context ctx,String type) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
        return sp.getBoolean(type, false);
//        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("ischecked", Context.MODE_PRIVATE);
//        return sharedPreferencesReg.getBoolean("key", default_value);
    }









    public void storeSubPoductId(String id) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("sub_product_id", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putString("sub_product_id_key", id);
        editor.commit();
    }

    public String getSubPoductid() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("sub_product_id", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getString("sub_product_id_key", "");
    }

    public void storeSubPoductName(String id) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("sub_product_name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putString("sub_product_name_key", id);
        editor.commit();
    }

    public String getSubPoductName() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("sub_product_name", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getString("sub_product_name_key", "");
    }

    public String getLatLng() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("LatLng", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getString("fb_image_key", "");
    }

    public static void setDouble(String name, Double value) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(name, value.toString());
        editor.commit();
    }
    public static void setSharedPrefString(String preffConstant, String stringValue) {
        if (!TextUtils.isEmpty(stringValue)) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(preffConstant, stringValue);
            editor.commit();
        }
    }
    public static String getSharedPrefString(String preffConstant) {
        String stringValue = "";
        stringValue = sp.getString(preffConstant, "");
        return stringValue;
    }
    public static Boolean getIslagChange(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getBoolean(islagChange, false);
    }

    public static void setIslagChange(Context context, Boolean isUserLogin) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(islagChange, isUserLogin);
        editor.commit();
    }

    public static void setLangId(Context ctx, String preffConstant, String stringValue){
        SharedPreferences sharedPreferences = ctx.getSharedPreferences("Lang", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(preffConstant,stringValue);
        editor.commit();
    }
    public static String getLangId(Context ctx, String preffConstant){
        SharedPreferences sharedPreferences = ctx.getSharedPreferences("Lang", Context.MODE_PRIVATE);
        return sharedPreferences.getString(preffConstant,"");
    }


//    public static void setUserID(String type , String userId) {
//        SharedPreferences.Editor editor = sp.edit();
//        editor.putString(type,userId);
//        editor.commit();
//    }
//    public static String getUserID(String type) {
//        String e = sp.getString(type,"");
//        return e;
//    }
    public static void setUserTypeID(String userType, String id) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(userType,id);
        editor.commit();
    }
    public static String getUserTypeID(String userType){
        String e = sp.getString(userType,"");
        return e;

    }
    public static void setBookNowDistance(String preffConstant, String stringValue) {
        if (!TextUtils.isEmpty(stringValue)) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(preffConstant, stringValue);
            editor.commit();
        }
    }
    public static String getBookNowDistance(String preffConstant) {
        String stringValue = "";
        stringValue = sp.getString(preffConstant, "");
        return stringValue;
    }
    public static void setBookNowDuration(String preffConstant, String stringValue) {
        if (!TextUtils.isEmpty(stringValue)) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(preffConstant, stringValue);
            editor.commit();
        }
    }
    public static String getBookNowDuraiton(String preffConstant) {
        String stringValue = "";
        stringValue = sp.getString(preffConstant, "");
        return stringValue;
    }

//    public static String getDirectionsUrl(LatLng origin, LatLng dest) {
//
//        // Origin of route
//        String str_origin = "origin=" + origin.latitude + "," + origin.longitude;
//
//        // Destination of route
//        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;
//
//        // Sensor enabled
//        String sensor = "sensor=false";
//        String mode = "mode=driving";
//        String alternative = "alternatives=true";
//        String key = "key="+"AIzaSyB7tIYFdkzHflflwJOdiX8LUrPSILU_-T4";
//        // Building the parameters to the web service
//        String parameters = str_origin + "&" + str_dest + "&" + sensor + "&" + mode + "&" + alternative+ "&" + key;
//
//        // Output format
//        String output = "json";
//
//        // Building the url to the web service
//        String url = "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters;
//
//        Log.e("url", url);
//
//        return url;
//    }

    // Store People Id Regestration as User, Agent and Owner.
    public boolean storeSignPeopleId(String reg_as) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("sign_people_id", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putString("key_sign_people_id", reg_as);
        editor.commit();
        return true;
    }
    public String getSignPeopleId() {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("sign_people_id", Context.MODE_PRIVATE);
        return sharedPreferencesReg.getString("key_sign_people_id", "");
    }
    public void storeUserName(String fullName) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences("UserName" , Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("UserName_Key",fullName);
        editor.commit();
    }
    public String getUserName(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences("UserName", Context.MODE_PRIVATE);
        return sharedPreferences.getString("UserName_Key","");
    }

    public void storeOrderTime(String time){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences("Order_Time", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Order_Time_Key",time);
        editor.commit();
    }
    public String getOrderTime(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences("Order_Time", Context.MODE_PRIVATE);
        return sharedPreferences.getString("Order_Time_Key","");
    }

    public void storeAddress(String name) {
        SharedPreferences sharedPreferencesReg = mCtx.getSharedPreferences("Address", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferencesReg.edit();
        editor.putString("Address_key", name);
        editor.commit();
    }
    public String getAddress(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences("Address", Context.MODE_PRIVATE);
        return sharedPreferences.getString("Address_key","");
    }

    public boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public Boolean CheckPassword(String password)
    {
        String[] re = {"[a-z]","[?=.*[@#$%!\\-_?&])(?=\\\\S+$]"};
        for(String r : re)
        {
            if(!Pattern.compile(r).matcher(password).find()) return false;
        }
        return true;
    }

}
