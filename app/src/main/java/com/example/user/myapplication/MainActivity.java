package com.example.user.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private ViewPager viewPager;
    private Page1 page1;
    private Page2 page2;
    private Page3 page3;
    private Page4 page4;
    private Fragment[] pages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmgr = getSupportFragmentManager();

        page1 = new Page1(); page2 = new Page2(); page3 = new Page3(); page4 = new Page4();

        pages=new Fragment[]{page1,page2,page3,page4};

        viewPager=(ViewPager)findViewById(R.id.viewPager);

        viewPager.setAdapter(new MyPagerAdater(fmgr));
    }

    private class MyPagerAdater extends FragmentStatePagerAdapter{

        public MyPagerAdater(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return pages[position];
        }

        @Override
        public int getCount() {
            return pages.length;
        }
    }
    public void gotoPage1(View view){

    }
    public void gotoPage2(View view){

    }
    public void gotoPage3(View view){

    }
    public void gotoPage4(View view){

    }
}
