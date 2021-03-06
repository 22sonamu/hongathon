package com.example.bottomnavi

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.samle.kakao3.MyCustomDialog
import com.samle.kakao3.R
import kotlinx.android.synthetic.main.fragement_home.*
import kotlinx.android.synthetic.main.fragement_home.view.*


class HomeFragement : Fragment() {




    companion object{
        const val TAG : String = "로그"
        //자기 자신을 가져온다.
        fun newInstance() : HomeFragement{
            return HomeFragement()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"HomeFragement - onCreate() called")

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"HomeFragement - onAttach() called")
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG,"HomeFragement - onCreateView() called")

        val view = inflater.inflate(R.layout.fragement_home, container, false)
        view.dialog_button.setOnClickListener {
            MyCustomDialog(view.context).show()



        }

        Glide.with(this).load(R.drawable.a).into(view.homeImg)

        return view
    }



}