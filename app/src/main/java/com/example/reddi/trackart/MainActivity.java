package com.example.reddi.trackart;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;

import com.example.reddi.trackart.Fragments.CalendarFragment;
import com.example.reddi.trackart.Fragments.FriendsFragment;
import com.example.reddi.trackart.Fragments.InboxFragment;
import com.example.reddi.trackart.Fragments.ProfileFragment;
import com.example.reddi.trackart.Fragments.SearchFragment;
import com.github.clans.fab.FloatingActionButton;
import com.squareup.picasso.Picasso;

public class MainActivity extends FragmentActivity {

    private static final int NUM_PAGES = 5;

    private FloatingActionButton searchButton;
    private FloatingActionButton profileButton;
    private FloatingActionButton friendsButton;
    private FloatingActionButton calendarButton;
    private FloatingActionButton inboxButton;


    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO comment this, is enabled for debug
        Picasso.with(getBaseContext()).setLoggingEnabled(true);
        setContentView(R.layout.activity_main);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);

        searchButton = (FloatingActionButton) findViewById(R.id.search_button);
        profileButton = (FloatingActionButton) findViewById(R.id.profile_button);
        friendsButton = (FloatingActionButton) findViewById(R.id.friends_button);
        calendarButton = (FloatingActionButton) findViewById(R.id.calendar_button);
        inboxButton = (FloatingActionButton) findViewById(R.id.inbox_button);

        setButtonsListeners();

        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

    }

    private void setButtonsListeners(){
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(0,true);
            }
        });
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(1,true);
            }
        });
        friendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(2,true);
            }
        });
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(3,true);
            }
        });
        inboxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(4,true);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0 ){
                return new SearchFragment();
            }else if(position == 1){
                return new ProfileFragment();
            }else if(position == 2){
                return new FriendsFragment();
            }else if(position == 3){
                return new CalendarFragment();
            }else{
                return new InboxFragment();
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
