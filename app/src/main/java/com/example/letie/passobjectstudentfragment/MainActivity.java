package com.example.letie.passobjectstudentfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.letie.passobjectstudentfragment.Fragment.StudentDetailFragment;
import com.example.letie.passobjectstudentfragment.Fragment.StudentFragment;
import com.example.letie.passobjectstudentfragment.Fragment.StudentNameFragment;

public class MainActivity extends AppCompatActivity {
    public static String HOTENSV="HOTENSV";
    public static String BUNDLE="BUNDLE";
    private InfoStudent infoStudent;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    private void init() {
        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        StudentNameFragment studentName = new StudentNameFragment();

        transaction.replace(R.id.frame_content, studentName).commit();
    }
    public void gotoFragmentStudent(String hoTenSV) {
        StudentFragment studentFragment = new StudentFragment();

        Bundle bundle = new Bundle();
        bundle.putString(HOTENSV,hoTenSV);
        studentFragment.setArguments(bundle);

        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frame_content, studentFragment).addToBackStack(null).commit();
    }
    public void gotoFragmentStudentDetail(InfoStudent infoStudent) {
        StudentDetailFragment studentDetailFragment = new StudentDetailFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable("infoStudent",infoStudent);
        studentDetailFragment.setArguments(bundle);

        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frame_content, studentDetailFragment).addToBackStack(null).commit();
    }

}
