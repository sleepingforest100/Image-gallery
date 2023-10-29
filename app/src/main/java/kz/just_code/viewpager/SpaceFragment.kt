package kz.just_code.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.just_code.viewpager.databinding.FragmentSpaceBinding

class SpaceFragment(private val spacePhotos: SpacePhotos?): Fragment() {
private lateinit var binding: FragmentSpaceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpaceBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spacePhotos?.let {
            binding.image.setImageResource(it.image)
        }
    }
}