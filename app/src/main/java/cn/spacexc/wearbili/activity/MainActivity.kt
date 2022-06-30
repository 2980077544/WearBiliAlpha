package cn.spacexc.wearbili.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import cn.spacexc.wearbili.adapter.MainViewPagerAdapter
import cn.spacexc.wearbili.databinding.ActivityMainBinding
import cn.spacexc.wearbili.utils.TimeUtils
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager2.adapter = MainViewPagerAdapter(this)
        //TimeThread(binding.timeText, binding.viewPager2, "HomePage").start()
        if(cn.spacexc.wearbili.manager.UserManager.getUserCookie() == null) binding.viewPager2.currentItem = 2

        lifecycleScope.launch{
            while (true){
                binding.timeText.text = TimeUtils.getCurrentTime()
                binding.pageName.text = (when (binding.viewPager2.currentItem) {
                    0 -> "推荐"
                    1 -> "搜索"
                    2 -> "我的"
                    else -> ""
                })
                delay(500)
            }
        }
    }
}