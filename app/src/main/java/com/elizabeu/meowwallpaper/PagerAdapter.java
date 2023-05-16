package com.elizabeu.meowwallpaper;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    WallpaperPage wallpaperPage;
    ArrayList<String> arrayList;
    public PagerAdapter(WallpaperPage wallpaperPage, ArrayList<String> arrayList) {
        this.arrayList = arrayList;
        this.wallpaperPage = wallpaperPage;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(wallpaperPage).inflate(R.layout.pager_adapter_item,container,false);
        ImageView imageView,share,down,wall;
        imageView = view.findViewById(R.id.img_pager);
        share = view.findViewById(R.id.share);
        down = view.findViewById(R.id.down);
        wall = view.findViewById(R.id.wall);
        Glide.with(wallpaperPage).load(arrayList.get(position)).into(imageView);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new shareImage().execute(arrayList.get(position));

            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(wallpaperPage, "This feature will be added soon!!!", Toast.LENGTH_SHORT).show();
            }
        });

        wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new setWallPaper().execute(arrayList.get(position));

            }
        });


        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }



    class shareImage extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
        }

        @Override
        protected Bitmap doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);


                Bitmap b = myBitmap;
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("image/jpeg");
                share.setType("text/html");
                share.putExtra(Intent.EXTRA_TEXT, "shre body");
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                b.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                String path = MediaStore.Images.Media.insertImage(wallpaperPage.getContentResolver(),
                        b, "Title", null);
                Uri imageUri = Uri.parse(path);
                share.putExtra(Intent.EXTRA_STREAM, imageUri);
                wallpaperPage.startActivity(Intent.createChooser(share, "Select"));


            } catch (Exception e) {

                e.printStackTrace();

            }

            return null;
        }
    }

    class setWallPaper extends AsyncTask<String, Void, Bitmap> {

        Random random;
        int var;

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);

            Toast.makeText(wallpaperPage, "Wallpaper set Success", Toast.LENGTH_SHORT).show();

        }

        @Override
        protected Bitmap doInBackground(String... urls) {

            random = new Random();
            var = random.nextInt(10000);

            try {

                URL url = new URL(urls[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);
                WallpaperManager myWallpaperManager
                        = WallpaperManager.getInstance(wallpaperPage.getApplicationContext());
                try {
                    myWallpaperManager.setBitmap(myBitmap);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            } catch (Exception e) {

                e.printStackTrace();

            }
            return null;
        }
    }
}
