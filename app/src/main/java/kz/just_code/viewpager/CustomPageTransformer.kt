package kz.just_code.viewpager


import android.view.View
import androidx.viewpager2.widget.ViewPager2.PageTransformer
import kotlin.math.abs

class CustomPageTransformer : PageTransformer {
    override fun transformPage(page: View, position: Float) {
        val absPosition = abs(position)

        val pageWidth = page.width
        val scaleFactor = 0.85f

        // Если страница справа (свайп влево)
        if (position >= 0) {
            page.alpha = 1f
            page.scaleX = 1 - absPosition * (1 - scaleFactor)
            page.scaleY = 1 - absPosition * (1 - scaleFactor)
            page.translationX = 0f
        }
        // Если страница слева (свайп вправо)
        else {
            page.alpha = 1f
            page.scaleX = 1 - absPosition * (1 - scaleFactor)
            page.scaleY = 1 - absPosition * (1 - scaleFactor)
            // Смещение вправо, чтобы страница выходила поверх
            page.translationX = pageWidth * absPosition
        }
    }
}







