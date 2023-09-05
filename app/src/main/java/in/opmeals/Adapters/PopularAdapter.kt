package `in`.opmeals.Adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import `in`.opmeals.databinding.PopularItemsBinding

class PopularAdapter(private val items : List<String>,private val price : List<String> ,private val images: List<Int>) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopularItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val items = items[position]
        val image = images[position]
        val price = price[position]
        holder.bind(items,price,image)
    }

    override fun getItemCount(): Int {
        return items.size
    }
    class PopularViewHolder (private val binding:PopularItemsBinding) : RecyclerView.ViewHolder(binding.root){
        private val imageView = binding.imageView
        fun bind(items: String,price : String, image: Int) {
            binding.foodNamePopular.text = items
            binding.foodPricePopular.text = price
            imageView.setImageResource(image)
        }

    }
}