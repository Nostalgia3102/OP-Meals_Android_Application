package `in`.opmeals.Adapters

import android.provider.MediaStore.Images
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import `in`.opmeals.databinding.BuyAgainItemBinding

class BuyAgainAdapter(private val buyAgainFoodName : ArrayList<String>, private val buyAgainFoodDate : ArrayList<String>, private val buyAgainImage: ArrayList<Int>) :
    RecyclerView.Adapter<BuyAgainAdapter.BuyAgainViewHolder>() {

    override fun onBindViewHolder(holder: BuyAgainViewHolder, position: Int) {
        holder.bind(buyAgainFoodName[position],buyAgainFoodDate[position],buyAgainImage[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyAgainViewHolder {
        val binding = BuyAgainItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BuyAgainViewHolder(binding)
    }

    override fun getItemCount(): Int  = buyAgainFoodName.size

    class BuyAgainViewHolder(private val binding : BuyAgainItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(foodName: String, foodDate: String, foodImage: Int) {
                binding.buyAgainFoodName.text = foodName
            binding.BuyAgainFoodDate.text = foodDate
            binding.buyAgainFoodImage.setImageResource(foodImage)
        }

    }


}