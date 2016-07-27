package com.example.administrator.mybdmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {
    // 百度地图控件
    private MapView mMapView = null;
    // 百度地图对象
    private BaiduMap bdMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * 初始化方法
     */
    private void init() {
        mMapView = (MapView) findViewById(R.id.bmapview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    protected void onDestroy() {
        mMapView.onDestroy();
        mMapView = null;
        super.onDestroy();
    }
}
