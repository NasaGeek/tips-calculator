package com.scepticallistic.kevin.tipcalc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView functionView = (TextView)findViewById(R.id.function_help);
        functionView.setText(Html.fromHtml(getString(R.string.functions_help_text)));

        TextView splitView = (TextView)findViewById(R.id.split_help);
        splitView.setText(Html.fromHtml(getString(R.string.split_help_text)));

        Button feedback = (Button) findViewById(R.id.feedback_button);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.scepticallistic.kevin.tipscalc"));
                startActivity(intent);
            }
        });
    }
}
