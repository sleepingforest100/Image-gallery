package kz.just_code.viewpager

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class SpacePhotos(@DrawableRes val image: Int, @StringRes val title: Int) {
PHOTO_1(R.drawable.photo_1, R.string.space1),
    PHOTO_2(R.drawable.photo_2, R.string.space2),
    PHOTO_3(R.drawable.photo_3, R.string.space3),
    PHOTO_4(R.drawable.photo_4, R.string.space4)

}