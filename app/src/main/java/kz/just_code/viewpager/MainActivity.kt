package kz.just_code.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kz.just_code.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentList: MutableList<Fragment> = mutableListOf()
        SpacePhotos.values().forEach {
            fragmentList.add(SpaceFragment(it))
        }

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, fragmentList)

        binding.viewPager.adapter = adapter
        binding.viewPager.currentItem = fragmentList.size / 2
        // binding.viewPager.setPageTransformer(ZoomTransformer())
        //binding.viewPager.setPageTransformer(CarouselTransformer())
        // binding.viewPager.setPageTransformer(GalleryTransformer())
        binding.viewPager.offscreenPageLimit = 1
        binding.viewPager.setPageTransformer(CustomPageTransformer())

        TabLayoutMediator(binding.bottomTab, binding.viewPager) { tab, position ->
            tab.text = getString(SpacePhotos.values()[position].title)
        }.attach()

    }

}