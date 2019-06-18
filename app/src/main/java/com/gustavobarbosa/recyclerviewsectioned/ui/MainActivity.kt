package com.gustavobarbosa.recyclerviewsectioned.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.gustavobarbosa.recyclerviewsectioned.R
import kotlinx.android.synthetic.main.activity_main.rvMain

class MainActivity : AppCompatActivity() {

    val model = mutableListOf(
        HeaderModel("HEADER 0", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1"),
            BodyModel("Body 0 2")
        )),
        HeaderModel("HEADER 1", arrayListOf(
            BodyModel("Body 1 0")
        )),
        HeaderModel("HEADER 2", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1")
        )),
        HeaderModel("HEADER 3", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1")
        )),
        HeaderModel("HEADER 4", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1")
        )),
        HeaderModel("HEADER 5", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1")
        )),
        HeaderModel("HEADER 6", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1")
        )),
        HeaderModel("HEADER 7", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1")
        )),
        HeaderModel("HEADER 8", arrayListOf(
            BodyModel("Body 0 0"),
            BodyModel("Body 0 1")
        ))
    )
    private val adapter =  MainActivityRecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvMain.adapter = adapter
        adapter.putList(model)
    }
}
