package `in`.opmeals.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import `in`.opmeals.Adapters.BuyAgainAdapter
import `in`.opmeals.R
import `in`.opmeals.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {

    private lateinit var binding : FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHistoryBinding.inflate(layoutInflater,container,false)
        setUpRecyclerView()
        return binding.root
    }

    private fun setUpRecyclerView(){
        val buyAgainFoodName = arrayListOf("Food 1" , "Food 2", "Food 3")
        val buyAgainFoodDate = arrayListOf("1-1-20" , "2-2-20", "3-3-20")
        val buyAgainFoodImage = arrayListOf(R.drawable.dinnerveg,R.drawable.dinnerveg,R.drawable.dinnerveg)

        buyAgainAdapter = BuyAgainAdapter(buyAgainFoodName,buyAgainFoodDate,buyAgainFoodImage)
        binding.buyAgainRecyclerView.adapter = buyAgainAdapter
        binding.buyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())

    }

    companion object {

    }
}