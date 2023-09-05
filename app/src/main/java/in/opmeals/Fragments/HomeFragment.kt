package `in`.opmeals.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import `in`.opmeals.Adapters.PopularAdapter
import `in`.opmeals.R
import `in`.opmeals.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

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
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner3,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner4,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.breakfastmenu,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.lunchmenu,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.dinnerveg,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.dinnernonveg,ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList,ScaleTypes.FIT)

        val foodName = listOf("Monthly Veg Plan", "Monthly Non-Veg Plan")
        val price = listOf("₹2999/-", "₹3499/-")
        val popularFoodImages = listOf(R.drawable.dinnerveg, R.drawable.dinnernonveg)

        val adapter = PopularAdapter(foodName,price,popularFoodImages)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
    }

    companion object {

    }
}