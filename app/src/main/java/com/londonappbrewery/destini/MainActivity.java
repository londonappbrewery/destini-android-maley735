package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mLevel = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mLevel == 1){
                    setLevel_3();
                }else if(mLevel == 3){
                    mStoryTextView.setText(R.string.T6_End);
                    buttonDisappear();
                }else if(mLevel == 2){
                    setLevel_3();
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mLevel == 1){
                    setLevel_2();
                }else if(mLevel == 3){
                    mStoryTextView.setText(R.string.T5_End);
                    buttonDisappear();
                }else{
                    mStoryTextView.setText(R.string.T4_End);
                    buttonDisappear();
                }
            }
        });

    }

    private void buttonDisappear(){
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

    private void setLevel_2(){
        mLevel = 2;
        mStoryTextView.setText(R.string.T2_Story);
        mButtonTop.setText(R.string.T2_Ans1);
        mButtonBottom.setText(R.string.T2_Ans2);
    }
    private void setLevel_3(){
        mLevel = 3;
        mStoryTextView.setText(R.string.T3_Story);
        mButtonTop.setText(R.string.T3_Ans1);
        mButtonBottom.setText(R.string.T3_Ans2);
    }
}
