package com.yarolave.androidcourseudsu.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.yarolave.androidcourseudsu.ListActivity
import com.yarolave.androidcourseudsu.R
import com.yarolave.androidcourseudsu.base.BaseActivity


class MainActivity : BaseActivity<MainViewModel>(MainViewModel::class) {

    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView : TextView = findViewById<TextView>(R.id.textView)

        viewModel.userList.observe(this, {
            textView.text = it
        })
    }

    fun onClickOpenListActivity(view: View) {
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }
}