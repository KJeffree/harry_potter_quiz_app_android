package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0;

    public void button1A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer1("Incorrect! Answer = B");
        deactivateButton1();
    }
    public void button1B(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer1("Correct! Answer = B");
        deactivateButton1();
    }
    public void button1C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer1("Incorrect! Answer = B");
        deactivateButton1();
    }
    public void button1D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer1("Incorrect! Answer = B");
        deactivateButton1();
    }

    public void button2A(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer2("Ccorrect! Answer = A");
        deactivateButton2();
    }
    public void button2B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer2("Incorrect! Answer = A");
        deactivateButton2();
    }
    public void button2C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer2("Incorrect! Answer = A");
        deactivateButton2();
    }
    public void button2D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer2("Incorrect! Answer = A");
        deactivateButton2();
    }

    public void button3A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer3("Incorrect! Answer = B");
        deactivateButton3();
    }
    public void button3B(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer3("Correct! Answer = B");
        deactivateButton3();
    }
    public void button3C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer3("Incorrect! Answer = B");
        deactivateButton3();
    }
    public void button3D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer3("Incorrect! Answer = B");
        deactivateButton3();
    }

    public void button4A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer4("Incorrect! Answer = C");
        deactivateButton4();
    }
    public void button4B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer4("Incorrect! Answer = C");
        deactivateButton4();
    }
    public void button4C(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer4("Correct! Answer = C");
        deactivateButton4();
    }
    public void button4D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer4("Incorrect! Answer = C");
        deactivateButton4();
    }

    public void button5A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer5("Incorrect! Answer = D");
        deactivateButton5();
    }
    public void button5B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer5("Incorrect! Answer = D");
        deactivateButton5();
    }
    public void button5C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer5("Incorrect! Answer = D");
        deactivateButton5();
    }
    public void button5D(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer5("Correct! Answer = D");
        deactivateButton5();
    }
    public void button6A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer6("Incorrect! Answer = D");
        deactivateButton6();
    }
    public void button6B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer6("Incorrect! Answer = D");
        deactivateButton6();
    }
    public void button6C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer6("Incorrect! Answer = D");
        deactivateButton6();
    }
    public void button6D(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer6("Correct! Answer = D");
        deactivateButton6();
    }
    public void button7A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer7("Incorrect! Answer = B");
        deactivateButton7();
    }
    public void button7B(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer7("Correct! Answer = B");
        deactivateButton7();
    }
    public void button7C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer7("Incorrect! Answer = B");
        deactivateButton7();
    }
    public void button7D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer7("Incorrect! Answer = B");
        deactivateButton7();
    }
    public void button8A(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer8("Correct! Answer = A");
        deactivateButton8();
    }
    public void button8B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer8("Inorrect! Answer = A");
        deactivateButton8();
    }
    public void button8C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer8("Incorrect! Answer = A");
        deactivateButton8();
    }
    public void button8D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer8("Incorrect! Answer = A");
        deactivateButton8();
    }
    public void button9A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer9("Incorrect! Answer = C");
        deactivateButton9();
    }
    public void button9B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer9("Incorrect! Answer = C");
        deactivateButton9();
    }
    public void button9C(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer9("Correct! Answer = C");
        deactivateButton9();
    }
    public void button9D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer9("Incorrect! Answer = C");
        deactivateButton9();
    }
    public void button10A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer10("Incorrect! Answer = B");
        deactivateButton10();
    }
    public void button10B(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer10("Correct! Answer = B");
        deactivateButton10();
    }
    public void button10C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer10("Incorrect! Answer = B");
        deactivateButton10();
    }
    public void button10D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer10("Incorrect! Answer = B");
        deactivateButton10();
    }
    public void button11A(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer11("Correct! Answer = A");
        deactivateButton11();
    }
    public void button11B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer11("Incorrect! Answer = A");
        deactivateButton11();
    }
    public void button11C(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer11("Incorrect! Answer = A");
        deactivateButton11();
    }
    public void button11D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer11("Incorrect! Answer = A");
        deactivateButton11();
    }
    public void button12A(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer12("Incorrect! Answer = C");
        deactivateButton12();
    }
    public void button12B(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer12("Incorrect! Answer = C");
        deactivateButton12();
    }
    public void button12C(View view) {
        score = score + 1;
        displayScore(score);
        displayAnswer12("Correct! Answer = C");
        deactivateButton12();
    }
    public void button12D(View view) {
        score = score + 0;
        displayScore(score);
        displayAnswer12("Incorrect! Answer = C");
        deactivateButton12();
    }


    private void displayScore(int number) {
        TextView quantityTextView = findViewById(R.id.quiz_score);
        quantityTextView.setText("Score = " + number + " out of 12");
    }

    private void displayAnswer1(String response) {
        TextView answerTextView1 = findViewById(R.id.answer1);
        answerTextView1.setText(response);
    }
    private void displayAnswer2(String response) {
        TextView answerTextView2 = findViewById(R.id.answer2);
        answerTextView2.setText(response);
    }
    private void displayAnswer3(String response) {
        TextView answerTextView3 = findViewById(R.id.answer3);
        answerTextView3.setText(response);
    }
    private void displayAnswer4(String response) {
        TextView answerTextView4 = findViewById(R.id.answer4);
        answerTextView4.setText(response);
    }
    private void displayAnswer5(String response) {
        TextView answerTextView5 = findViewById(R.id.answer5);
        answerTextView5.setText(response);
    }
    private void displayAnswer6(String response) {
        TextView answerTextView6 = findViewById(R.id.answer6);
        answerTextView6.setText(response);
    }
    private void displayAnswer7(String response) {
        TextView answerTextView7 = findViewById(R.id.answer7);
        answerTextView7.setText(response);
    }
    private void displayAnswer8(String response) {
        TextView answerTextView8 = findViewById(R.id.answer8);
        answerTextView8.setText(response);
    }
    private void displayAnswer9(String response) {
        TextView answerTextView9 = findViewById(R.id.answer9);
        answerTextView9.setText(response);
    }
    private void displayAnswer10(String response) {
        TextView answerTextView10 = findViewById(R.id.answer10);
        answerTextView10.setText(response);
    }
    private void displayAnswer11(String response) {
        TextView answerTextView11 = findViewById(R.id.answer11);
        answerTextView11.setText(response);
    }
    private void displayAnswer12(String response) {
        TextView answerTextView12 = findViewById(R.id.answer12);
        answerTextView12.setText(response);
    }

    private void deactivateButton1() {
        Button deactivate1A = findViewById(R.id.button_1A);
        deactivate1A.setEnabled(false);
        Button deactivate1B = findViewById(R.id.button_1B);
        deactivate1B.setEnabled(false);
        Button deactivate1C = findViewById(R.id.button_1C);
        deactivate1C.setEnabled(false);
        Button deactivate1D = findViewById(R.id.button_1D);
        deactivate1D.setEnabled(false);
    }
    private void deactivateButton2() {
        Button deactivate2A = findViewById(R.id.button_2A);
        deactivate2A.setEnabled(false);
        Button deactivate2B = findViewById(R.id.button_2B);
        deactivate2B.setEnabled(false);
        Button deactivate2C = findViewById(R.id.button_2C);
        deactivate2C.setEnabled(false);
        Button deactivate2D = findViewById(R.id.button_2D);
        deactivate2D.setEnabled(false);
    }
    private void deactivateButton3() {
        Button deactivate3A = findViewById(R.id.button_3A);
        deactivate3A.setEnabled(false);
        Button deactivate3B = findViewById(R.id.button_3B);
        deactivate3B.setEnabled(false);
        Button deactivate3C = findViewById(R.id.button_3C);
        deactivate3C.setEnabled(false);
        Button deactivate3D = findViewById(R.id.button_3D);
        deactivate3D.setEnabled(false);
    }
    private void deactivateButton4() {
        Button deactivate4A = findViewById(R.id.button_4A);
        deactivate4A.setEnabled(false);
        Button deactivate4B = findViewById(R.id.button_4B);
        deactivate4B.setEnabled(false);
        Button deactivate4C = findViewById(R.id.button_4C);
        deactivate4C.setEnabled(false);
        Button deactivate4D = findViewById(R.id.button_4D);
        deactivate4D.setEnabled(false);
    }
    private void deactivateButton5() {
        Button deactivate5A = findViewById(R.id.button_5A);
        deactivate5A.setEnabled(false);
        Button deactivate5B = findViewById(R.id.button_5B);
        deactivate5B.setEnabled(false);
        Button deactivate5C = findViewById(R.id.button_5C);
        deactivate5C.setEnabled(false);
        Button deactivate5D = findViewById(R.id.button_5D);
        deactivate5D.setEnabled(false);
    }
    private void deactivateButton6() {
        Button deactivate6A = findViewById(R.id.button_6A);
        deactivate6A.setEnabled(false);
        Button deactivate6B = findViewById(R.id.button_6B);
        deactivate6B.setEnabled(false);
        Button deactivate6C = findViewById(R.id.button_6C);
        deactivate6C.setEnabled(false);
        Button deactivate6D = findViewById(R.id.button_6D);
        deactivate6D.setEnabled(false);
    }
    private void deactivateButton7() {
        Button deactivate7A = findViewById(R.id.button_7A);
        deactivate7A.setEnabled(false);
        Button deactivate7B = findViewById(R.id.button_7B);
        deactivate7B.setEnabled(false);
        Button deactivate7C = findViewById(R.id.button_7C);
        deactivate7C.setEnabled(false);
        Button deactivate7D = findViewById(R.id.button_7D);
        deactivate7D.setEnabled(false);
    }
    private void deactivateButton8() {
        Button deactivate8A = findViewById(R.id.button_8A);
        deactivate8A.setEnabled(false);
        Button deactivate8B = findViewById(R.id.button_8B);
        deactivate8B.setEnabled(false);
        Button deactivate8C = findViewById(R.id.button_8C);
        deactivate8C.setEnabled(false);
        Button deactivate8D = findViewById(R.id.button_8D);
        deactivate8D.setEnabled(false);
    }
    private void deactivateButton9() {
        Button deactivate9A = findViewById(R.id.button_9A);
        deactivate9A.setEnabled(false);
        Button deactivate9B = findViewById(R.id.button_9B);
        deactivate9B.setEnabled(false);
        Button deactivate9C = findViewById(R.id.button_9C);
        deactivate9C.setEnabled(false);
        Button deactivate9D = findViewById(R.id.button_9D);
        deactivate9D.setEnabled(false);
    }
    private void deactivateButton10() {
        Button deactivate10A = findViewById(R.id.button_10A);
        deactivate10A.setEnabled(false);
        Button deactivate10B = findViewById(R.id.button_10B);
        deactivate10B.setEnabled(false);
        Button deactivate10C = findViewById(R.id.button_10C);
        deactivate10C.setEnabled(false);
        Button deactivate10D = findViewById(R.id.button_10D);
        deactivate10D.setEnabled(false);
    }
    private void deactivateButton11() {
        Button deactivate11A = findViewById(R.id.button_11A);
        deactivate11A.setEnabled(false);
        Button deactivate11B = findViewById(R.id.button_11B);
        deactivate11B.setEnabled(false);
        Button deactivate11C = findViewById(R.id.button_11C);
        deactivate11C.setEnabled(false);
        Button deactivate11D = findViewById(R.id.button_11D);
        deactivate11D.setEnabled(false);
    }
    private void deactivateButton12() {
        Button deactivate12A = findViewById(R.id.button_12A);
        deactivate12A.setEnabled(false);
        Button deactivate12B = findViewById(R.id.button_12B);
        deactivate12B.setEnabled(false);
        Button deactivate12C = findViewById(R.id.button_12C);
        deactivate12C.setEnabled(false);
        Button deactivate12D = findViewById(R.id.button_12D);
        deactivate12D.setEnabled(false);
    }

}
