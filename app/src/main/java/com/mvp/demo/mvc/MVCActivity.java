package com.mvp.demo.mvc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.mvp.demo.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.Flowable;

/**
 * Created by Peter on 2019/7/25.
 *
 * @author Peter
 * @data 2019/7/25
 */
public class MVCActivity extends AppCompatActivity {
	
	@Override
	protected void onPostCreate(@Nullable Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		setContentView(R.layout.activity_mvc);
		Flowable.just("hello world").subscribe(System.out::println);
	}
	
	public  static  void launch(Context context){
		context.startActivity(new Intent(context,MVCActivity.class));
	}
}
