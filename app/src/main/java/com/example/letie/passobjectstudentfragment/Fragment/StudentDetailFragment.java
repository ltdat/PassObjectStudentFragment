package com.example.letie.passobjectstudentfragment.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.letie.passobjectstudentfragment.InfoStudent;
import com.example.letie.passobjectstudentfragment.MainActivity;
import com.example.letie.passobjectstudentfragment.R;


public class StudentDetailFragment extends Fragment {

    TextView txvHoTenSV,txvQueQuan,txvNgaySinh,txvGioiTinh,txvLop,txvKhoaHoc;
    private InfoStudent infoStudent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.student_detail_fragment, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
           infoStudent = bundle.getParcelable("infoStudent");

            ((TextView)v.findViewById(R.id.txv_HoTenSV)).setText(infoStudent.getHoTenSV());
            ((TextView)v.findViewById(R.id.txv_QueQuan)).setText(infoStudent.getQueQuan());
            ((TextView)v.findViewById(R.id.txv_NgaySinh)).setText(infoStudent.getNgaySinh());
            ((TextView)v.findViewById(R.id.txv_GioiTinh)).setText(infoStudent.getGioiTinh());
            ((TextView)v.findViewById(R.id.txv_Lop)).setText(infoStudent.getLop());
            ((TextView)v.findViewById(R.id.txv_KhoaHoc)).setText(infoStudent.getKhoaHoc());

        }
        return v;
    }


}
