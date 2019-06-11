package com.example.cedri_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_chart_list.*
import com.example.cedri_app.model.Chart
import kotlinx.android.synthetic.main.activity_chart_list.backImageButtonChartList

class ChartListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart_list)

        backImageButtonChartList.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val recyclerView = chart_list_recyclerview
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ChartListAdapter(charts(), this)
        val layoutManager = LinearLayoutManager(this)
        //val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    private fun charts(): List<Chart> {
        return listOf(
            Chart("Awards",
                "Num sabo"),
            Chart("Intellectual Properties",
                "Piechart"),
            Chart("Outcomes",
                "Piechart"),
            Chart("Publications",
                "Piechart"),
            Chart("Theses",
                "Piechart")
        )
    }
}