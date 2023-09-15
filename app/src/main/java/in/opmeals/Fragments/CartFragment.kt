package `in`.opmeals.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import `in`.opmeals.Adapters.CartAdapter
import `in`.opmeals.R
import `in`.opmeals.databinding.FragmentCartBinding

class CartFragment : Fragment() {

    private lateinit var binding : FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater,container,false)

        val cartFoodName = listOf("Burger","Sandwitch","Momo", "Item", "Sandwich", "Momo")
        val cartItemPrice = listOf("20","89","78","78","90","34")
        val cartImage = listOf(
            R.drawable.dinnerveg,
            R.drawable.dinnerveg,
            R.drawable.dinnerveg,
            R.drawable.dinnerveg,
            R.drawable.dinnerveg,
            R.drawable.dinnerveg,
        )
        val adapter = CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}