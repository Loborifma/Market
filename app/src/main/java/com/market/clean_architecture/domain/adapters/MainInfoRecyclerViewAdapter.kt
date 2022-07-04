package com.market.clean_architecture.domain.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.market.clean_architecture.domain.models.ProductMainInfo


class MainInfoRecyclerViewAdapter(private var products: MutableList<ProductMainInfo>)
    : RecyclerView.Adapter<MainInfoRecyclerViewAdapter.ViewHolder>() {

    private val TAG = "myLogs"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(com.market.R.layout.item, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(products[position].image)
        holder.cost.text = products[position].cost
        holder.name.text = products[position].name
    }

    override fun getItemCount(): Int {
        return products.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(com.market.R.id.image_of_product)
        val cost: TextView = itemView.findViewById(com.market.R.id.tvCost)
        val name: TextView = itemView.findViewById(com.market.R.id.tvName)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    fun filterList(filteredList: MutableList<com.market.clean_architecture.domain.models.ProductMainInfo>){
        products = filteredList

        for (product in products){
            Log.d(TAG, "filterList: ${product.name}")
        }

        notifyDataSetChanged()
    }
}