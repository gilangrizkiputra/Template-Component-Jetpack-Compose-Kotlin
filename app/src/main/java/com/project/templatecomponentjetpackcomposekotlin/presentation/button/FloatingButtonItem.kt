package com.project.templatecomponentjetpackcomposekotlin.presentation.button

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.templatecomponentjetpackcomposekotlin.R

@Composable
fun FloatingItemButton(
    modifier: Modifier = Modifier,
    iconContent : Int,
    iconContentImageVector: ImageVector,
    onFloatingButtonClick : () -> Unit
) {
    FloatingActionButton(
        onClick = {
            //TODO
        },
        containerColor = Color.Blue,
        modifier = Modifier
            .clip(CircleShape)
    ) {

        //import icons from material icons
        Icon(
            painter = painterResource(id = iconContent),
            contentDescription = "cart",
            tint = Color.White,
            modifier = Modifier
        )

        //import icons from library
//        Icon(
//            imageVector = iconContentImageVector,
//            contentDescription = "cart",
//            tint = Color.White,
//            modifier = Modifier
//        )

    }
}

@Composable
fun FloatingItemButtonCall(
    modifier: Modifier = Modifier,
    onFloatingButtonClick: () -> Unit
) {
    FloatingItemButton(
        modifier = modifier,
        iconContent = R.drawable.ic_kalender,
        iconContentImageVector = Icons.Rounded.Add,
        onFloatingButtonClick = onFloatingButtonClick
    )
}

@Preview
@Composable
private fun FloatingItemButtonPrev() {
    FloatingItemButtonCall {}

}