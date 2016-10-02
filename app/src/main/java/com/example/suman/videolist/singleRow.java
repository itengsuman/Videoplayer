package com.example.suman.videolist;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by suman on 9/26/2016.
 */
public class singleRow implements Parcelable {
    String thumbnail;
    String VideoTitle;
    String videoID;
    public singleRow(String img,String title,String id){
        this.thumbnail=img;
        this.VideoTitle=title;
        this.videoID=id;
    }

    protected singleRow(Parcel in) {
        thumbnail = in.readString();
        VideoTitle = in.readString();
        videoID = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(thumbnail);
        dest.writeString(VideoTitle);
        dest.writeString(videoID);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<singleRow> CREATOR = new Parcelable.Creator<singleRow>() {
        @Override
        public singleRow createFromParcel(Parcel in) {
            return new singleRow(in);
        }

        @Override
        public singleRow[] newArray(int size) {
            return new singleRow[size];
        }
    };
}

