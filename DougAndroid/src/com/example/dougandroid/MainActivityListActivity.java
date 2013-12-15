package com.example.dougandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;


/**
 * An activity representing a list of Items. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link MainActivityDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link MainActivityListFragment} and the item details
 * (if present) is a {@link MainActivityDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link MainActivityListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class MainActivityListActivity extends FragmentActivity
        implements MainActivityListFragment.Callbacks {

	private static final String DOUGTAG= "DougAndroid";
    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	Log.i(DOUGTAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity_list);

        if (findViewById(R.id.mainactivity_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((MainActivityListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.mainactivity_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.i(DOUGTAG, "On Start");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i(DOUGTAG, "On Resume");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i(DOUGTAG, "On Pause");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i(DOUGTAG, "On Stop");
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.i(DOUGTAG, "On Destroy");
    }

    /**
     * Callback method from {@link MainActivityListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(MainActivityDetailFragment.ARG_ITEM_ID, id);
            MainActivityDetailFragment fragment = new MainActivityDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.mainactivity_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, MainActivityDetailActivity.class);
            detailIntent.putExtra(MainActivityDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
