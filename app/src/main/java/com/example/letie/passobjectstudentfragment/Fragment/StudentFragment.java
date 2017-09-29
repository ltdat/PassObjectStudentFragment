package com.example.letie.passobjectstudentfragment.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.letie.passobjectstudentfragment.InfoStudent;
import com.example.letie.passobjectstudentfragment.MainActivity;
import com.example.letie.passobjectstudentfragment.R;

public class StudentFragment extends Fragment implements View.OnClickListener{
    private InfoStudent infoStudent;
    TextView txvHoTenSV;
    EditText edtQueQuan,edtNgaySinh,edtGioiTinh,edtLop,edtKhoaHoc;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.student_fragment, container, false);
        v.findViewById(R.id.btn_XacNhan).setOnClickListener(this);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String content = bundle.getString(MainActivity.HOTENSV);
            if (!TextUtils.isEmpty(content)) {
                ((TextView)v.findViewById(R.id.txv_HoTenSV)).setText(content);
            }
        }
        txvHoTenSV=(TextView) v.findViewById(R.id.txv_HoTenSV);
        edtQueQuan=(EditText)v.findViewById(R.id.edt_QueQuan);
        edtNgaySinh=(EditText)v.findViewById(R.id.edt_NgaySinh);
        edtGioiTinh=(EditText)v.findViewById(R.id.edt_GioiTinh);
        edtLop=(EditText)v.findViewById(R.id.edt_Lop);
        edtKhoaHoc=(EditText)v.findViewById(R.id.edt_KhoaHoc);
        return  v;
    }
    public void onClick(View v){
        infoStudent= new InfoStudent(txvHoTenSV.getText().toString(),edtQueQuan.getText().toString(),edtNgaySinh.getText().toString(),edtGioiTinh.getText().toString(),
                                    edtLop.getText().toString(),edtKhoaHoc.getText().toString());
        switch (v.getId()) {
        case R.id.btn_XacNhan: (
                (MainActivity)getActivity()).gotoFragmentStudentDetail(infoStudent);
            break;
        default:
            break;
        }
    }

}
