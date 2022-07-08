package com.example.careerrecommendation;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Student> students = new ArrayList<>();

    void fillStudents()
    {
        Student[] studentsData = SurveyData.getStudentPreferences();
        int numberOfStudents = studentsData.length;

        students.addAll(Arrays.asList(studentsData).subList(0, numberOfStudents));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting reference of recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // Setting the layout as linear
        // layout for vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);

        fillStudents();

        // Sending reference and data to Adapter
        Adapter adapter = new Adapter(MainActivity.this, students);

        // Setting Adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
