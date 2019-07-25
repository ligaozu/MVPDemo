package com.mvp.demo;

import android.os.Bundle;
import android.view.View;

import com.mvp.demo.mvc.MVCActivity;
import com.mvp.demo.mvp.MVPActivity;
import com.mvp.demo.mvvm.MVVMActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.mvc).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MVCActivity.launch(MainActivity.this);
			}
		});
		
		findViewById(R.id.mvp).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MVPActivity.launch(MainActivity.this);
			}
		});
		findViewById(R.id.mvvm).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MVVMActivity.launch(MainActivity.this);
			}
		});
		
		
	}
}
