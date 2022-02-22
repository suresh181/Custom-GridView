package com.example.customgrid

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyGridAdapter(private val context:Activity,
                    private val title:Array<String>,
                    private val image:Array<Int>) : ArrayAdapter<String>(context,R.layout.custom_grid,title)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val gridView = inflater.inflate(R.layout.custom_grid,null)
        val titleText = gridView.findViewById<TextView>(R.id.tv_text)
        val imageView = gridView.findViewById<ImageView>(R.id.iv_view)

        titleText.text = title[position]
        imageView.setImageResource(image[position])
        return gridView
    }
}