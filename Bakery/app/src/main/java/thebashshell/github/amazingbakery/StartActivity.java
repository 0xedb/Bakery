package thebashshell.github.amazingbakery;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.util.ArrayList;

public class StartActivity extends AppCompatActivity {

    static final String url = "https://amazingbakery.herokuapp.com";
    static final String TAG = "thebashshell.bakery";
    static ArrayList<Product> products;
    static String jsonResult;
    static ListView listView;
    static Product a, b, c;
    static Drawable one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        listView = findViewById(R.id.product_list);

        Product a = new Product(19, 3, 7, null, "cupcake", "Cupcake");
        Product b = new Product(21, 1, 7, null, "Tea Bread", "Tea Bread");
        Product c = new Product(21, 1, 7, null, "Delicious Vanilla Cupcake", "Vanilla Cupcake with Cream");
        Product[] pro = {a, b, c};
        ProductListAdapter productListAdapter = new ProductListAdapter(this, R.layout.product_list, pro);
        listView.setAdapter(productListAdapter);

    }

    public void signIn(View view) {
        if(true) {
            Log.i(TAG, "Login Successful!");
        } else {
            Toast.makeText(this, "Invalid Login Credentials", Toast.LENGTH_LONG);
        }
    }

    //static int i = 0;
    public void addCart(View view) {
        TextView textView = findViewById(R.id.price_total2);
        double price = Double.parseDouble(textView.getText().toString().replace("$", ""));
        String text = "$" + String.valueOf(++price);
        textView.setText(text);
        Log.i(TAG, "Value Successfully Increased! :" /**+ ++i**/);
    }



}



// class DownloadFilesTask extends AsyncTask<String, String, String> {
//    String line = "";
//    StringBuilder string = new StringBuilder();
//    protected String doInBackground(String... urls) {
//        try {
//            URL url  = new URL("http://amazingbakery.herokuapp.com/products/get");
//            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
//
//
//            while((line = in.readLine()) != null) {
//                string.append(line);
//            }
//
//            in.close() ;
//        }
//
//        catch(Exception e) {}
//        return "";
//    }
//
//
//    protected void onPostExecute(String result) {
//
//
//    }
//
//
//}
