package org.parkpickup;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.parkpickup.api.ParkPickupContorllerV1;
import org.parkpickup.client.ClientEnv;
import org.parkpickup.client.ParkPickupV1Client;

public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ParkPickupContorllerV1 parkPickupContorllerV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.parkPickupContorllerV1 = new ParkPickupV1Client(ClientEnv.TEST);
        this.parkPickupContorllerV1.getParks()

        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ParksRecyclerAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
