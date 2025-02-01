package com.project.templatecomponentjetpackcomposekotlin.presentation.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.templatecomponentjetpackcomposekotlin.ui.theme.poppinsFontFamily

@Composable
fun ButtonItem(
    modifier: Modifier = Modifier,
    text: String,
    onButtonClick: () -> Unit,
) {
    Button(
        onClick = onButtonClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        Text(
            text = text,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}

@Composable
fun ButtonItemContent(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit
) {
    ButtonItem(
        modifier = modifier,
        text = "Button",
        onButtonClick = onButtonClick
    )
}

@Preview
@Composable
private fun ButtonItemPrev() {
    ButtonItemContent {}
}