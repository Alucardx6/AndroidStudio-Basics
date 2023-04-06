package com.example.uniproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnListView, btnRecView, btnConditions, btnAbout, btnVariables, btnLoops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        btnListView.setOnClickListener( v -> {
            startActivity(new Intent(this, ListViewActivity.class));
        });

        btnRecView.setOnClickListener( v -> {
            startActivity(new Intent(this, RecyclerViewActivity.class));
        });

        btnConditions.setOnClickListener( v -> {
            startActivity(new Intent(this, ConditionActivity.class));
        });

        btnVariables.setOnClickListener( v -> {
            startActivity(new Intent(this, VariablesActivity.class));
        });

        btnLoops.setOnClickListener( v -> {
            startActivity(new Intent(this, LoopsActivity.class));
        });

        btnAbout.setOnClickListener( v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.app_name);
            builder.setMessage("Designed and Developed with Love by Sepehr at ABYX.ir\n" +
                    "Check our website for more awesome applications:");
            builder.setNegativeButton("Dismiss", (dialogInterface, i) -> {
            });

            builder.setPositiveButton("Visit", (dialogInterface, i) -> {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://abyx.ir/"));
                startActivity(browserIntent);
            });
            builder.create().show();
        });
    }

    private void initView() {
        btnListView = findViewById(R.id.btnListView);
        btnRecView = findViewById(R.id.btnRecyclerView);
        btnConditions = findViewById(R.id.btnConditions);
        btnAbout = findViewById(R.id.btnAbout);
        btnVariables = findViewById(R.id.btnVariables);
        btnLoops = findViewById(R.id.btnLoops);
    }
}