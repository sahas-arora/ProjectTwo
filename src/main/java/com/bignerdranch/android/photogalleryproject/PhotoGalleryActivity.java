package com.bignerdranch.android.photogalleryproject;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;


/**
 * Created by sahas.arora on 8/9/17.
 */

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return PhotoGalleryFragment.newInstance() ;
    }
       public static Intent newIntent(Context packageContext){
         Intent intent = new Intent(packageContext, PhotoGalleryActivity.class);
       return intent;
     }



}
