package com.example.letie.passobjectstudentfragment.Fragment;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


import com.example.letie.passobjectstudentfragment.R;
import com.example.letie.passobjectstudentfragment.MainActivity;

public class StudentNameFragment extends Fragment implements View.OnClickListener{

    private EditText edtHoTenSV;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.student_name_fragment, container, false);
        v.findViewById(R.id.btn_XacNhan).setOnClickListener(this);
        edtHoTenSV=(EditText)v.findViewById(R.id.edt_HoTenSV);
        return v;
    }
    public void onClick(View v){ switch (v.getId()) {
        case R.id.btn_XacNhan: (
                (MainActivity)getActivity()).gotoFragmentStudent(edtHoTenSV.getText().toString());
            break;
        default:
            break;
        }
    }


}
