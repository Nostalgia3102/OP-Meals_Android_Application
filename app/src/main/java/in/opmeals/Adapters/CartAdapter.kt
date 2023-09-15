package `in`.opmeals.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import `in`.opmeals.databinding.CartItemBinding

class CartAdapter(private val cartItems:MutableList<String>, private val cartItemsPrice:MutableList<String>, private val CartImage: MutableList<Int>): RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val itemQuantities = IntArray(cartItems.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        var binding = CartItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartViewHolder(binding)
    }
    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartItems.size

    inner class CartViewHolder(private val binding: CartItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {

                val quantity = itemQuantities[position]

                cartFoodName.text = cartItems[position]
                cartPrice.text = cartItemsPrice[position]
                cartImage.setImageResource(CartImage[position])
                cartItemQuantity.text = quantity.toString()

                //Button Actions :
                buttonMinus.setOnClickListener{
                    decreaseQuantity(position)
                }
                buttonAdd.setOnClickListener {
                    increaseQuantity(position)
                }
                buttonTrash.setOnClickListener {
                    val itemPosition = adapterPosition
                    if(itemPosition != RecyclerView.NO_POSITION)
                    deleteItem(itemPosition)
                }
            }
        }

        fun increaseQuantity(position: Int){
            if(itemQuantities[position] < 10){
                itemQuantities[position]++
                binding.cartItemQuantity.text = itemQuantities[position].toString()
            }
        }

        fun decreaseQuantity(position: Int){
            if(itemQuantities[position] > 1){
                itemQuantities[position]--
                binding.cartItemQuantity.text = itemQuantities[position].toString()
            }
        }

        fun deleteItem(position: Int){
            cartItems.removeAt(position)
            cartItemsPrice.removeAt(position)
            CartImage.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,cartItems.size)
        }

    }

}