package com.example.diy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StepsAdapter extends RecyclerView.Adapter<StepsAdapter.StepsViewHolder> {

    private Context Ctx;
    private List<String> stepList;

    public StepsAdapter(Context Ctx, List<String> stepList) {
        this.Ctx = Ctx;
        this.stepList = stepList;
    }

    @NonNull
    @Override
    public StepsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.row_steps, null);
        return new StepsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StepsViewHolder stepsViewHolder, int i) {

        stepsViewHolder.step.setText(stepList.get(i));
        stepsViewHolder.no.setText(String.valueOf(i+1+"."));

    }

    @Override
    public int getItemCount() {
        return stepList.size();
    }

    public class StepsViewHolder extends RecyclerView.ViewHolder {

        TextView step, no;

        public StepsViewHolder(@NonNull View itemView) {
            super(itemView);

            step = itemView.findViewById(R.id.steps);
            no = itemView.findViewById(R.id.no);
        }
    }
}
