package com.bwie.newstitleshiyabin.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.bwie.newstitleshiyabin.R;
import com.bwie.newstitleshiyabin.activity.SouSuo;

/**
 * 1. 类的用途
 * 2. @author Administrator
 * 3. @date 2017/2/10 12:15
 */


public class Fragment_XW extends Fragment {

    private View view;
    private EditText fragXwEt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_xw,null);
        kongjian();

        return view;
    }

    private void kongjian() {
        fragXwEt = (EditText) view.findViewById(R.id.frag_xw_et);
        fragXwEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getActivity(), SouSuo.class);
                startActivity(it);
            }
        });

    }
}
