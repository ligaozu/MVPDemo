package com.mvp.demo.mvp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.mvp.demo.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Peter on 2019/7/25.
 *
 * @author Peter
 * @data 2019/7/25
 */
public class MVPActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mvp);
	}
	
	public static void launch(Context context){
		context.startActivity(new Intent(context,MVPActivity.class));
	}
}
