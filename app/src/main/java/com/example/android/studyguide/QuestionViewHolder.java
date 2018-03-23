package com.example.android.studyguide;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class QuestionViewHolder extends RecyclerView.ViewHolder{

    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public TextView countryImage;
    Context context;
    //what am I missing from the Question class?

    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        questionCountry = (TextView) itemView.findViewById(R.id.question_country);
        countryQuestion = (TextView) itemView.findViewById(R.id.country_question);
        countryImage = (TextView) itemView.findViewById(R.id.country_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayAnswer();

            }
       private void displayAnswer() { //something within this method is not set up correctly. I don't think I need to initiate the Question class but not sure the other method. 
                int messageResId = 0;
                Question question = new Question();
                if (question.isTrue) {
                    messageResId = R.string.correct_toast;
                } else {
                    messageResId = R.string.incorrect_toast;
                }

                Toast.makeText(context, messageResId, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
