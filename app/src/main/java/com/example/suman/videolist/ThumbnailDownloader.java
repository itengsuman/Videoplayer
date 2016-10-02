package com.example.suman.videolist;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.IOException;
import java.net.URL;

/**
 * Created by suman on 9/26/2016.
 */
public class ThumbnailDownloader extends AsyncTask<String,Void,Bitmap> {
    Bitmap result;
    @Override
    protected Bitmap doInBackground(String... strings) {
        try {
            result= BitmapFactory.decodeStream(new URL(strings[0]).openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
//        InterviewTipsActivity.myThumbnail.setImageBitmap(bitmap);
//        InterviewTipsActivity.row_thumbnails=bitmap;
//        Log.d("YoutubeListDownloader", "doInBackground: thumbnaildownload");
    }
}

