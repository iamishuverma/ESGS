package com.example.careerrecommendation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<Student> students;
    Context context;

    // Constructor for initialization
    public Adapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the Layout(Instantiates list_item.xml
        // layout file into View object)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        // Passing view to ViewHolder
        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);
        return viewHolder;
    }

    // Binding data to the into specified position
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.text.setText((String) students.get(position).name);
    }

    @Override
    public int getItemCount() {
        // Returns number of items
        // currently available in Adapter
        return students.size();
    }

    // Initializing the Views
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView text;

        public ViewHolder(View view) {
            super(view);

            view.setOnClickListener(this);
            text = (TextView) view.findViewById(R.id.studentName);
        }

        @Override
        public void onClick(View view)
        {
            int studentIndex = this.getAdapterPosition();
            Student student = students.get(studentIndex);

            Intent intent = new Intent(context, SkillsQuestionnaire.class);
            intent.putExtra("student", student);

            context.startActivity(intent);
        }
    }
}

