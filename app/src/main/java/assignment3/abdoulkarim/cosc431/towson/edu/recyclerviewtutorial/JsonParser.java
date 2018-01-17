package assignment3.abdoulkarim.cosc431.towson.edu.recyclerviewtutorial;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Karim on 1/15/2018.
 */

public class JsonParser extends AsyncTask<Void,Void,Void> {
String website = "https://simplifiedcoding.net/demos/marvel/";
URL url;
String data="";
public static final String TAG = "MyActivity";
    RecyclerView MyrecyclerView;
    ItemClass item;
    ArrayList<ItemClass> list_of_items;


    @Override
    protected Void doInBackground(Void... voids) {
        try {
            url = new URL(website);
            HttpsURLConnection httpconnection =  (HttpsURLConnection)url.openConnection();
            InputStream inputStream = httpconnection.getInputStream();
            BufferedReader bufferreader =  new BufferedReader(new InputStreamReader(inputStream));
            String line ="";
            while(line!=null){
                line= bufferreader.readLine();
                data+=line;
                Log.e(TAG,data);
                list_of_items= new ArrayList<>();
                ItemClass item= new ItemClass(data,data);
                list_of_items.add(item);

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);


    }
}
