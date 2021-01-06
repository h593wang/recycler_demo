package com.palepeak.recyclerview_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The data
        val data = listOf(
                ListEntries("Entry 1", "Test"),
                ListEntries("Entry 2", "Test"),
                ListEntries("Entry 3", "Test"),
                ListEntries("Entry 4", "Test"),
                ListEntries("Entry 5", "Test"),
                ListEntries("Entry 6", "Test"),
                ListEntries("Entry 7", "Test"),
                ListEntries("Entry 8", "Test"),
                ListEntries("Entry 9", "Test"),
                ListEntries("Entry 10", "Test"),
                ListEntries("Entry 11", "Test"),
                ListEntries("Entry 12", "Test"),
                ListEntries("Entry 13", "Test"),
                ListEntries("Entry 14", "Test"),
                ListEntries("Entry 15", "Test"),
                ListEntries("Entry 16", "Test"),
                ListEntries("Entry 17", "Test"),
                ListEntries("Entry 18", "Test")
        )

        // The View
        recyclerView.layoutManager = LinearLayoutManager(this)
        // The Adapter
        recyclerView.adapter = MyAdapter(data)

    }

    data class ListEntries(val entry1: String, val entry2: String, var switched: Boolean = false)
}