package com.soha.infotech.androiddesignpatterns.designpatterns

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Step6: Adapter design pattern
 */


class HamburgerAdapter(val hamburger: List<Hamburger>) :
    RecyclerView.Adapter<HamburgerAdapter.HamburgerViewHolder>() {

    inner class HamburgerViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HamburgerViewHolder {
        return HamburgerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                0,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return hamburger.size
    }

    override fun onBindViewHolder(holder: HamburgerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
