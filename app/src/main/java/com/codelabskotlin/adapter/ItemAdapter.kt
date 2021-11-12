package com.codelabskotlin.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import codelabskotlin.model.Affirmation
import com.codelabskotlin.R

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(), Parcelable {
    constructor(parcel: Parcel) : this(
        TODO("context"),
        TODO("dataset")
    ) {
    }

    class ItemViewHolder(private val view:View): RecyclerView.ViewHolder(view)
    {
        val textView:TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemAdapter> {
        override fun createFromParcel(parcel: Parcel): ItemAdapter {
            return ItemAdapter(parcel)
        }

        override fun newArray(size: Int): Array<ItemAdapter?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder
    {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //método chamado pelo gerenciador de layout para substituir o conteúdo de visualização de cada item da lista
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}











