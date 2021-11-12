package codelabskotlin.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    //essa anotações com @ garantem que a ordem de dados recebida sera id do texto e depois id da imagem
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {
}